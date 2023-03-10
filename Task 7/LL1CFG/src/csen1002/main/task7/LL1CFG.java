package csen1002.main.task7;

import java.util.*;

/**
 * Write your info here
 *
 * @name Mohamed Ahmed Helmy Elsayed Ali
 * @id 43-9565
 * @labNumber 15
 */
public class LL1CFG {
    HashMap<String, HashMap<String, String>> parsingTable;

    /**
     * LL1 CFG constructor
     *
     * @param description is the string describing an LL(1) CFG, first, and follow as represented in the task description.
     */
    public LL1CFG(String description) {
        HashSet<String> variables = new HashSet<>();
        HashSet<String> terminals = new HashSet<>();
        for (int i=0; i<description.length(); i++) {
            if (description.charAt(i) >= 'A' && description.charAt(i) <= 'Z')
                variables.add(Character.toString(description.charAt(i)));
            else if (description.charAt(i) != 'e' && description.charAt(i) >= 'a' && description.charAt(i) <= 'z')
                terminals.add(Character.toString(description.charAt(i)));
        }

        parsingTable = new HashMap<>();
        for (String variable : variables) {
            HashMap<String, String> columns = new HashMap<>();
            for (String terminal : terminals)
                columns.put(terminal, null);
            columns.put("$", null);
            parsingTable.put(variable, columns);
        }

        String[] hashtagSplit = description.split("#");
        String[] ruleSemicolonSplit = hashtagSplit[0].split(";");
        HashMap<String, ArrayList<String>> rulesMap = new HashMap<>();
        for (String rule : ruleSemicolonSplit) {
            String[] commaSplit = rule.split(",");
            rulesMap.put(commaSplit[0], new ArrayList<>(Arrays.asList(commaSplit).subList(1, commaSplit.length)));
        }

        String[] firstSemicolonSplit = hashtagSplit[1].split(";");
        HashMap<String, ArrayList<String>> firstMap = new HashMap<>();
        for (String firstSets : firstSemicolonSplit) {
            String[] commaSplit = firstSets.split(",");
            firstMap.put(commaSplit[0], new ArrayList<>(Arrays.asList(commaSplit).subList(1, commaSplit.length)));
        }

        String[] followSemicolonSplit = hashtagSplit[2].split(";");
        HashMap<String, String> followMap = new HashMap<>();
        for (String followSet : followSemicolonSplit) {
            String[] commaSplit = followSet.split(",");
            followMap.put(commaSplit[0], commaSplit[1]);
        }

        for (String variable : variables) {
            ArrayList<String> firstSets = firstMap.get(variable);
            for (int i=0; i<firstSets.size(); i++) {
                String set = firstSets.get(i);
                for (int j=0; j<set.length(); j++) {
                    if (set.charAt(j) == 'e') {
                        String followSet = followMap.get(variable);
                        for (int k=0; k<followSet.length(); k++)
                            parsingTable.get(variable).put(Character.toString(followSet.charAt(k)), rulesMap.get(variable).get(i));
                    }
                    else
                        parsingTable.get(variable).put(Character.toString(set.charAt(j)), rulesMap.get(variable).get(i));
                }
            }
        }
    }
    /**
     * Returns A string encoding a derivation is a comma-separated sequence of sentential forms each representing a step in the derivation..
     *
     * @param input is the string to be parsed by the LL(1) CFG.
     * @return returns a string encoding a left-most derivation.
     */
    public String parse(String input) {
        StringBuilder output = new StringBuilder("S");
        Stack<Character> stack = new Stack<>();
        stack.push('S');
        int i = 0;
        while (!stack.isEmpty()) {
            char top = stack.pop();
            char currentChar = '$';
            if (i < input.length())
                currentChar = input.charAt(i);
            if (top >= 'A' && top <= 'Z') {
                String rule = parsingTable.get(Character.toString(top)).get(Character.toString(currentChar));
                if (rule == null) {
                    output.append(",ERROR");
                    break;
                }
                if (!rule.equals("e")) {
                    for (int j=rule.length()-1; j>=0; j--)
                        stack.push(rule.charAt(j));
                }
                output.append(",");
                if (i > 0)
                    output.append(input, 0, i);
                StringBuilder stackContent = new StringBuilder();
                for (Character c : stack)
                    stackContent.insert(0, c);
                output.append(stackContent);
            }
            else {
                if (top == currentChar)
                    i++;
                else {
                    output.append(",ERROR");
                    break;
                }
            }
        }
        return output.toString();
    }

    public static void main(String[] args) {
        LL1CFG ll1CFG = new LL1CFG("S,iST,e;T,cS,a#S,i,e;T,c,a#S,ca$;T,ca$");
        System.out.println(ll1CFG.parse("iia"));
    }
}

package csen1002.main.task6;

import java.util.*;

/**
 * Write your info here
 *
 * @name Mohamed Ahmed Helmy Elsayed Ali
 * @id 43-9565
 * @labNumber 15
 */

public class FFCFG {
    ArrayList<String> variables;
    HashSet<String> terminals;
    HashMap<String, ArrayList<String>> rulesMap;
    HashMap<String, TreeSet<String>> firstMap;
    HashMap<String, TreeSet<String>> followMap;

    /**
     * Constructs a CFG for which the First and Follow are to be computed
     *
     * @param description A string representation of a CFG as specified in the task
     *                    description
     */
    public FFCFG(String description) {
        // TODO Auto-generated constructor stub
        variables = new ArrayList<>();
        terminals = new HashSet<>();
        rulesMap = new HashMap<>();
        firstMap = new HashMap<>();
        followMap = new HashMap<>();
        for (int i=0; i<description.length(); i++) {
            if (description.charAt(i) != 'e' && description.charAt(i) >= 'a' && description.charAt(i) <= 'z') {
                String terminal = Character.toString(description.charAt(i));
                terminals.add(terminal);
                TreeSet<String> treeSet = new TreeSet<>();
                treeSet.add(terminal);
                firstMap.put(terminal, treeSet);
            }
        }
        String[] semicolonSplit = description.split(";");
        for (String s : semicolonSplit) {
            String[] commaSplit = s.split(",");
            ArrayList<String> productions = new ArrayList<>(List.of(commaSplit));
            String variable = productions.remove(0);
            variables.add(variable);
            firstMap.put(variable, new TreeSet<>());
            followMap.put(variable, new TreeSet<>());
            rulesMap.put(variable, productions);
        }
        followMap.get("S").add("$");
    }

    public TreeSet<String> firstIntersection(String rule, int end) {
        TreeSet<String> intersection = new TreeSet<>(firstMap.get(Character.toString(rule.charAt(0))));
        for (int i=1; i<=end; i++)
            intersection.retainAll(firstMap.get(Character.toString(rule.charAt(i))));
        return intersection;
    }

    /**
     * Calculates the First of each variable in the CFG.
     *
     * @return A string representation of the First of each variable in the CFG,
     *         formatted as specified in the task description.
     */
    public String first() {
        // TODO Auto-generated method stub
        boolean change = true;
        while (change) {
            change = false;
            for (String var : variables) {
                ArrayList<String> rules = rulesMap.get(var);
                for (String rule : rules) {
                    if (rule.equals("e") || firstIntersection(rule, rule.length()-1).contains("e")) {
                        if (!firstMap.get(var).contains("e")) {
                            firstMap.get(var).add("e");
                            change = true;
                        }
                    }
                    if (!rule.equals("e")) {
                        for (int i=0; i<rule.length(); i++) {
                            if (i==0 || firstIntersection(rule, i-1).contains("e")) {
                                TreeSet<String> firstOfElement = new TreeSet<>(firstMap.get(Character.toString(rule.charAt(i))));
                                firstOfElement.remove("e");
                                if (firstOfElement.size() != 0 && !firstMap.get(var).containsAll(firstOfElement)) {
                                    firstMap.get(var).addAll(firstOfElement);
                                    change = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        StringBuilder output = new StringBuilder();
        for (String var : variables) {
            output.append(var).append(",");
            for (String element : firstMap.get(var))
                output.append(element);
            output.append(";");
        }
        output.deleteCharAt(output.length()-1);
        return output.toString();
    }

    public TreeSet<String> firstOfSentential(String sentential) {
        int epsilonCount = 0;
        TreeSet<String> output = new TreeSet<>();
        for (int i=0; i<sentential.length(); i++) {
            TreeSet<String> first = new TreeSet<>(firstMap.get(Character.toString(sentential.charAt(i))));
            boolean epsilonExist = first.remove("e");
            output.addAll(first);
            if (epsilonExist)
                epsilonCount++;
            else
                break;
        }
        if (epsilonCount == sentential.length())
            output.add("e");
        return output;
    }

    /**
     * Calculates the Follow of each variable in the CFG.
     *
     * @return A string representation of the Follow of each variable in the CFG,
     *         formatted as specified in the task description.
     */
    public String follow() {
        // TODO Auto-generated method stub
        first();
        boolean change = true;
        while (change) {
            change = false;
            for (String var : variables) {
                ArrayList<String> rules = rulesMap.get(var);
                for (String rule : rules) {
                    for (int i=0; i<rule.length(); i++) {
                        if (rule.charAt(i) >= 'A' && rule.charAt(i) <= 'Z') {
                            String sentential = "";
                            if (i != rule.length()-1)
                                sentential = rule.substring(i+1);
                            TreeSet<String> firstOfSentential = firstOfSentential(sentential);
                            boolean epsilonExist = firstOfSentential.remove("e");
                            if (firstOfSentential.size() != 0 && !followMap.get(Character.toString(rule.charAt(i))).containsAll(firstOfSentential)) {
                                followMap.get(Character.toString(rule.charAt(i))).addAll(firstOfSentential);
                                change = true;
                            }
                            if (epsilonExist) {
                                if (!followMap.get(Character.toString(rule.charAt(i))).containsAll(followMap.get(var))) {
                                    followMap.get(Character.toString(rule.charAt(i))).addAll(followMap.get(var));
                                    change = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        StringBuilder output = new StringBuilder();
        for (String var : variables) {
            output.append(var).append(",");
            boolean dollarSign = false;
            for (String element : followMap.get(var)) {
                if (element.equals("$"))
                    dollarSign = true;
                else
                    output.append(element);
            }
            if (dollarSign)
                output.append("$");
            output.append(";");
        }
        output.deleteCharAt(output.length()-1);
        return output.toString();
    }

    public static void main(String[] args) {
        String description = "S,aBDh;B,cA;A,bA,e;D,EF;E,g,e;F,f,e";
        FFCFG ffcfg = new FFCFG(description);
        System.out.println(ffcfg.first());
        System.out.println(ffcfg.follow());
    }
}

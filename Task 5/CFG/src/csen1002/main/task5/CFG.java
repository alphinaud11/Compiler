package csen1002.main.task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Write your info here
 *
 * @name Mohamed Ahmed Helmy Elsayed Ali
 * @id 43-9565
 * @labNumber 15
 */
public class CFG {
    ArrayList<String> variables;
    HashMap<String, ArrayList<String>> rules;

    /**
     * CFG constructor
     *
     * @param description is the string describing a CFG
     */
    public CFG(String description) {
        // TODO Write Your Code Here
        variables = new ArrayList<>();
        rules = new HashMap<>();
        String[] semicolonSplit = description.split(";");
        for (String s : semicolonSplit) {
            String[] commaSplit = s.split(",");
            ArrayList<String> productions = new ArrayList<>(List.of(commaSplit));
            String variable = productions.remove(0);
            variables.add(variable);
            rules.put(variable, productions);
        }
    }

    /**
     * Returns a string of elimnated left recursion.
     *
     * @param input is the string to simulate by the CFG.
     * @return string of elimnated left recursion.
     */
    public String lre() {
        // TODO Write Your Code Here
        StringBuilder output = new StringBuilder();

        for (String variable : variables) {
            // substitution phase
            while (true) {
                boolean substitutionsDone = false;
                ArrayList<String> productions = rules.get(variable);
                ArrayList<String> newProductions = new ArrayList<>();
                for (String production : productions) {
                    char firstLetter = production.charAt(0);
                    if (Character.isUpperCase(firstLetter) && variables.indexOf(Character.toString(firstLetter)) < variables.indexOf(variable)) {
                        substitutionsDone = true;
                        ArrayList<String> firstLetterProductions = rules.get(Character.toString(firstLetter));
                        String productionMinusFirstLetter = production.length() == 1 ? "" : production.substring(1);
                        for (String firstLetterProduction : firstLetterProductions) {
                            String newProduction = firstLetterProduction + productionMinusFirstLetter;
                            newProductions.add(newProduction);
                        }
                    }
                    else {
                        newProductions.add(production);
                    }
                }
                rules.put(variable, newProductions);
                if (!substitutionsDone)
                    break;
            }

            // left recursion elimination phase
            String dashVariable = variable + "'";
            ArrayList<String> originalProductions = rules.get(variable);
            boolean leftRecursionExists = false;
            for (String production : originalProductions) {
                char firstLetter = production.charAt(0);
                if (variable.equals(Character.toString(firstLetter))) {
                    leftRecursionExists = true;
                    break;
                }
            }
            if (leftRecursionExists) {
                ArrayList<String> newProductions = new ArrayList<>();
                ArrayList<String> dashProductions = new ArrayList<>();
                for (String production : originalProductions) {
                    char firstLetter = production.charAt(0);
                    if (variable.equals(Character.toString(firstLetter))) {
                        String dashProduction = production.substring(1) + dashVariable;
                        dashProductions.add(dashProduction);
                    }
                    else {
                        String newProduction = production + dashVariable;
                        newProductions.add(newProduction);
                    }
                }
                dashProductions.add("e");
                rules.put(variable, newProductions);
                rules.put(dashVariable, dashProductions);
            }

            output.append(variable).append(",");
            ArrayList<String> productions = rules.get(variable);
            for (int i=0; i<productions.size(); i++) {
                output.append(productions.get(i));
                if (i != productions.size()-1)
                    output.append(",");
            }
            output.append(";");
            if (rules.containsKey(dashVariable)) {
                output.append(dashVariable).append(",");
                ArrayList<String> dashProductions = rules.get(dashVariable);
                for (int i=0; i<dashProductions.size(); i++) {
                    output.append(dashProductions.get(i));
                    if (i != dashProductions.size()-1)
                        output.append(",");
                }
                output.append(";");
            }
        }

        output.deleteCharAt(output.length()-1);
        return output.toString();
    }

    public static void main(String[] args) {
        CFG cfg = new CFG("S,ScT,Sa,T,b;T,aSb,iaLb,i;L,SdL,S");
        System.out.println(cfg.lre());
    }
}

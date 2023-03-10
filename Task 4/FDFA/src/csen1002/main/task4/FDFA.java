package csen1002.main.task4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

/**
 * Write your info here
 *
 * @name Mohamed Ahmed Helmy Elsayed Ali
 * @id 43-9565
 * @labNumber 15
 */

class TransitionAction {
    int zeroTransition;
    int oneTransition;
    String action;

    TransitionAction(int zeroTransition, int oneTransition, String action) {
        this.zeroTransition = zeroTransition;
        this.oneTransition = oneTransition;
        this.action = action;
    }
}

public class FDFA {
    HashMap<Integer, TransitionAction> FDFA_Table;
    HashSet<Integer> acceptStates;
    String input;
    Stack<Integer> stack;

    /**
     * FDFA constructor
     *
     * @param description is the string describing a FDFA
     */
    public FDFA(String description) {
        // TODO Write Your Code Here
        String[] hashtagSplit = description.split("#");
        String[] semicolonSplit = hashtagSplit[0].split(";");
        FDFA_Table = new HashMap<>();
        for (String s : semicolonSplit) {
            String[] commaSplit = s.split(",");
            FDFA_Table.put(Integer.parseInt(commaSplit[0]), new TransitionAction(Integer.parseInt(commaSplit[1]), Integer.parseInt(commaSplit[2]), commaSplit[3]));
        }

        String[] acceptSplit = hashtagSplit[1].split(",");
        acceptStates = new HashSet<>();
        for (String s : acceptSplit)
            acceptStates.add(Integer.parseInt(s));

        stack = new Stack<>();
    }

    public String helper() {
        String output = "";
        int lastState = stack.peek();

        boolean acceptStateExist = false;
        int l = input.length();
        while (!stack.isEmpty()) {
            int state = stack.pop();
            if (acceptStates.contains(state)) {
                acceptStateExist = true;
                if (l == input.length()) {
                    output += input + "," + FDFA_Table.get(state).action + ";";
                    input = "";
                }
                else {
                    String left = input.substring(0, l);
                    input = input.substring(l);
                    output += left + "," + FDFA_Table.get(state).action + ";";
                    stack.clear();
                    int currentState = 0;
                    stack.push(currentState);
                    for (int i=0; i<input.length(); i++) {
                        TransitionAction transitionAction = FDFA_Table.get(currentState);
                        if (input.charAt(i) == '0')
                            currentState = transitionAction.zeroTransition;
                        else
                            currentState = transitionAction.oneTransition;
                        stack.push(currentState);
                    }
                }
                break;
            }
            l--;
        }

        if (!acceptStateExist) {
            output = input + "," + FDFA_Table.get(lastState).action + ";";
            input = "";
        }

        return output;
    }

    /**
     * Returns a string of actions.
     *
     * @param input is the string to simulate by the FDFA.
     * @return string of actions.
     */
    public String run(String input) {
        // TODO Write Your Code Here
        this.input = input;
        StringBuilder output = new StringBuilder();
        int currentState = 0;
        stack.push(currentState);

        for (int i=0; i<this.input.length(); i++) {
            TransitionAction transitionAction = FDFA_Table.get(currentState);
            if (this.input.charAt(i) == '0')
                currentState = transitionAction.zeroTransition;
            else
                currentState = transitionAction.oneTransition;
            stack.push(currentState);
        }

        while (!this.input.equals(""))
            output.append(helper());

        return output.toString();
    }

    public static void main(String[] args) {
        String description = "0,1,0,N;1,1,2,O;2,3,1,P;3,3,4,Q;4,3,4,A#4";
        FDFA fdfa = new FDFA(description);
        String input = "01011000";
        System.out.println(fdfa.run(input));
    }
}

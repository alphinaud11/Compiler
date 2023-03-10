package csen1002.main.task1;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Write your info here
 *
 * @name Mohamed Ahmed Helmy Elsayed Ali
 * @id 43-9565
 * @labNumber 15
 */
public class DFA {

    HashMap<Integer, int[]> transition;
    HashSet<Integer> acceptedStates;

    /**
     * DFA constructor
     *
     * @param description is the string describing a DFA
     */
    public DFA(String description) {
        // TODO Write Your Code Here
        String[] hashtagSplit = description.split("#");
        String[] commaSplit = hashtagSplit[1].split(",");
        acceptedStates = new HashSet<>();
        for (String state : commaSplit) {
            acceptedStates.add(Integer.valueOf(state));
        }

        String[] semicolonSplit = hashtagSplit[0].split(";");
        transition = new HashMap<>();
        for (String triplet : semicolonSplit) {
            String[] tripletSplit = triplet.split(",");
            transition.put(Integer.valueOf(tripletSplit[0]), new int[]{Integer.parseInt(tripletSplit[1]), Integer.parseInt(tripletSplit[2])});
        }
    }

    /**
     * Returns true if the string is accepted by the DFA and false otherwise.
     *
     * @param input is the string to check by the DFA.
     * @return if the string is accepted or not.
     */
    public boolean run(String input) {
        // TODO Write Your Code Here
        int lastState = transition.get(0)[Character.getNumericValue(input.charAt(0))];
        for (int i=1; i<input.length(); i++) {
            lastState = transition.get(lastState)[Character.getNumericValue(input.charAt(i))];
        }
        return acceptedStates.contains(lastState);
    }

    public static void main(String[] args) {
        
    }
}

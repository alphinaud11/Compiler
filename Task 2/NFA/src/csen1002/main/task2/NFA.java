package csen1002.main.task2;

import java.util.*;

/**
 * Write your info here
 *
 * @name Mohamed Ahmed Helmy Elsayed Ali
 * @id 43-9565
 * @labNumber 15
 */
public class NFA{

    ArrayList<Integer>[][] NFA_Table;
    HashSet<Integer> NFA_AcceptedStates;

    HashMap<String, String[]> DFA_Table;
    HashSet<Integer> visitedStates;
    HashSet<String> DFA_AcceptedStates;
    String startStateSTR;

    /**
     * NFA constructor
     *
     * @param description is the string describing a NFA
     */
    public NFA(String description) {
        // TODO Write Your Code Here

        // NFA table initialization, 1st column = 0 transition, 2nd column = 1 transition, 3rd column = epsilon transition
        int n = getStatesCount(description);
        //System.out.println(n);
        NFA_Table = new ArrayList[n][3];
        for (int i=0; i<n; i++)
            for (int j=0; j<3; j++)
                NFA_Table[i][j] = new ArrayList<>();

        // populating the NFA table
        String[] hashtagSplit = description.split("#");
        for (int i=0; i<3; i++) {
            String[] transitions = hashtagSplit[i].split(";");
            for (String transition : transitions) {
                String[] split = transition.split(",");
                int source = Integer.parseInt(split[0]);
                int destination = Integer.parseInt(split[1]);
                NFA_Table[source][i].add(destination);
            }
        }

        // saving the NFA acceptance states
        String[] commaSplit = hashtagSplit[3].split(",");
        NFA_AcceptedStates = new HashSet<>();
        for (String state : commaSplit) {
            NFA_AcceptedStates.add(Integer.valueOf(state));
        }

        // DFA table initialization, key = state name, 1st value = 0 transition, 2nd value = 1 transition
        DFA_Table = new HashMap<>();
        DFA_AcceptedStates = new HashSet<>();
        ArrayList<TreeSet<Integer>> statesToBeCompleted = new ArrayList<>();

        // inserting the dead state row
        DFA_Table.put("-1", new String[]{"-1", "-1"});

        // getting the start state
        visitedStates = new HashSet<>();
        TreeSet<Integer> DFAStartState = getEpsilonClosure(0);
        visitedStates.clear();
        statesToBeCompleted.add(DFAStartState);
        startStateSTR = DFAStartState.toString();

        // populating the DFA table
        while (!statesToBeCompleted.isEmpty()) {
            TreeSet<Integer> compositeState = statesToBeCompleted.remove(0);
            String compositeStateSTR = compositeState.toString();

            if (!DFA_Table.containsKey(compositeStateSTR)) {
                TreeSet<Integer> zeroTransition = new TreeSet<>();
                TreeSet<Integer> oneTransition = new TreeSet<>();
                String zeroTransitionSTR = "-1";
                String oneTransitionSTR = "-1";
                for (int s : compositeState) {
                    for (int k : NFA_Table[s][0]) {
                        zeroTransition.addAll(getEpsilonClosure(k));
                        visitedStates.clear();
                    }
                    for (int k : NFA_Table[s][1]) {
                        oneTransition.addAll(getEpsilonClosure(k));
                        visitedStates.clear();
                    }
                }
                if (!zeroTransition.isEmpty()) {
                    statesToBeCompleted.add(zeroTransition);
                    zeroTransitionSTR = zeroTransition.toString();
                }
                if (!oneTransition.isEmpty()) {
                    statesToBeCompleted.add(oneTransition);
                    oneTransitionSTR = oneTransition.toString();
                }
                DFA_Table.put(compositeStateSTR, new String[]{zeroTransitionSTR, oneTransitionSTR});

                for (int s : compositeState) {
                    if (NFA_AcceptedStates.contains(s)) {
                        DFA_AcceptedStates.add(compositeStateSTR);
                        break;
                    }
                }
            }
        }
    }

    public int getStatesCount(String description) {
        HashSet<String> uniqueElements = new HashSet<>();
        String[] split = description.split("[,;#]");
        Collections.addAll(uniqueElements, split);
        int x = -1;
        for (String s : uniqueElements) {
            if (Integer.parseInt(s) > x)
                x = Integer.parseInt(s);
        }
        return x+1;
    }

    public TreeSet<Integer> getEpsilonClosure(int state) {
        TreeSet<Integer> epsilonClosure = new TreeSet<>();
        if (visitedStates.contains(state))
            return epsilonClosure;
        epsilonClosure.add(state);
        visitedStates.add(state);
        for (int s : NFA_Table[state][2]) {
            epsilonClosure.addAll(getEpsilonClosure(s));
        }
        return epsilonClosure;
    }

    /**
     * Returns true if the string is accepted by the NFA and false otherwise.
     *
     * @param input is the string to check by the NFA.
     * @return if the string is accepted or not.
     */
    public boolean run(String input) {
        // TODO Write Your Code Here
        String lastState = DFA_Table.get(startStateSTR)[Character.getNumericValue(input.charAt(0))];
        for (int i=1; i<input.length(); i++) {
            lastState = DFA_Table.get(lastState)[Character.getNumericValue(input.charAt(i))];
        }
        return DFA_AcceptedStates.contains(lastState);
    }

    public static void main(String[] args) {
        //String description = "1,2;4,5;8,9#3,4;6,7#0,1;0,3;2,1;2,3;5,6;5,8;7,10;9,10#10";
        //String description = "0,1;9,10;11,12;12,13#2,3;13,14#1,2;1,4;3,6;4,5;5,6;6,7;6,19;7,8;7,16;8,9;8,11;10,15;14,15;15,18;18,7;18,19#19";
        //NFA nfa = new NFA(description);
        //for (String key : nfa.DFA_Table.keySet()) {
          //  System.out.println(key + ": " + nfa.DFA_Table.get(key)[0] + " / " + nfa.DFA_Table.get(key)[1]);
        //}
    }
}

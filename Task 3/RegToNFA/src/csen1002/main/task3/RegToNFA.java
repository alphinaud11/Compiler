package csen1002.main.task3;

import java.util.*;

/**
 * Write your info here
 *
 * @name Mohamed Ahmed Helmy Elsayed Ali
 * @id 43-9565
 * @labNumber 15
 */

class Transition{
    int source;
    TreeSet<Integer>[] destinations;

    Transition(int source, TreeSet<Integer>[] destinations) {
        this.source = source;
        this.destinations = destinations;
    }
}

class NFA {
    int startState;
    int acceptState;
    ArrayList<Transition> transitionsTable;

    NFA(int stateCounter) {
        startState = stateCounter;
        acceptState = stateCounter + 1;
        transitionsTable = new ArrayList<>();
    }
}

public class RegToNFA {
    int stateCounter;
    Stack<NFA> stack;

    /**
     * Constructs an NFA corresponding to a regular expression based on Thompson's
     * construction
     *
     * @param regex The regular expression in postfix notation for which the NFA is
     *              to be constructed
     */
    public RegToNFA(String regex) {
        // TODO Auto-generated constructor stub
        stateCounter = 0;
        stack = new Stack<>();

        for (int i=0; i<regex.length(); i++) {
            char c = regex.charAt(i);
            if (c == '0') {
                NFA zeroNFA = new NFA(stateCounter);
                stateCounter += 2;
                TreeSet<Integer>[] transitions = new TreeSet[3];
                for (int j=0; j<3; j++)
                    transitions[j] = new TreeSet<>();
                transitions[0].add(zeroNFA.acceptState);
                zeroNFA.transitionsTable.add(new Transition(zeroNFA.startState, transitions));
                stack.push(zeroNFA);
            }
            else if (c == '1') {
                NFA oneNFA = new NFA(stateCounter);
                stateCounter += 2;
                TreeSet<Integer>[] transitions = new TreeSet[3];
                for (int j=0; j<3; j++)
                    transitions[j] = new TreeSet<>();
                transitions[1].add(oneNFA.acceptState);
                oneNFA.transitionsTable.add(new Transition(oneNFA.startState, transitions));
                stack.push(oneNFA);
            }
            else if (c == 'e') {
                NFA epsilonNFA = new NFA(stateCounter);
                stateCounter += 2;
                TreeSet<Integer>[] transitions = new TreeSet[3];
                for (int j=0; j<3; j++)
                    transitions[j] = new TreeSet<>();
                transitions[2].add(epsilonNFA.acceptState);
                epsilonNFA.transitionsTable.add(new Transition(epsilonNFA.startState, transitions));
                stack.push(epsilonNFA);
            }
            else if (c == '|') {
                NFA nfa2 = stack.pop();
                NFA nfa1 = stack.pop();
                // getting old nfa1 start and accept states
                int oldNFA1Start = nfa1.startState;
                int oldNFA1Accept = nfa1.acceptState;
                // updating nfa1 start and accept states
                nfa1.startState = stateCounter++;
                nfa1.acceptState = stateCounter++;
                // adding transitions from new start state to old nfa1 and nfa2 start states
                TreeSet<Integer>[] startStateTransitions = new TreeSet[3];
                for (int j=0; j<3; j++)
                    startStateTransitions[j] = new TreeSet<>();
                startStateTransitions[2].add(oldNFA1Start);
                startStateTransitions[2].add(nfa2.startState);
                nfa1.transitionsTable.add(new Transition(nfa1.startState, startStateTransitions));
                // adding transition from old nfa1 accept state to new one
                TreeSet<Integer>[] oldNFA1AcceptToNew = new TreeSet[3];
                for (int j=0; j<3; j++)
                    oldNFA1AcceptToNew[j] = new TreeSet<>();
                oldNFA1AcceptToNew[2].add(nfa1.acceptState);
                nfa1.transitionsTable.add(new Transition(oldNFA1Accept, oldNFA1AcceptToNew));
                // adding transition from old nfa2 accept state to new one
                TreeSet<Integer>[] oldNFA2AcceptToNew = new TreeSet[3];
                for (int j=0; j<3; j++)
                    oldNFA2AcceptToNew[j] = new TreeSet<>();
                oldNFA2AcceptToNew[2].add(nfa1.acceptState);
                nfa1.transitionsTable.add(new Transition(nfa2.acceptState, oldNFA2AcceptToNew));
                // finally, adding all transitions from nfa2 to nfa1 (Merge)
                nfa1.transitionsTable.addAll(nfa2.transitionsTable);
                stack.push(nfa1);
            }
            else if (c == '*') {
                NFA nfa = stack.pop();
                // getting old nfa start and accept states
                int oldStart = nfa.startState;
                int oldAccept = nfa.acceptState;
                // updating nfa start and accept states
                nfa.startState = stateCounter++;
                nfa.acceptState = stateCounter++;
                // adding transitions from new start to old start, and new accept states
                TreeSet<Integer>[] startStateTransitions = new TreeSet[3];
                for (int j=0; j<3; j++)
                    startStateTransitions[j] = new TreeSet<>();
                startStateTransitions[2].add(oldStart);
                startStateTransitions[2].add(nfa.acceptState);
                nfa.transitionsTable.add(new Transition(nfa.startState, startStateTransitions));
                // adding transitions from old accept to old start state, and new accept state
                TreeSet<Integer>[] oldAcceptStateTransitions = new TreeSet[3];
                for (int j=0; j<3; j++)
                    oldAcceptStateTransitions[j] = new TreeSet<>();
                oldAcceptStateTransitions[2].add(oldStart);
                oldAcceptStateTransitions[2].add(nfa.acceptState);
                nfa.transitionsTable.add(new Transition(oldAccept, oldAcceptStateTransitions));
                stack.push(nfa);
            }
            else if (c == '.') {
                NFA nfa2 = stack.pop();
                NFA nfa1 = stack.pop();
                // getting old nfa1 accept state
                int oldNFA1Accept = nfa1.acceptState;
                // updating nfa1 accept state
                nfa1.acceptState = nfa2.acceptState;
                // adding transition from old nfa1 accept state to nfa2 start state
                TreeSet<Integer>[] oldAcceptStateTransitions = new TreeSet[3];
                for (int j=0; j<3; j++)
                    oldAcceptStateTransitions[j] = new TreeSet<>();
                oldAcceptStateTransitions[2].add(nfa2.startState);
                nfa1.transitionsTable.add(new Transition(oldNFA1Accept, oldAcceptStateTransitions));
                // finally, adding all transitions from nfa2 to nfa1 (Merge)
                nfa1.transitionsTable.addAll(nfa2.transitionsTable);
                stack.push(nfa1);
            }
        }
    }

    /**
     * @return Returns a formatted string representation of the NFA. The string
     *         representation follows the one in the task description
     */
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        NFA nfa = stack.pop();
        nfa.transitionsTable.sort(Comparator.comparingInt(t -> t.source));
        String output = "";
        output += stateCounter + "#" + nfa.startState + "#" + nfa.acceptState + "#";
        StringBuilder zeroTransitionsSTR = new StringBuilder();
        StringBuilder oneTransitionsSTR = new StringBuilder();
        StringBuilder epsilonTransitionsSTR = new StringBuilder();
        for (Transition t : nfa.transitionsTable) {
            // zero transitions
            for (int s : t.destinations[0])
                zeroTransitionsSTR.append(t.source).append(",").append(s).append(";");
            // one transitions
            for (int s : t.destinations[1])
                oneTransitionsSTR.append(t.source).append(",").append(s).append(";");
            // epsilon transitions
            for (int s : t.destinations[2])
                epsilonTransitionsSTR.append(t.source).append(",").append(s).append(";");
        }
        // remove last semicolon
        if (zeroTransitionsSTR.length() > 0)
            zeroTransitionsSTR.deleteCharAt(zeroTransitionsSTR.length()-1);
        if (oneTransitionsSTR.length() > 0)
            oneTransitionsSTR.deleteCharAt(oneTransitionsSTR.length()-1);
        if (epsilonTransitionsSTR.length() > 0)
            epsilonTransitionsSTR.deleteCharAt(epsilonTransitionsSTR.length()-1);
        output += zeroTransitionsSTR + "#" + oneTransitionsSTR + "#" + epsilonTransitionsSTR;
        return output;
    }

    public static void main(String[] args) {
        String regex = "e01*|.0.*";
        RegToNFA regToNFA = new RegToNFA(regex);
        System.out.println(regToNFA);
    }
}

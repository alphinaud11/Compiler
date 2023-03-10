package csen1002.tests.task1;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task1.DFA;

public class Task1PrivateTestV7 {

    //////////1st DFA Strings Validation///////////////
    @Test
    @Timeout(5)
    public void testDFA1T1() {
        DFA dfa1 = new DFA("0,0,1;1,2,3;2,3,0;3,3,4;4,2,5;5,5,5#1,2,5");
        assertFalse(dfa1.run("101010100"));
    }
    @Test
    @Timeout(5)
    public void testDFA1T2() {
        DFA dfa1 = new DFA("0,0,1;1,2,3;2,3,0;3,3,4;4,2,5;5,5,5#1,2,5");
        assertTrue(dfa1.run("0110111"));
    }
    @Test
    @Timeout(5)
    public void testDFA1T3() {
        DFA dfa1 = new DFA("0,0,1;1,2,3;2,3,0;3,3,4;4,2,5;5,5,5#1,2,5");
        assertTrue(dfa1.run("110110"));
    }
    @Test
    @Timeout(5)
    public void testDFA1T4() {
        DFA dfa1 = new DFA("0,0,1;1,2,3;2,3,0;3,3,4;4,2,5;5,5,5#1,2,5");
        assertFalse(dfa1.run("1010100"));
    }
    @Test
    @Timeout(5)
    public void testDFA1T5() {
        DFA dfa1 = new DFA("0,0,1;1,2,3;2,3,0;3,3,4;4,2,5;5,5,5#1,2,5");
        assertFalse(dfa1.run("000100"));
    }
    //////////2nd DFA Strings Validation///////////////
    @Test
    @Timeout(5)
    public void testDFA2T1() {
        DFA dfa2 = new DFA("0,0,1;1,2,0;2,3,1;3,6,4;4,5,1;5,4,6;6,4,5#3,5");
        assertFalse(dfa2.run("10110101101"));
    }
    @Test
    @Timeout(5)
    public void testDFA2T2() {
        DFA dfa2 = new DFA("0,0,1;1,2,0;2,3,1;3,6,4;4,5,1;5,4,6;6,4,5#3,5");
        assertTrue(dfa2.run("010001"));
    }
    @Test
    @Timeout(5)
    public void testDFA2T3() {
        DFA dfa2 = new DFA("0,0,1;1,2,0;2,3,1;3,6,4;4,5,1;5,4,6;6,4,5#3,5");
        assertFalse(dfa2.run("0001101"));
    }
    @Test
    @Timeout(5)
    public void testDFA2T4() {
        DFA dfa2 = new DFA("0,0,1;1,2,0;2,3,1;3,6,4;4,5,1;5,4,6;6,4,5#3,5");
        assertTrue(dfa2.run("010001"));
    }
    @Test
    @Timeout(5)
    public void testDFA2T5() {
        DFA dfa2 = new DFA("0,0,1;1,2,0;2,3,1;3,6,4;4,5,1;5,4,6;6,4,5#3,5");
        assertTrue(dfa2.run("10010"));
    }

}
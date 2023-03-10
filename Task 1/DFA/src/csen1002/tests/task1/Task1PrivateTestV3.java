package csen1002.tests.task1;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task1.DFA;

public class Task1PrivateTestV3 {

    //////////1st DFA Strings Validation///////////////
    @Test
    @Timeout(5)
    public void testDFA1T1() {
        DFA dfa1 = new DFA("0,1,3;1,2,3;2,3,4;3,3,3;4,4,4#4");
        assertTrue(dfa1.run("00101101"));
    }
    @Test
    @Timeout(5)
    public void testDFA1T2() {
        DFA dfa1 = new DFA("0,1,3;1,2,3;2,3,4;3,3,3;4,4,4#4");
        assertFalse(dfa1.run("00"));
    }
    @Test
    @Timeout(5)
    public void testDFA1T3() {
        DFA dfa1 = new DFA("0,1,3;1,2,3;2,3,4;3,3,3;4,4,4#4");
        assertFalse(dfa1.run("011010"));
    }
    @Test
    @Timeout(5)
    public void testDFA1T4() {
        DFA dfa1 = new DFA("0,1,3;1,2,3;2,3,4;3,3,3;4,4,4#4");
        assertFalse(dfa1.run("110110"));
    }
    @Test
    @Timeout(5)
    public void testDFA1T5() {
        DFA dfa1 = new DFA("0,1,3;1,2,3;2,3,4;3,3,3;4,4,4#4");
        assertFalse(dfa1.run("0"));
    }
    //////////2nd DFA Strings Validation///////////////
    @Test
    @Timeout(5)
    public void testDFA2T1() {
        DFA dfa2 = new DFA("0,1,3;1,2,3;2,5,4;3,4,5;4,3,5;5,5,4#1,4");
        assertFalse(dfa2.run("0011000"));
    }
    @Test
    @Timeout(5)
    public void testDFA2T2() {
        DFA dfa2 = new DFA("0,1,3;1,2,3;2,5,4;3,4,5;4,3,5;5,5,4#1,4");
        assertTrue(dfa2.run("001"));
    }
    @Test
    @Timeout(5)
    public void testDFA2T3() {
        DFA dfa2 = new DFA("0,1,3;1,2,3;2,5,4;3,4,5;4,3,5;5,5,4#1,4");
        assertTrue(dfa2.run("01011"));
    }
    @Test
    @Timeout(5)
    public void testDFA2T4() {
        DFA dfa2 = new DFA("0,1,3;1,2,3;2,5,4;3,4,5;4,3,5;5,5,4#1,4");
        assertFalse(dfa2.run("010000"));
    }
    @Test
    @Timeout(5)
    public void testDFA2T5() {
        DFA dfa2 = new DFA("0,1,3;1,2,3;2,5,4;3,4,5;4,3,5;5,5,4#1,4");
        assertTrue(dfa2.run("0"));
    }

}

package csen1002.tests.task1;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task1.DFA;

public class Task1PrivateTestV6 {

    //////////1st DFA Strings Validation///////////////
    @Test
    @Timeout(5)
    public void testDFA1T1() {
        DFA dfa1 = new DFA("0,1,2;1,3,4;2,4,5;3,3,3;4,3,6;5,6,5;6,3,6#5,6");
        assertTrue(dfa1.run("10111"));
    }
    @Test
    @Timeout(5)
    public void testDFA1T2() {
        DFA dfa1 = new DFA("0,1,2;1,3,4;2,4,5;3,3,3;4,3,6;5,6,5;6,3,6#5,6");
        assertFalse(dfa1.run("01"));
    }
    @Test
    @Timeout(5)
    public void testDFA1T3() {
        DFA dfa1 = new DFA("0,1,2;1,3,4;2,4,5;3,3,3;4,3,6;5,6,5;6,3,6#5,6");
        assertFalse(dfa1.run("1"));
    }
    @Test
    @Timeout(5)
    public void testDFA1T4() {
        DFA dfa1 = new DFA("0,1,2;1,3,4;2,4,5;3,3,3;4,3,6;5,6,5;6,3,6#5,6");
        assertTrue(dfa1.run("111"));
    }
    @Test
    @Timeout(5)
    public void testDFA1T5() {
        DFA dfa1 = new DFA("0,1,2;1,3,4;2,4,5;3,3,3;4,3,6;5,6,5;6,3,6#5,6");
        assertFalse(dfa1.run("01011"));
    }
    //////////2nd DFA Strings Validation///////////////
    @Test
    @Timeout(5)
    public void testDFA2T1() {
        DFA dfa2 = new DFA("0,2,1;1,1,2;2,3,4;3,4,3;4,5,5;5,5,5#3,5");
        assertFalse(dfa2.run("10000100"));
    }
    @Test
    @Timeout(5)
    public void testDFA2T2() {
        DFA dfa2 = new DFA("0,2,1;1,1,2;2,3,4;3,4,3;4,5,5;5,5,5#3,5");
        assertTrue(dfa2.run("010100010110"));
    }
    @Test
    @Timeout(5)
    public void testDFA2T3() {
        DFA dfa2 = new DFA("0,2,1;1,1,2;2,3,4;3,4,3;4,5,5;5,5,5#3,5");
        assertFalse(dfa2.run("10000101110"));
    }
    @Test
    @Timeout(5)
    public void testDFA2T4() {
        DFA dfa2 = new DFA("0,2,1;1,1,2;2,3,4;3,4,3;4,5,5;5,5,5#3,5");
        assertTrue(dfa2.run("101011111"));
    }
    @Test
    @Timeout(5)
    public void testDFA2T5() {
        DFA dfa2 = new DFA("0,2,1;1,1,2;2,3,4;3,4,3;4,5,5;5,5,5#3,5");
        assertTrue(dfa2.run("1001001110"));
    }

}
package csen1002.tests.task1;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task1.DFA;

public class Task1PrivateTestV2 {

    //////////1st DFA Strings Validation///////////////
    @Test
    @Timeout(5)
    public void testDFA1T1() {
        DFA dfa1 = new DFA("0,1,3;1,3,2;2,2,2;3,3,3#2");
        assertFalse(dfa1.run("001"));
    }
    @Test
    @Timeout(5)
    public void testDFA1T2() {
        DFA dfa1 = new DFA("0,1,3;1,3,2;2,2,2;3,3,3#2");
        assertTrue(dfa1.run("0101101001"));
    }
    @Test
    @Timeout(5)
    public void testDFA1T3() {
        DFA dfa1 = new DFA("0,1,3;1,3,2;2,2,2;3,3,3#2");
        assertFalse(dfa1.run("100101001"));
    }
    @Test
    @Timeout(5)
    public void testDFA1T4() {
        DFA dfa1 = new DFA("0,1,3;1,3,2;2,2,2;3,3,3#2");
        assertTrue(dfa1.run("0111100100"));
    }
    @Test
    @Timeout(5)
    public void testDFA1T5() {
        DFA dfa1 = new DFA("0,1,3;1,3,2;2,2,2;3,3,3#2");
        assertFalse(dfa1.run("001011101"));
    }
    //////////2nd DFA Strings Validation///////////////
    @Test
    @Timeout(5)
    public void testDFA2T1() {
        DFA dfa2 = new DFA("0,1,3;1,0,2;2,3,1;3,2,0#0");
        assertFalse(dfa2.run("1111010"));
    }
    @Test
    @Timeout(5)
    public void testDFA2T2() {
        DFA dfa2 = new DFA("0,1,3;1,0,2;2,3,1;3,2,0#0");
        assertTrue(dfa2.run("0110101101"));
    }
    @Test
    @Timeout(5)
    public void testDFA2T3() {
        DFA dfa2 = new DFA("0,1,3;1,0,2;2,3,1;3,2,0#0");
        assertFalse(dfa2.run("1010100"));
    }
    @Test
    @Timeout(5)
    public void testDFA2T4() {
        DFA dfa2 = new DFA("0,1,3;1,0,2;2,3,1;3,2,0#0");
        assertTrue(dfa2.run("01010101010010"));
    }
    @Test
    @Timeout(5)
    public void testDFA2T5() {
        DFA dfa2 = new DFA("0,1,3;1,0,2;2,3,1;3,2,0#0");
        assertFalse(dfa2.run("01"));
    }

}
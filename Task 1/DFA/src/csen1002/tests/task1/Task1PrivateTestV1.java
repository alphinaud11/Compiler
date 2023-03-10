package csen1002.tests.task1;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task1.DFA;

public class Task1PrivateTestV1 {

    //////////1st DFA Strings Validation///////////////
    @Test
    @Timeout(5)
    public void testDFA1T1() {
        DFA dfa1 = new DFA("0,1,0;1,0,2;2,3,2;3,2,4;4,4,4#4");
        assertTrue(dfa1.run("110001101"));
    }
    @Test
    @Timeout(5)
    public void testDFA1T2() {
        DFA dfa1 = new DFA("0,1,0;1,0,2;2,3,2;3,2,4;4,4,4#4");
        assertTrue(dfa1.run("011010011"));
    }
    @Test
    @Timeout(5)
    public void testDFA1T3() {
        DFA dfa1 = new DFA("0,1,0;1,0,2;2,3,2;3,2,4;4,4,4#4");
        assertFalse(dfa1.run("10011"));
    }
    @Test
    @Timeout(5)
    public void testDFA1T4() {
        DFA dfa1 = new DFA("0,1,0;1,0,2;2,3,2;3,2,4;4,4,4#4");
        assertTrue(dfa1.run("0101"));
    }
    @Test
    @Timeout(5)
    public void testDFA1T5() {
        DFA dfa1 = new DFA("0,1,0;1,0,2;2,3,2;3,2,4;4,4,4#4");
        assertFalse(dfa1.run("010000111"));
    }
    //////////2nd DFA Strings Validation///////////////
    @Test
    @Timeout(5)
    public void testDFA2T1() {
        DFA dfa2 = new DFA("0,1,0;1,2,0;2,2,3;3,2,4;4,2,4#4");
        assertFalse(dfa2.run("001010110"));
    }
    @Test
    @Timeout(5)
    public void testDFA2T2() {
        DFA dfa2 = new DFA("0,1,0;1,2,0;2,2,3;3,2,4;4,2,4#4");
        assertTrue(dfa2.run("00110011"));
    }
    @Test
    @Timeout(5)
    public void testDFA2T3() {
        DFA dfa2 = new DFA("0,1,0;1,2,0;2,2,3;3,2,4;4,2,4#4");
        assertFalse(dfa2.run("0101011011"));
    }
    @Test
    @Timeout(5)
    public void testDFA2T4() {
        DFA dfa2 = new DFA("0,1,0;1,2,0;2,2,3;3,2,4;4,2,4#4");
        assertTrue(dfa2.run("0011"));
    }
    @Test
    @Timeout(5)
    public void testDFA2T5() {
        DFA dfa2 = new DFA("0,1,0;1,2,0;2,2,3;3,2,4;4,2,4#4");
        assertTrue(dfa2.run("0000111"));
    }

}
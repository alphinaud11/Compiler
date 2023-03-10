package csen1002.tests.task1;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task1.DFA;

public class Task1PublicTest {

    //////////1st DFA Strings Validation///////////////
    @Test
    @Timeout(5)
    public void testDFA1T1() {
        DFA dfa1 = new DFA("0,0,1;1,2,1;2,0,3;3,3,3#1,3");
        assertTrue(dfa1.run("11"));
    }
    @Test
    @Timeout(5)
    public void testDFA1T2() {
        DFA dfa1 = new DFA("0,0,1;1,2,1;2,0,3;3,3,3#1,3");
        assertTrue(dfa1.run("01010100"));
    }
    @Test
    @Timeout(5)
    public void testDFA1T3() {
        DFA dfa1 = new DFA("0,0,1;1,2,1;2,0,3;3,3,3#1,3");
        assertFalse(dfa1.run("100010010"));
    }
    @Test
    @Timeout(5)
    public void testDFA1T4() {
        DFA dfa1 = new DFA("0,0,1;1,2,1;2,0,3;3,3,3#1,3");
        assertTrue(dfa1.run("101"));
    }
    @Test
    @Timeout(5)
    public void testDFA1T5() {
        DFA dfa1 = new DFA("0,0,1;1,2,1;2,0,3;3,3,3#1,3");
        assertFalse(dfa1.run("0010"));
    }
    //////////2nd DFA Strings Validation///////////////
    @Test
    @Timeout(5)
    public void testDFA2T1() {
        DFA dfa2 = new DFA("0,3,1;1,2,1;2,2,1;3,3,3#2");
        assertFalse(dfa2.run("010"));
    }
    @Test
    @Timeout(5)
    public void testDFA2T2() {
        DFA dfa2 = new DFA("0,3,1;1,2,1;2,2,1;3,3,3#2");
        assertTrue(dfa2.run("10101010"));
    }
    @Test
    @Timeout(5)
    public void testDFA2T3() {
        DFA dfa2 = new DFA("0,3,1;1,2,1;2,2,1;3,3,3#2");
        assertTrue(dfa2.run("10010"));
    }
    @Test
    @Timeout(5)
    public void testDFA2T4() {
        DFA dfa2 = new DFA("0,3,1;1,2,1;2,2,1;3,3,3#2");
        assertFalse(dfa2.run("100010011"));
    }
    @Test
    @Timeout(5)
    public void testDFA2T5() {
        DFA dfa2 = new DFA("0,3,1;1,2,1;2,2,1;3,3,3#2");
        assertFalse(dfa2.run("010010"));
    }

}
package csen1002.tests.task1;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task1.DFA;

public class Task1PrivateTestV5 {

    //////////1st DFA Strings Validation///////////////
    @Test
    @Timeout(5)
    public void testDFA1T1() {
        DFA dfa1 = new DFA("0,1,2;1,3,4;2,4,3;3,3,3;4,4,4#3");
        assertTrue(dfa1.run("00101101"));
    }
    @Test
    @Timeout(5)
    public void testDFA1T2() {
        DFA dfa1 = new DFA("0,1,2;1,3,4;2,4,3;3,3,3;4,4,4#3");
        assertTrue(dfa1.run("11011010"));
    }
    @Test
    @Timeout(5)
    public void testDFA1T3() {
        DFA dfa1 = new DFA("0,1,2;1,3,4;2,4,3;3,3,3;4,4,4#3");
        assertFalse(dfa1.run("01101101"));
    }
    @Test
    @Timeout(5)
    public void testDFA1T4() {
        DFA dfa1 = new DFA("0,1,2;1,3,4;2,4,3;3,3,3;4,4,4#3");
        assertTrue(dfa1.run("00"));
    }
    @Test
    @Timeout(5)
    public void testDFA1T5() {
        DFA dfa1 = new DFA("0,1,2;1,3,4;2,4,3;3,3,3;4,4,4#3");
        assertFalse(dfa1.run("1"));
    }
    //////////2nd DFA Strings Validation///////////////
    @Test
    @Timeout(5)
    public void testDFA2T1() {
        DFA dfa2 = new DFA("0,0,1;1,0,2;2,3,0;3,2,4;4,5,3;5,5,5#2,5");
        assertTrue(dfa2.run("001011"));
    }
    @Test
    @Timeout(5)
    public void testDFA2T2() {
        DFA dfa2 = new DFA("0,0,1;1,0,2;2,3,0;3,2,4;4,5,3;5,5,5#2,5");
        assertTrue(dfa2.run("11010"));
    }
    @Test
    @Timeout(5)
    public void testDFA2T3() {
        DFA dfa2 = new DFA("0,0,1;1,0,2;2,3,0;3,2,4;4,5,3;5,5,5#2,5");
        assertTrue(dfa2.run("11010101"));
    }
    @Test
    @Timeout(5)
    public void testDFA2T4() {
        DFA dfa2 = new DFA("0,0,1;1,0,2;2,3,0;3,2,4;4,5,3;5,5,5#2,5");
        assertFalse(dfa2.run("0110111101"));
    }
    @Test
    @Timeout(5)
    public void testDFA2T5() {
        DFA dfa2 = new DFA("0,0,1;1,0,2;2,3,0;3,2,4;4,5,3;5,5,5#2,5");
        assertTrue(dfa2.run("10110000"));
    }

}

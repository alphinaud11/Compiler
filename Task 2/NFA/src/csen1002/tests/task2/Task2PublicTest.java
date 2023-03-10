package csen1002.tests.task2;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task2.NFA;

public class Task2PublicTest {

    //////////1st NFA Strings Validation///////////////
    @Test
    @Timeout(5)
    public void testNFA1T1() {
        NFA NFA1 = new NFA("2,3#4,5;7,8#0,1;0,7;1,2;1,4;3,6;5,6;6,1;6,7#8");
        assertFalse(NFA1.run("10101010"));
    }
    @Test
    @Timeout(5)
    public void testNFA1T2() {
        NFA NFA1 = new NFA("2,3#4,5;7,8#0,1;0,7;1,2;1,4;3,6;5,6;6,1;6,7#8");
        assertTrue(NFA1.run("01010101"));
    }
    @Test
    @Timeout(5)
    public void testNFA1T3() {
        NFA NFA1 = new NFA("2,3#4,5;7,8#0,1;0,7;1,2;1,4;3,6;5,6;6,1;6,7#8");
        assertFalse(NFA1.run("0110"));
    }
    @Test
    @Timeout(5)
    public void testNFA1T4() {
        NFA NFA1 = new NFA("2,3#4,5;7,8#0,1;0,7;1,2;1,4;3,6;5,6;6,1;6,7#8");
        assertTrue(NFA1.run("1001"));
    }
    @Test
    @Timeout(5)
    public void testNFA1T5() {
        NFA NFA1 = new NFA("2,3#4,5;7,8#0,1;0,7;1,2;1,4;3,6;5,6;6,1;6,7#8");
        assertFalse(NFA1.run("010"));
    }
    //////////2nd NFA Strings Validation///////////////
    @Test
    @Timeout(5)
    public void testNFA2T1() {
        NFA NFA2 = new NFA("1,2;4,5;8,9#3,4;6,7#0,1;0,3;2,1;2,3;5,6;5,8;7,10;9,10#10");
        assertFalse(NFA2.run("0010"));
    }
    @Test
    @Timeout(5)
    public void testNFA2T2() {
        NFA NFA2 = new NFA("1,2;4,5;8,9#3,4;6,7#0,1;0,3;2,1;2,3;5,6;5,8;7,10;9,10#10");
        assertTrue(NFA2.run("100"));
    }
    @Test
    @Timeout(5)
    public void testNFA2T3() {
        NFA NFA2 = new NFA("1,2;4,5;8,9#3,4;6,7#0,1;0,3;2,1;2,3;5,6;5,8;7,10;9,10#10");
        assertTrue(NFA2.run("101"));
    }
    @Test
    @Timeout(5)
    public void testNFA2T4() {
        NFA NFA2 = new NFA("1,2;4,5;8,9#3,4;6,7#0,1;0,3;2,1;2,3;5,6;5,8;7,10;9,10#10");
        assertFalse(NFA2.run("1010"));
    }
    @Test
    @Timeout(5)
    public void testNFA2T5() {
        NFA NFA2 = new NFA("1,2;4,5;8,9#3,4;6,7#0,1;0,3;2,1;2,3;5,6;5,8;7,10;9,10#10");
        assertFalse(NFA2.run("0110"));
    }

}

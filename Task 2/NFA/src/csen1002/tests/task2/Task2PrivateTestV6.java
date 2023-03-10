package csen1002.tests.task2;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task2.NFA;

public class Task2PrivateTestV6 {

    //////////1st NFA Strings Validation///////////////
    @Test
    @Timeout(5)
    public void testNFA1T1() {
        NFA NFA1 = new NFA("4,5;12,13#2,3;7,8;10,11#0,1;0,10;1,2;1,4;3,6;5,6;6,7;6,9;8,7;8,9;9,1;9,10;11,12;11,14;13,12;13,14#14");
        assertFalse(NFA1.run("0"));
    }
    @Test
    @Timeout(5)
    public void testNFA1T2() {
        NFA NFA1 = new NFA("4,5;12,13#2,3;7,8;10,11#0,1;0,10;1,2;1,4;3,6;5,6;6,7;6,9;8,7;8,9;9,1;9,10;11,12;11,14;13,12;13,14#14");
        assertTrue(NFA1.run("11001100"));
    }
    @Test
    @Timeout(5)
    public void testNFA1T3() {
        NFA NFA1 = new NFA("4,5;12,13#2,3;7,8;10,11#0,1;0,10;1,2;1,4;3,6;5,6;6,7;6,9;8,7;8,9;9,1;9,10;11,12;11,14;13,12;13,14#14");
        assertFalse(NFA1.run("000"));
    }
    @Test
    @Timeout(5)
    public void testNFA1T4() {
        NFA NFA1 = new NFA("4,5;12,13#2,3;7,8;10,11#0,1;0,10;1,2;1,4;3,6;5,6;6,7;6,9;8,7;8,9;9,1;9,10;11,12;11,14;13,12;13,14#14");
        assertTrue(NFA1.run("0011001"));
    }
    @Test
    @Timeout(5)
    public void testNFA1T5() {
        NFA NFA1 = new NFA("4,5;12,13#2,3;7,8;10,11#0,1;0,10;1,2;1,4;3,6;5,6;6,7;6,9;8,7;8,9;9,1;9,10;11,12;11,14;13,12;13,14#14");
        assertTrue(NFA1.run("100011010"));
    }
    //////////2nd NFA Strings Validation///////////////
    @Test
    @Timeout(5)
    public void testNFA2T1() {
        NFA NFA2 = new NFA("4,5#2,3#0,1;0,12;1,2;1,9;3,4;3,6;5,8;6,7;7,8;8,11;9,10;10,11;11,1;11,12;12,13;12,15;13,14;14,17;15,16;16,17#17");
        assertTrue(NFA2.run("101011"));
    }
    @Test
    @Timeout(5)
    public void testNFA2T2() {
        NFA NFA2 = new NFA("4,5#2,3#0,1;0,12;1,2;1,9;3,4;3,6;5,8;6,7;7,8;8,11;9,10;10,11;11,1;11,12;12,13;12,15;13,14;14,17;15,16;16,17#17");
        assertFalse(NFA2.run("01101"));
    }
    @Test
    @Timeout(5)
    public void testNFA2T3() {
        NFA NFA2 = new NFA("4,5#2,3#0,1;0,12;1,2;1,9;3,4;3,6;5,8;6,7;7,8;8,11;9,10;10,11;11,1;11,12;12,13;12,15;13,14;14,17;15,16;16,17#17");
        assertFalse(NFA2.run("010101"));
    }
    @Test
    @Timeout(5)
    public void testNFA2T4() {
        NFA NFA2 = new NFA("4,5#2,3#0,1;0,12;1,2;1,9;3,4;3,6;5,8;6,7;7,8;8,11;9,10;10,11;11,1;11,12;12,13;12,15;13,14;14,17;15,16;16,17#17");
        assertFalse(NFA2.run("0011000111"));
    }
    @Test
    @Timeout(5)
    public void testNFA2T5() {
        NFA NFA2 = new NFA("4,5#2,3#0,1;0,12;1,2;1,9;3,4;3,6;5,8;6,7;7,8;8,11;9,10;10,11;11,1;11,12;12,13;12,15;13,14;14,17;15,16;16,17#17");
        assertTrue(NFA2.run("1110101"));
    }

}

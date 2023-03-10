package csen1002.tests.task2;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task2.NFA;

public class Task2PrivateTestV3{

    //////////1st NFA Strings Validation///////////////
    @Test
    @Timeout(5)
    public void testNFA1T1() {
        NFA NFA1 = new NFA("3,4#7,8;11,12#0,1;0,11;1,2;1,6;2,3;2,5;3,4;4,5;5,10;6,7;6,9;8,7;8,9;9,10;10,1;10,11#12");
        assertTrue(NFA1.run("011"));
    }
    @Test
    @Timeout(5)
    public void testNFA1T2() {
        NFA NFA1 = new NFA("3,4#7,8;11,12#0,1;0,11;1,2;1,6;2,3;2,5;3,4;4,5;5,10;6,7;6,9;8,7;8,9;9,10;10,1;10,11#12");
        assertTrue(NFA1.run("01111111"));
    }
    @Test
    @Timeout(5)
    public void testNFA1T3() {
        NFA NFA1 = new NFA("3,4#7,8;11,12#0,1;0,11;1,2;1,6;2,3;2,5;3,4;4,5;5,10;6,7;6,9;8,7;8,9;9,10;10,1;10,11#12");
        assertFalse(NFA1.run("000000"));
    }
    @Test
    @Timeout(5)
    public void testNFA1T4() {
        NFA NFA1 = new NFA("3,4#7,8;11,12#0,1;0,11;1,2;1,6;2,3;2,5;3,4;4,5;5,10;6,7;6,9;8,7;8,9;9,10;10,1;10,11#12");
        assertFalse(NFA1.run("0010"));
    }
    @Test
    @Timeout(5)
    public void testNFA1T5() {
        NFA NFA1 = new NFA("3,4#7,8;11,12#0,1;0,11;1,2;1,6;2,3;2,5;3,4;4,5;5,10;6,7;6,9;8,7;8,9;9,10;10,1;10,11#12");
        assertFalse(NFA1.run("100110"));
    }
    //////////2nd NFA Strings Validation///////////////
    @Test
    @Timeout(5)
    public void testNFA2T1() {
        NFA NFA2 = new NFA("11,12;15,16#8,9;9,10;10,11#0,1;0,14;1,2;1,8;2,3;2,5;3,4;4,7;5,6;6,7;7,13;12,13;13,1;13,14;14,15;14,17;16,19;17,18;18,19#19");
        assertFalse(NFA2.run("11101"));
    }
    @Test
    @Timeout(5)
    public void testNFA2T2() {
        NFA NFA2 = new NFA("11,12;15,16#8,9;9,10;10,11#0,1;0,14;1,2;1,8;2,3;2,5;3,4;4,7;5,6;6,7;7,13;12,13;13,1;13,14;14,15;14,17;16,19;17,18;18,19#19");
        assertTrue(NFA2.run("111011100"));
    }
    @Test
    @Timeout(5)
    public void testNFA2T3() {
        NFA NFA2 = new NFA("11,12;15,16#8,9;9,10;10,11#0,1;0,14;1,2;1,8;2,3;2,5;3,4;4,7;5,6;6,7;7,13;12,13;13,1;13,14;14,15;14,17;16,19;17,18;18,19#19");
        assertFalse(NFA2.run("101000"));
    }
    @Test
    @Timeout(5)
    public void testNFA2T4() {
        NFA NFA2 = new NFA("11,12;15,16#8,9;9,10;10,11#0,1;0,14;1,2;1,8;2,3;2,5;3,4;4,7;5,6;6,7;7,13;12,13;13,1;13,14;14,15;14,17;16,19;17,18;18,19#19");
        assertTrue(NFA2.run("11100"));
    }
    @Test
    @Timeout(5)
    public void testNFA2T5() {
        NFA NFA2 = new NFA("11,12;15,16#8,9;9,10;10,11#0,1;0,14;1,2;1,8;2,3;2,5;3,4;4,7;5,6;6,7;7,13;12,13;13,1;13,14;14,15;14,17;16,19;17,18;18,19#19");
        assertFalse(NFA2.run("11101100"));
    }

}

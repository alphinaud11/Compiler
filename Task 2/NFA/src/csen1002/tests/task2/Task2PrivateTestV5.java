package csen1002.tests.task2;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task2.NFA;

public class Task2PrivateTestV5{

    //////////1st NFA Strings Validation///////////////
    @Test
    @Timeout(5)
    public void testNFA1T1() {
        NFA NFA1 = new NFA("3,4#7,8;11,12#0,1;0,11;1,2;1,6;2,3;2,5;3,4;4,5;5,10;6,7;6,9;8,9;9,10;10,1;10,11#12");
        assertTrue(NFA1.run("011"));
    }
    @Test
    @Timeout(5)
    public void testNFA1T2() {
        NFA NFA1 = new NFA("3,4#7,8;11,12#0,1;0,11;1,2;1,6;2,3;2,5;3,4;4,5;5,10;6,7;6,9;8,9;9,10;10,1;10,11#12");
        assertTrue(NFA1.run("01111111"));
    }
    @Test
    @Timeout(5)
    public void testNFA1T3() {
        NFA NFA1 = new NFA("3,4#7,8;11,12#0,1;0,11;1,2;1,6;2,3;2,5;3,4;4,5;5,10;6,7;6,9;8,9;9,10;10,1;10,11#12");
        assertFalse(NFA1.run("000000"));
    }
    @Test
    @Timeout(5)
    public void testNFA1T4() {
        NFA NFA1 = new NFA("3,4#7,8;11,12#0,1;0,11;1,2;1,6;2,3;2,5;3,4;4,5;5,10;6,7;6,9;8,9;9,10;10,1;10,11#12");
        assertFalse(NFA1.run("0010"));
    }
    @Test
    @Timeout(5)
    public void testNFA1T5() {
        NFA NFA1 = new NFA("3,4#7,8;11,12#0,1;0,11;1,2;1,6;2,3;2,5;3,4;4,5;5,10;6,7;6,9;8,9;9,10;10,1;10,11#12");
        assertFalse(NFA1.run("100110"));
    }
    //////////2nd NFA Strings Validation///////////////
    @Test
    @Timeout(5)
    public void testNFA2T1() {
        NFA NFA2 = new NFA("1,2;12,13;13,14;14,15#0,1;5,6;16,17#2,3;2,11;3,4;3,8;4,5;4,7;6,5;6,7;7,10;8,9;9,10;10,3;10,11;11,12;11,19;15,16;15,18;17,16;17,18;18,21;19,20;20,21#21");
        assertTrue(NFA2.run("10"));
    }
    @Test
    @Timeout(5)
    public void testNFA2T2() {
        NFA NFA2 = new NFA("1,2;12,13;13,14;14,15#0,1;5,6;16,17#2,3;2,11;3,4;3,8;4,5;4,7;6,5;6,7;7,10;8,9;9,10;10,3;10,11;11,12;11,19;15,16;15,18;17,16;17,18;18,21;19,20;20,21#21");
        assertFalse(NFA2.run("0100111"));
    }
    @Test
    @Timeout(5)
    public void testNFA2T3() {
        NFA NFA2 = new NFA("1,2;12,13;13,14;14,15#0,1;5,6;16,17#2,3;2,11;3,4;3,8;4,5;4,7;6,5;6,7;7,10;8,9;9,10;10,3;10,11;11,12;11,19;15,16;15,18;17,16;17,18;18,21;19,20;20,21#21");
        assertFalse(NFA2.run("0111011"));
    }
    @Test
    @Timeout(5)
    public void testNFA2T4() {
        NFA NFA2 = new NFA("1,2;12,13;13,14;14,15#0,1;5,6;16,17#2,3;2,11;3,4;3,8;4,5;4,7;6,5;6,7;7,10;8,9;9,10;10,3;10,11;11,12;11,19;15,16;15,18;17,16;17,18;18,21;19,20;20,21#21");
        assertFalse(NFA2.run("000111"));
    }
    @Test
    @Timeout(5)
    public void testNFA2T5() {
        NFA NFA2 = new NFA("1,2;12,13;13,14;14,15#0,1;5,6;16,17#2,3;2,11;3,4;3,8;4,5;4,7;6,5;6,7;7,10;8,9;9,10;10,3;10,11;11,12;11,19;15,16;15,18;17,16;17,18;18,21;19,20;20,21#21");
        assertTrue(NFA2.run("1011"));
    }

}

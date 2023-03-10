package csen1002.tests.task2;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task2.NFA;

public class Task2PrivateTestV4{

    //////////1st NFA Strings Validation///////////////
    @Test
    @Timeout(5)
    public void testNFA1T1() {
        NFA NFA1 = new NFA("1,2;8,9;#3,4;6,7#0,1;0,6;2,3;2,5;4,3;4,5;5,1;5,6;7,8;7,10;9,8;9,10#10");
        assertFalse(NFA1.run("000000"));
    }
    @Test
    @Timeout(5)
    public void testNFA1T2() {
        NFA NFA1 = new NFA("1,2;8,9;#3,4;6,7#0,1;0,6;2,3;2,5;4,3;4,5;5,1;5,6;7,8;7,10;9,8;9,10#10");
        assertTrue(NFA1.run("10000"));
    }
    @Test
    @Timeout(5)
    public void testNFA1T3() {
        NFA NFA1 = new NFA("1,2;8,9;#3,4;6,7#0,1;0,6;2,3;2,5;4,3;4,5;5,1;5,6;7,8;7,10;9,8;9,10#10");
        assertFalse(NFA1.run("0"));
    }
    @Test
    @Timeout(5)
    public void testNFA1T4() {
        NFA NFA1 = new NFA("1,2;8,9;#3,4;6,7#0,1;0,6;2,3;2,5;4,3;4,5;5,1;5,6;7,8;7,10;9,8;9,10#10");
        assertFalse(NFA1.run("1001"));
    }
    @Test
    @Timeout(5)
    public void testNFA1T5() {
        NFA NFA1 = new NFA("1,2;8,9;#3,4;6,7#0,1;0,6;2,3;2,5;4,3;4,5;5,1;5,6;7,8;7,10;9,8;9,10#10");
        assertTrue(NFA1.run("000101010"));
    }
    //////////2nd NFA Strings Validation///////////////
    @Test
    @Timeout(5)
    public void testNFA2T1() {
        NFA NFA2 = new NFA("2,3;14,15#4,5;12,13#0,1;0,12;1,2;1,9;3,4;3,6;5,8;6,7;7,8;8,11;9,10;10,11;11,1;11,12;13,14;13,16;15,18;16,17;17,18#18");
        assertFalse(NFA2.run("000"));
    }
    @Test
    @Timeout(5)
    public void testNFA2T2() {
        NFA NFA2 = new NFA("2,3;14,15#4,5;12,13#0,1;0,12;1,2;1,9;3,4;3,6;5,8;6,7;7,8;8,11;9,10;10,11;11,1;11,12;13,14;13,16;15,18;16,17;17,18#18");
        assertTrue(NFA2.run("0011"));
    }
    @Test
    @Timeout(5)
    public void testNFA2T3() {
        NFA NFA2 = new NFA("2,3;14,15#4,5;12,13#0,1;0,12;1,2;1,9;3,4;3,6;5,8;6,7;7,8;8,11;9,10;10,11;11,1;11,12;13,14;13,16;15,18;16,17;17,18#18");
        assertFalse(NFA2.run("0111"));
    }
    @Test
    @Timeout(5)
    public void testNFA2T4() {
        NFA NFA2 = new NFA("2,3;14,15#4,5;12,13#0,1;0,12;1,2;1,9;3,4;3,6;5,8;6,7;7,8;8,11;9,10;10,11;11,1;11,12;13,14;13,16;15,18;16,17;17,18#18");
        assertFalse(NFA2.run("00001010111"));
    }
    @Test
    @Timeout(5)
    public void testNFA2T5() {
        NFA NFA2 = new NFA("2,3;14,15#4,5;12,13#0,1;0,12;1,2;1,9;3,4;3,6;5,8;6,7;7,8;8,11;9,10;10,11;11,1;11,12;13,14;13,16;15,18;16,17;17,18#18");
        assertFalse(NFA2.run("010111"));
    }

}

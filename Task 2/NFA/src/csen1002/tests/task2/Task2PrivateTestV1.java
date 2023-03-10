package csen1002.tests.task2;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task2.NFA;

public class Task2PrivateTestV1{

    //////////1st NFA Strings Validation///////////////
    @Test
    @Timeout(5)
    public void testNFA1T1() {
        NFA NFA1 = new NFA("4,5;7,8;12,13#2,3;10,11#0,1;0,7;1,2;1,4;3,6;5,6;6,1;6,7;8,9;8,15;9,10;9,12;11,14;13,14;14,9;14,15#15");
        assertFalse(NFA1.run("111111"));
    }
    @Test
    @Timeout(5)
    public void testNFA1T2() {
        NFA NFA1 = new NFA("4,5;7,8;12,13#2,3;10,11#0,1;0,7;1,2;1,4;3,6;5,6;6,1;6,7;8,9;8,15;9,10;9,12;11,14;13,14;14,9;14,15#15");
        assertTrue(NFA1.run("0101110111"));
    }
    @Test
    @Timeout(5)
    public void testNFA1T3() {
        NFA NFA1 = new NFA("4,5;7,8;12,13#2,3;10,11#0,1;0,7;1,2;1,4;3,6;5,6;6,1;6,7;8,9;8,15;9,10;9,12;11,14;13,14;14,9;14,15#15");
        assertTrue(NFA1.run("0001101111"));
    }
    @Test
    @Timeout(5)
    public void testNFA1T4() {
        NFA NFA1 = new NFA("4,5;7,8;12,13#2,3;10,11#0,1;0,7;1,2;1,4;3,6;5,6;6,1;6,7;8,9;8,15;9,10;9,12;11,14;13,14;14,9;14,15#15");
        assertTrue(NFA1.run("1100"));
    }
    @Test
    @Timeout(5)
    public void testNFA1T5() {
        NFA NFA1 = new NFA("4,5;7,8;12,13#2,3;10,11#0,1;0,7;1,2;1,4;3,6;5,6;6,1;6,7;8,9;8,15;9,10;9,12;11,14;13,14;14,9;14,15#15");
        assertFalse(NFA1.run("1"));
    }
    //////////2nd NFA Strings Validation///////////////
    @Test
    @Timeout(5)
    public void testNFA2T1() {
        NFA NFA2 = new NFA("0,1;1,2;14,15#2,3;6,7;13,14;16,17#3,4;3,12;4,5;4,9;5,6;5,8;7,6;7,8;8,11;9,10;10,11;11,4;11,12;12,13;12,19;15,16;15,18;17,16;17,18;18,21;19,20;20,21#21");
        assertFalse(NFA2.run("101010"));
    }
    @Test
    @Timeout(5)
    public void testNFA2T2() {
        NFA NFA2 = new NFA("0,1;1,2;14,15#2,3;6,7;13,14;16,17#3,4;3,12;4,5;4,9;5,6;5,8;7,6;7,8;8,11;9,10;10,11;11,4;11,12;12,13;12,19;15,16;15,18;17,16;17,18;18,21;19,20;20,21#21");
        assertTrue(NFA2.run("001110111"));
    }
    @Test
    @Timeout(5)
    public void testNFA2T3() {
        NFA NFA2 = new NFA("0,1;1,2;14,15#2,3;6,7;13,14;16,17#3,4;3,12;4,5;4,9;5,6;5,8;7,6;7,8;8,11;9,10;10,11;11,4;11,12;12,13;12,19;15,16;15,18;17,16;17,18;18,21;19,20;20,21#21");
        assertTrue(NFA2.run("001"));
    }
    @Test
    @Timeout(5)
    public void testNFA2T4() {
        NFA NFA2 = new NFA("0,1;1,2;14,15#2,3;6,7;13,14;16,17#3,4;3,12;4,5;4,9;5,6;5,8;7,6;7,8;8,11;9,10;10,11;11,4;11,12;12,13;12,19;15,16;15,18;17,16;17,18;18,21;19,20;20,21#21");
        assertFalse(NFA2.run("100001"));
    }
    @Test
    @Timeout(5)
    public void testNFA2T5() {
        NFA NFA2 = new NFA("0,1;1,2;14,15#2,3;6,7;13,14;16,17#3,4;3,12;4,5;4,9;5,6;5,8;7,6;7,8;8,11;9,10;10,11;11,4;11,12;12,13;12,19;15,16;15,18;17,16;17,18;18,21;19,20;20,21#21");
        assertFalse(NFA2.run("1001000"));
    }

}

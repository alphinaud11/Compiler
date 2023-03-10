package csen1002.tests.task4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task4.FDFA;

public class Task4PrivateTestV2 {

    ////////// 1ST FDFA///////////////
    @Test
    @Timeout(5)
    public void testFDFA1T1() {
        FDFA fdfa1 = new FDFA("0,1,3,N;1,2,1,O;2,4,4,A;3,4,5,P;4,4,4,Q;5,4,4,B#2,5");
        assertEquals(fdfa1.run("0011"), "00,A;11,B;");
    }

    @Test
    @Timeout(5)
    public void testFDFA1T2() {
        FDFA fdfa1 = new FDFA("0,1,3,N;1,2,1,O;2,4,4,A;3,4,5,P;4,4,4,Q;5,4,4,B#2,5");
        assertEquals(fdfa1.run("11111"), "11,B;11,B;1,P;");
    }

    @Test
    @Timeout(5)
    public void testFDFA1T3() {
        FDFA fdfa1 = new FDFA("0,1,3,N;1,2,1,O;2,4,4,A;3,4,5,P;4,4,4,Q;5,4,4,B#2,5");
        assertEquals(fdfa1.run("110"), "11,B;0,O;");
    }

    @Test
    @Timeout(5)
    public void testFDFA1T4() {
        FDFA fdfa1 = new FDFA("0,1,3,N;1,2,1,O;2,4,4,A;3,4,5,P;4,4,4,Q;5,4,4,B#2,5");
        assertEquals(fdfa1.run("10001101"), "10001101,Q;");
    }

    @Test
    @Timeout(5)
    public void testFDFA1T5() {
        FDFA fdfa1 = new FDFA("0,1,3,N;1,2,1,O;2,4,4,A;3,4,5,P;4,4,4,Q;5,4,4,B#2,5");
        assertEquals(fdfa1.run("000"), "00,A;0,O;");

    }

    ////////// 2nd FDFA///////////////
    @Test
    @Timeout(5)
    public void testFDFA2T1() {
        FDFA fdfa2 = new FDFA("0,1,3,N;1,2,2,A;2,2,2,O;3,4,3,P;4,2,5,Q;5,2,2,B#1,5");
        assertEquals(fdfa2.run("0"), "0,A;");
    }

    @Test
    @Timeout(5)
    public void testFDFA2T2() {
        FDFA fdfa2 = new FDFA("0,1,3,N;1,2,2,A;2,2,2,O;3,4,3,P;4,2,5,Q;5,2,2,B#1,5");
        assertEquals(fdfa2.run("1110"), "1110,Q;");
    }

    @Test
    @Timeout(5)
    public void testFDFA2T3() {
        FDFA fdfa2 = new FDFA("0,1,3,N;1,2,2,A;2,2,2,O;3,4,3,P;4,2,5,Q;5,2,2,B#1,5");
        assertEquals(fdfa2.run("1010"), "101,B;0,A;");
    }

    @Test
    @Timeout(5)
    public void testFDFA2T4() {
        FDFA fdfa2 = new FDFA("0,1,3,N;1,2,2,A;2,2,2,O;3,4,3,P;4,2,5,Q;5,2,2,B#1,5");
        assertEquals(fdfa2.run("1101"), "1101,B;");
    }

    @Test
    @Timeout(5)
    public void testFDFA2T5() {
        FDFA fdfa2 = new FDFA("0,1,3,N;1,2,2,A;2,2,2,O;3,4,3,P;4,2,5,Q;5,2,2,B#1,5");
        assertEquals(fdfa2.run("111"), "111,P;");

    }

}
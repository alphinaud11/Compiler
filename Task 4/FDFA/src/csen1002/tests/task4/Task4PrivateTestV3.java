package csen1002.tests.task4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import csen1002.main.task4.FDFA;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;


public class Task4PrivateTestV3 {

    //////////1st FDFA///////////////
    @Test
    @Timeout(5)
    public void testFDFA1T1() {
        FDFA fdfa1 = new FDFA("0,1,5,N;1,1,2,O;2,2,3,P;3,4,2,Q;4,5,4,A;5,5,6,R;6,3,1,B#4,6");
        assertEquals(fdfa1.run("000101001"),"000101001,B;");
    }
    @Test
    @Timeout(5)
    public void testFDFA1T2() {
        FDFA fdfa1 = new FDFA("0,1,5,N;1,1,2,O;2,2,3,P;3,4,2,Q;4,5,4,A;5,5,6,R;6,3,1,B#4,6");
        assertEquals(fdfa1.run("1110"),"11,B;10,R;");
    }	@Test
    @Timeout(5)
    public void testFDFA1T3() {
        FDFA fdfa1 = new FDFA("0,1,5,N;1,1,2,O;2,2,3,P;3,4,2,Q;4,5,4,A;5,5,6,R;6,3,1,B#4,6");
        assertEquals(fdfa1.run("0110000"),"0110,A;000,O;");
    }	@Test
    @Timeout(5)
    public void testFDFA1T4() {
        FDFA fdfa1 = new FDFA("0,1,5,N;1,1,2,O;2,2,3,P;3,4,2,Q;4,5,4,A;5,5,6,R;6,3,1,B#4,6");
        assertEquals(fdfa1.run("000010001111"),"000010001111,P;");
    }	@Test
    @Timeout(5)
    public void testFDFA1T5() {
        FDFA fdfa1 = new FDFA("0,1,5,N;1,1,2,O;2,2,3,P;3,4,2,Q;4,5,4,A;5,5,6,R;6,3,1,B#4,6");
        assertEquals(fdfa1.run("01010110100"),"01010110100,A;");

    }
    //////////2nd FDFA///////////////
    @Test
    @Timeout(5)
    public void testFDFA2T1() {
        FDFA fdfa2 = new FDFA("0,3,1,N;1,8,2,O;2,8,8,A;3,4,6,P;4,8,5,Q;5,8,8,B;6,7,8,R;7,8,8,C;8,8,8,S#2,5,7");
        assertEquals(fdfa2.run("11001010"),"11,A;001,B;010,C;");
    }
    @Test
    @Timeout(5)
    public void testFDFA2T2() {
        FDFA fdfa2 = new FDFA("0,3,1,N;1,8,2,O;2,8,8,A;3,4,6,P;4,8,5,Q;5,8,8,B;6,7,8,R;7,8,8,C;8,8,8,S#2,5,7");
        assertEquals(fdfa2.run("1101111"),"11,A;01111,S;");
    }	@Test
    @Timeout(5)
    public void testFDFA2T3() {
        FDFA fdfa2 = new FDFA("0,3,1,N;1,8,2,O;2,8,8,A;3,4,6,P;4,8,5,Q;5,8,8,B;6,7,8,R;7,8,8,C;8,8,8,S#2,5,7");
        assertEquals(fdfa2.run("0"),"0,P;");
    }	@Test
    @Timeout(5)
    public void testFDFA2T4() {
        FDFA fdfa2 = new FDFA("0,3,1,N;1,8,2,O;2,8,8,A;3,4,6,P;4,8,5,Q;5,8,8,B;6,7,8,R;7,8,8,C;8,8,8,S#2,5,7");
        assertEquals(fdfa2.run("01000"),"010,C;00,Q;");
    }	@Test
    @Timeout(5)
    public void testFDFA2T5() {
        FDFA fdfa2 = new FDFA("0,3,1,N;1,8,2,O;2,8,8,A;3,4,6,P;4,8,5,Q;5,8,8,B;6,7,8,R;7,8,8,C;8,8,8,S#2,5,7");
        assertEquals(fdfa2.run("00101"),"001,B;01,R;");

    }


}
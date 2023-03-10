package csen1002.tests.task4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task4.FDFA;

public class Task4PrivateTestV4 {

    //////////1st FDFA///////////////
    @Test
    @Timeout(5)
    public void testFDFA1T1() {
        FDFA fdfa1 = new FDFA("0,3,1,N;1,1,2,O;2,5,5,A;3,3,4,P;4,5,5,B;5,5,5,Q#2,4");
        assertEquals(fdfa1.run("111111"),"11,A;11,A;11,A;");
    }
    @Test
    @Timeout(5)
    public void testFDFA1T2() {
        FDFA fdfa1 = new FDFA("0,3,1,N;1,1,2,O;2,5,5,A;3,3,4,P;4,5,5,B;5,5,5,Q#2,4");
        assertEquals(fdfa1.run("1000"),"1000,O;");
    }	@Test
    @Timeout(5)
    public void testFDFA1T3() {
        FDFA fdfa1 = new FDFA("0,3,1,N;1,1,2,O;2,5,5,A;3,3,4,P;4,5,5,B;5,5,5,Q#2,4");
        assertEquals(fdfa1.run("011001"),"01,B;1001,A;");
    }	@Test
    @Timeout(5)
    public void testFDFA1T4() {
        FDFA fdfa1 = new FDFA("0,3,1,N;1,1,2,O;2,5,5,A;3,3,4,P;4,5,5,B;5,5,5,Q#2,4");
        assertEquals(fdfa1.run("0001000"),"0001,B;000,P;");
    }	@Test
    @Timeout(5)
    public void testFDFA1T5() {
        FDFA fdfa1 = new FDFA("0,3,1,N;1,1,2,O;2,5,5,A;3,3,4,P;4,5,5,B;5,5,5,Q#2,4");
        assertEquals(fdfa1.run("11100"),"11,A;100,O;");

    }
    //////////2nd FDFA///////////////
    @Test
    @Timeout(5)
    public void testFDFA2T1() {
        FDFA fdfa2 = new FDFA("0,1,4,N;1,10,2,O;2,3,10,P;3,10,10,A;4,5,7,Q;5,10,6,R;6,10,6,B;7,8,7,S;8,9,10,T;9,10,6,C;10,10,10,U#3,6,9");
        assertEquals(fdfa2.run("010101"),"010,A;101,B;");
    }
    @Test
    @Timeout(5)
    public void testFDFA2T2() {
        FDFA fdfa2 = new FDFA("0,1,4,N;1,10,2,O;2,3,10,P;3,10,10,A;4,5,7,Q;5,10,6,R;6,10,6,B;7,8,7,S;8,9,10,T;9,10,6,C;10,10,10,U#3,6,9");
        assertEquals(fdfa2.run("10111000"),"10111,B;000,U;");
    }	@Test
    @Timeout(5)
    public void testFDFA2T3() {
        FDFA fdfa2 = new FDFA("0,1,4,N;1,10,2,O;2,3,10,P;3,10,10,A;4,5,7,Q;5,10,6,R;6,10,6,B;7,8,7,S;8,9,10,T;9,10,6,C;10,10,10,U#3,6,9");
        assertEquals(fdfa2.run("1100111"),"1100111,B;");
    }	@Test
    @Timeout(5)
    public void testFDFA2T4() {
        FDFA fdfa2 = new FDFA("0,1,4,N;1,10,2,O;2,3,10,P;3,10,10,A;4,5,7,Q;5,10,6,R;6,10,6,B;7,8,7,S;8,9,10,T;9,10,6,C;10,10,10,U#3,6,9");
        assertEquals(fdfa2.run("110001"),"1100,C;01,P;");
    }	@Test
    @Timeout(5)
    public void testFDFA2T5() {
        FDFA fdfa2 = new FDFA("0,1,4,N;1,10,2,O;2,3,10,P;3,10,10,A;4,5,7,Q;5,10,6,R;6,10,6,B;7,8,7,S;8,9,10,T;9,10,6,C;10,10,10,U#3,6,9");
        assertEquals(fdfa2.run("010110"),"010,A;110,T;");

    }


}
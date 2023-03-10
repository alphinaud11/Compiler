package csen1002.tests.task5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task5.CFG;

class Task5TestsV5 {

    @Test
    @Timeout(5)
    public void testReg1() {
        CFG cfg = new CFG("S,jk;J,jKl,JKL,LJK;K,KJL,LJK,jkl;L,Lkj,k,j");
        assertEquals("S,jk;J,jKlJ',LJKJ';J',KLJ',e;K,LJKK',jklK';K',JLK',e;L,kL',jL';L',kjL',e",cfg.lre());
    }

    @Test
    @Timeout(5)
    public void testReg2() {
        CFG cfg = new CFG("S,CRr;C,rcy,Rcy,Cr;R,Rc,Ry,rc;Y,RC,y");
        assertEquals("S,CRr;C,rcyC',RcyC';C',rC',e;R,rcR';R',cR',yR',e;Y,rcR'C,y", cfg.lre());
    }

    @Test
    @Timeout(5)
    public void testReg3() {
        CFG cfg = new CFG("S,fg,GF;F,FG,g,h;G,Fg,g;H,GH,h");
        assertEquals("S,fg,GF;F,gF',hF';F',GF',e;G,gF'g,hF'g,g;H,gF'gH,hF'gH,gH,h", cfg.lre());
    }

    @Test
    @Timeout(5)
    public void testReg4() {
        CFG cfg = new CFG("S,pa;P,Pay,yAp,p;A,PA,p;Y,Ya,pP");
        assertEquals("S,pa;P,yApP',pP';P',ayP',e;A,yApP'A,pP'A,p;Y,pPY';Y',aY',e",cfg.lre());
    }

    @Test
    @Timeout(5)
    public void testReg5() {
        CFG cfg = new CFG("S,Bt;B,AT,bA,tab;A,AB,BA,t;T,Tt,At,t");
        assertEquals("S,Bt;B,AT,bA,tab;A,bAAA',tabAA',tA';A',BA',TAA',e;T,bAAA'tT',tabAA'tT',tA'tT',tT';T',tT',e", cfg.lre());
    }

}
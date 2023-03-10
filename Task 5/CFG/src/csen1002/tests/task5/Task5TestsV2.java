package csen1002.tests.task5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task5.CFG;

class Task5TestsV2 {

    @Test
    @Timeout(5)
    public void testReg1() {
        CFG cfg = new CFG("S,Loi,iol;I,ioL,OLI,lio,oil;O,Lio,Pio,LOP;P,Poi,oli,Olp,Lio;L,PO");
        assertEquals("S,Loi,iol;I,ioL,OLI,lio,oil;O,Lio,Pio,LOP;P,oliP',LiolpP',LOPlpP',LioP';P',oiP',iolpP',e;L,oliP'OL';L',iolpP'OL',OPlpP'OL',ioP'OL',e",cfg.lre());
    }

    @Test
    @Timeout(5)
    public void testReg2() {
        CFG cfg = new CFG("S,hjk,JK,Kj;H,hJK,Hj,KJ;J,jhk,khj,Kj;K,k,kH,Jjk");
        assertEquals("S,hjk,JK,Kj;H,hJKH',KJH';H',jH',e;J,jhk,khj,Kj;K,kK',kHK',jhkjkK',khjjkK';K',jjkK',e", cfg.lre());
    }

    @Test
    @Timeout(5)
    public void testReg3() {
        CFG cfg = new CFG("S,n,v,VB;V,vBN,Vbn,VBn;B,BNn,NnV,Bv,vb;N,BV");
        assertEquals("S,n,v,VB;V,vBNV';V',bnV',BnV',e;B,NnVB',vbB';B',NnB',vB',e;N,vbB'VN';N',nVB'VN',e", cfg.lre());
    }

    @Test
    @Timeout(5)
    public void testReg4() {
        CFG cfg = new CFG("S,X,cX;X,xcz,zcx,CZX,ZCX,c;C,Xc,Ccx,Zxc;Z,ZXC,c");
        assertEquals("S,X,cX;X,xcz,zcx,CZX,ZCX,c;C,xczcC',zcxcC',ZCXcC',ccC',ZxcC';C',ZXcC',cxC',e;Z,cZ';Z',XCZ',e",cfg.lre());
    }

    @Test
    @Timeout(5)
    public void testReg5() {
        CFG cfg = new CFG("S,HG,GH,f;F,Fgh,GhG,HgH,HGf;G,fgG,Ggh,GgHF;H,FGhg");
        assertEquals("S,HG,GH,f;F,GhGF',HgHF',HGfF';F',ghF',e;G,fgGG';G',ghG',gHFG',e;H,fgGG'hGF'GhgH';H',gHF'GhgH',GfF'GhgH',e", cfg.lre());
    }

}
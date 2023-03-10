package csen1002.tests.task5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task5.CFG;

class Task5TestsV4 {

    @Test
    @Timeout(5)
    public void testReg1() {
        CFG cfg = new CFG("S,Fs;F,FGB,BFG,GFB;G,GF,f;B,Gf,Fg");
        assertEquals("S,Fs;F,BFGF',GFBF';F',GBF',e;G,fG';G',FG',e;B,fG'fB',fG'FBF'gB';B',FGF'gB',e",cfg.lre());
    }

    @Test
    @Timeout(5)
    public void testReg2() {
        CFG cfg = new CFG("S,St,ts;T,tuy,YU,uy,t;Y,Ytu,Ty,yt;U,Yy,Tt,u");
        assertEquals("S,tsS';S',tS',e;T,tuy,YU,uy,t;Y,tuyyY',uyyY',tyY',ytY';Y',tuY',UyY',e;U,tuyyY'y,uyyY'y,tyY'y,ytY'y,tuyt,tuyyY'Ut,uyyY'Ut,tyY'Ut,ytY'Ut,uyt,tt,u", cfg.lre());
    }

    @Test
    @Timeout(5)
    public void testReg3() {
        CFG cfg = new CFG("S,rs;R,Rb,r;T,Tb,t;B,Tr,rT,Btr");
        assertEquals("S,rs;R,rR';R',bR',e;T,tT';T',bT',e;B,tT'rB',rTB';B',trB',e", cfg.lre());
    }

    @Test
    @Timeout(5)
    public void testReg4() {
        CFG cfg = new CFG("S,Gs,Vg,g;G,GB,bg,Vb;V,Vb,Gv,Bv,v;B,Bvb,BvV,v");
        assertEquals("S,Gs,Vg,g;G,bgG',VbG';G',BG',e;V,bgG'vV',BvV',vV';V',bV',bG'vV',e;B,vB';B',vbB',vVB',e",cfg.lre());
    }

    @Test
    @Timeout(5)
    public void testReg5() {
        CFG cfg = new CFG("S,klm,LK;K,LmM,Mml,Ll;L,Kl,Llk,kl;M,KM,m");
        assertEquals("S,klm,LK;K,LmM,Mml,Ll;L,MmllL',klL';L',mMlL',llL',lkL',e;M,klL'mMMM',klL'lMM',mM';M',mllL'mMMM',mlMM',mllL'lMM',e", cfg.lre());
    }

}
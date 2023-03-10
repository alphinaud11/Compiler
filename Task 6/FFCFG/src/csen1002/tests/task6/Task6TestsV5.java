package csen1002.tests.task6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task6.FFCFG;

@Timeout(5)
public class Task6TestsV5 {

    @Test
    public void testCFG1First() {
        FFCFG cfg = new FFCFG("S,jC,kER;C,kShCj,kZj;R,SWjCh,j,RWj;W,RS,jZRSh,jS,e;Z,W,k,rSjZ;E,ZS,W,rC,j");
        assertEquals("S,jk;C,k;R,jk;W,ejk;Z,ejkr;E,ejkr", cfg.first());
    }

    @Test
    public void testCFG1Follow() {
        FFCFG cfg = new FFCFG("S,jC,kER;C,kShCj,kZj;R,SWjCh,j,RWj;W,RS,jZRSh,jS,e;Z,W,k,rSjZ;E,ZS,W,rC,j");
        assertEquals("S,hjk$;C,hjk$;R,hjk$;W,jk;Z,jk;E,jk", cfg.follow());
    }

    @Test
    public void testCFG2First() {
        FFCFG cfg = new FFCFG("S,qZhY,qBz,s;Y,BhBfY,Z,CBzYs,S;J,Sz,qZ,CsSC;B,s,h,Z,C;Z,YhJq,fSh,e;C,q,h");
        assertEquals("S,qs;Y,efhqs;J,hqs;B,efhqs;Z,efhqs;C,hq", cfg.first());
    }

    @Test
    public void testCFG2Follow() {
        FFCFG cfg = new FFCFG("S,qZhY,qBz,s;Y,BhBfY,Z,CBzYs,S;J,Sz,qZ,CsSC;B,s,h,Z,C;Z,YhJq,fSh,e;C,q,h");
        assertEquals("S,hqsz$;Y,hqsz$;J,q;B,fhz;Z,fhqsz$;C,fhqsz", cfg.follow());
    }

    @Test
    public void testCFG3First() {
        FFCFG cfg = new FFCFG("S,ySfSB,y,e;B,BG,aGdUy;W,tSdBW,gUd,UyWa;G,fUtWd,fS,e;P,G,gSG,PaBaP,yWySP;U,B,P,BGf");
        assertEquals("S,ey;B,a;W,afgty;G,ef;P,aefgy;U,aefgy", cfg.first());
    }

    @Test
    public void testCFG3Follow() {
        FFCFG cfg = new FFCFG("S,ySfSB,y,e;B,BG,aGdUy;W,tSdBW,gUd,UyWa;G,fUtWd,fS,e;P,G,gSG,PaBaP,yWySP;U,B,P,BGf");
        assertEquals("S,adfgty$;B,adfgty$;W,ady;G,adfgty$;P,adty;U,dty", cfg.follow());
    }

    @Test
    public void testCFG4First() {
        FFCFG cfg = new FFCFG("S,rSn,lY,nC,I;Y,yPg,r;C,lSr,oIlY,e;P,o,C;I,Yy,gSo,yI,PlIyS,e");
        assertEquals("S,eglnory;Y,ry;C,elo;P,elo;I,eglory", cfg.first());
    }

    @Test
    public void testCFG4Follow() {
        FFCFG cfg = new FFCFG("S,rSn,lY,nC,I;Y,yPg,r;C,lSr,oIlY,e;P,o,C;I,Yy,gSo,yI,PlIyS,e");
        assertEquals("S,lnory$;Y,glnory$;C,glnory$;P,gl;I,lnory$", cfg.follow());
    }

    @Test
    public void testCFG5First() {
        FFCFG cfg = new FFCFG("S,sCIsO,hNpSO,C;O,d,Cp,Of;N,C,CpIC,SgCfS;C,OpOg,dC,e;I,s,sSp,gOfNg,sONO");
        assertEquals("S,dehps;O,dp;N,deghps;C,dep;I,gs", cfg.first());
    }

    @Test
    public void testCFG5Follow() {
        FFCFG cfg = new FFCFG("S,sCIsO,hNpSO,C;O,d,Cp,Of;N,C,CpIC,SgCfS;C,OpOg,dC,e;I,s,sSp,gOfNg,sONO");
        assertEquals("S,dgp$;O,dfghps$;N,dgp;C,dfgps$;I,dgps", cfg.follow());
    }

}
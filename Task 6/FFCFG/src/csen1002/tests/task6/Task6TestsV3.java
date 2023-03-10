package csen1002.tests.task6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task6.FFCFG;

@Timeout(5)
public class Task6TestsV3 {

    @Test
    public void testCFG1First() {
        FFCFG cfg = new FFCFG("S,aEpC,DtS;H,t,pDE,jEC,jDH;E,D,wDt,HtE;D,tHaEj,pDt,e;C,D,jEp,w,pEp");
        assertEquals("S,apt;H,jpt;E,ejptw;D,ept;C,ejptw", cfg.first());
    }

    @Test
    public void testCFG1Follow() {
        FFCFG cfg = new FFCFG("S,aEpC,DtS;H,t,pDE,jEC,jDH;E,D,wDt,HtE;D,tHaEj,pDt,e;C,D,jEp,w,pEp");
        assertEquals("S,$;H,at;E,ajptw;D,ajptw$;C,at$", cfg.follow());
    }

    @Test
    public void testCFG2First() {
        FFCFG cfg = new FFCFG("S,pZlZ,aB,lZp;Z,B,lUy;X,yF,p,dUFX,Up;U,UaZBj,dFj,e;B,SpBj,p,e;F,pS,XjX,SaFU,BZ");
        assertEquals("S,alp;Z,aelp;X,adpy;U,ade;B,aelp;F,adelpy", cfg.first());
    }

    @Test
    public void testCFG2Follow() {
        FFCFG cfg = new FFCFG("S,pZlZ,aB,lZp;Z,B,lUy;X,yF,p,dUFX,Up;U,UaZBj,dFj,e;B,SpBj,p,e;F,pS,XjX,SaFU,BZ");
        assertEquals("S,adjpy$;Z,adjlpy$;X,adjpy;U,adjlpy;B,adjlpy$;F,adjpy", cfg.follow());
    }

    @Test
    public void testCFG3First() {
        FFCFG cfg = new FFCFG("S,rB,N,W;B,vWr,BB,oWvN,Nc;N,Hr,o,cW,oNc;H,vHH,Jv;W,NJWWc,c,N,e;J,NSoWo,JvSN,W,NWr");
        assertEquals("S,ceorv;B,cov;N,cov;H,cov;W,ceov;J,ceov", cfg.first());
    }

    @Test
    public void testCFG3Follow() {
        FFCFG cfg = new FFCFG("S,rB,N,W;B,vWr,BB,oWvN,Nc;N,Hr,o,cW,oNc;H,vHH,Jv;W,NJWWc,c,N,e;J,NSoWo,JvSN,W,NWr");
        assertEquals("S,cov$;B,cov$;N,corv$;H,corv;W,corv$;J,cov", cfg.follow());
    }

    @Test
    public void testCFG4First() {
        FFCFG cfg = new FFCFG("S,FP,nLN,N;P,PSuNo,LuNzO,nOL,Ll;O,FnPz,p,PlFl,e;N,uSzOl,p,F;L,p,nFnFp;F,nNL,LzL,nOPSL,e");
        assertEquals("S,enpu;P,np;O,enp;N,enpu;L,np;F,enp", cfg.first());
    }

    @Test
    public void testCFG4Follow() {
        FFCFG cfg = new FFCFG("S,FP,nLN,N;P,PSuNo,LuNzO,nOL,Ll;O,FnPz,p,PlFl,e;N,uSzOl,p,F;L,p,nFnFp;F,nNL,LzL,nOPSL,e");
        assertEquals("S,npuz$;P,lnpuz$;O,lnpuz$;N,nopuz$;L,lnopuz$;F,lnopuz$", cfg.follow());
    }

    @Test
    public void testCFG5First() {
        FFCFG cfg = new FFCFG("S,a,cT;T,i,cTi,CiJ,e;J,SaSi,aRaJu;R,RYi,SCc,aJ;C,T,JCiTi;Y,SR,C");
        assertEquals("S,ac;T,acei;J,ac;R,ac;C,acei;Y,acei", cfg.first());
    }

    @Test
    public void testCFG5Follow() {
        FFCFG cfg = new FFCFG("S,a,cT;T,i,cTi,CiJ,e;J,SaSi,aRaJu;R,RYi,SCc,aJ;C,T,JCiTi;Y,SR,C");
        assertEquals("S,aci$;T,aci$;J,aciu$;R,aci;C,ci;Y,i", cfg.follow());
    }

}
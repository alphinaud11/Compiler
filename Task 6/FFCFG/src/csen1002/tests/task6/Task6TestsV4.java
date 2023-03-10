package csen1002.tests.task6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task6.FFCFG;

@Timeout(5)
public class Task6TestsV4 {

    @Test
    public void testCFG1First() {
        FFCFG cfg = new FFCFG("S,iHxHa,TzI;T,OTx,zOi,e;H,zH,z,oI;O,T,x,zTIa;I,O,zTz,HxHi");
        assertEquals("S,ixz;T,exz;H,oz;O,exz;I,eoxz", cfg.first());
    }

    @Test
    public void testCFG1Follow() {
        FFCFG cfg = new FFCFG("S,iHxHa,TzI;T,OTx,zOi,e;H,zH,z,oI;O,T,x,zTIa;I,O,zTz,HxHi");
        assertEquals("S,$;T,aioxz$;H,aix;O,aixz$;I,aix$", cfg.follow());
    }

    @Test
    public void testCFG2First() {
        FFCFG cfg = new FFCFG("S,uSw,hM,ySh;G,rHVGu,yWhH,HWH,H;H,y,hW,WrGrW;M,W,hHyW;V,MW,w,yV;W,h,SyV,y,e");
        assertEquals("S,huy;G,hruy;H,hruy;M,ehuy;V,ehuwy;W,ehuy", cfg.first());
    }

    @Test
    public void testCFG2Follow() {
        FFCFG cfg = new FFCFG("S,uSw,hM,ySh;G,rHVGu,yWhH,HWH,H;H,y,hW,WrGrW;M,W,hHyW;V,MW,w,yV;W,h,SyV,y,e");
        assertEquals("S,hwy$;G,ru;H,hruwy;M,hruwy$;V,hruwy$;W,hruwy$", cfg.follow());
    }

    @Test
    public void testCFG3First() {
        FFCFG cfg = new FFCFG("S,t,AfFhW,BVVVA,AFyA;F,f,dFAw,hFWVB,e;B,d,hA;A,hSd,VWy,tSdA,yVfB,e;V,W,tAyV,d,AV;W,ASBw,FF,hFfF,hBt");
        assertEquals("S,dfhty;F,defh;B,dh;A,defhty;V,defhty;W,defhty", cfg.first());
    }

    @Test
    public void testCFG3Follow() {
        FFCFG cfg = new FFCFG("S,t,AfFhW,BVVVA,AFyA;F,f,dFAw,hFWVB,e;B,d,hA;A,hSd,VWy,tSdA,yVfB,e;V,W,tAyV,d,AV;W,ASBw,FF,hFfF,hBt");
        assertEquals("S,dh$;F,dfhtwy$;B,dfhtwy$;A,dfhtwy$;V,dfhty$;W,dfhty$", cfg.follow());
    }

    @Test
    public void testCFG4First() {
        FFCFG cfg = new FFCFG("S,t,M,Z;L,dS,jP,e;P,LML,C,ZtZdL;M,CvS,n,e;Z,SMPd,n;C,jM,vSMPM");
        assertEquals("S,dejntv;L,dej;P,dejntv;M,ejnv;Z,djntv;C,jv", cfg.first());
    }

    @Test
    public void testCFG4Follow() {
        FFCFG cfg = new FFCFG("S,t,M,Z;L,dS,jP,e;P,LML,C,ZtZdL;M,CvS,n,e;Z,SMPd,n;C,jM,vSMPM");
        assertEquals("S,djntv$;L,djnv;P,djnv;M,djntv$;Z,djntv$;C,djnv", cfg.follow());
    }

    @Test
    public void testCFG5First() {
        FFCFG cfg = new FFCFG("S,tB,B,G;N,fSi,NtBf,v,Gi;G,fAiS,NA;B,tBv,NmVg,A,VfAA;V,gGvA,iV,tN,VABA,e;A,NN,tVtSg,e");
        assertEquals("S,efgitv;N,fv;G,fv;B,efgitv;V,efgitv;A,eftv", cfg.first());
    }

    @Test
    public void testCFG5Follow() {
        FFCFG cfg = new FFCFG("S,tB,B,G;N,fSi,NtBf,v,Gi;G,fAiS,NA;B,tBv,NmVg,A,VfAA;V,gGvA,iV,tN,VABA,e;A,NN,tVtSg,e");
        assertEquals("S,giv$;N,fgimtv$;G,giv$;B,fgitv$;V,fgitv;A,fgitv$", cfg.follow());
    }

}
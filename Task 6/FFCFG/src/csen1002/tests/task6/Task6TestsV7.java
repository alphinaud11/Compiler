package csen1002.tests.task6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task6.FFCFG;

@Timeout(5)
public class Task6TestsV7 {

    @Test
    public void testCFG1First() {
        FFCFG cfg = new FFCFG("S,B,lSy,T;T,HyTlI,lTtG,IIv,e;H,y,lIyIv,I;I,Gv,T,yT;G,lHBv,yByIt,bBy;B,tStHy,lTbI");
        assertEquals("S,beltvy;T,belvy;H,belvy;I,belvy;G,bly;B,lt", cfg.first());
    }

    @Test
    public void testCFG1Follow() {
        FFCFG cfg = new FFCFG("S,B,lSy,T;T,HyTlI,lTtG,IIv,e;H,y,lIyIv,I;I,Gv,T,yT;G,lHBv,yByIt,bBy;B,tStHy,lTbI");
        assertEquals("S,ty$;T,bltvy$;H,lty;I,bltvy$;G,bltvy$;B,tvy$", cfg.follow());
    }

    @Test
    public void testCFG2First() {
        FFCFG cfg = new FFCFG("S,jX,fVv,cVzXv,e;B,ScB,fXfB,M,cMjSf;M,BDzM,X,SjMzB;V,zX,VDM,vVvV,cVSc;X,fVXf,D,z;D,X,c,e");
        assertEquals("S,cefj;B,cefjz;M,cefjz;V,cvz;X,cefz;D,cefz", cfg.first());
    }

    @Test
    public void testCFG2Follow() {
        FFCFG cfg = new FFCFG("S,jX,fVv,cVzXv,e;B,ScB,fXfB,M,cMjSf;M,BDzM,X,SjMzB;V,zX,VDM,vVvV,cVSc;X,fVXf,D,z;D,X,c,e");
        assertEquals("S,cfj$;B,cfjvz;M,cfjvz;V,cfjvz;X,cfjvz$;D,cfjvz$", cfg.follow());
    }

    @Test
    public void testCFG3First() {
        FFCFG cfg = new FFCFG("S,vCA,v;Y,kCvC,vYv;F,dY,bCAo,vA,C;H,HY,bAr;C,YbSH,v,e;A,F,oYSS,C,Yb");
        assertEquals("S,v;Y,kv;F,bdekv;H,b;C,ekv;A,bdekov", cfg.first());
    }

    @Test
    public void testCFG3Follow() {
        FFCFG cfg = new FFCFG("S,vCA,v;Y,kCvC,vYv;F,dY,bCAo,vA,C;H,HY,bAr;C,YbSH,v,e;A,F,oYSS,C,Yb");
        assertEquals("S,borv$;Y,bdkorv$;F,borv$;H,bdkorv$;C,bdkorv$;A,borv$", cfg.follow());
    }

    @Test
    public void testCFG4First() {
        FFCFG cfg = new FFCFG("S,vKkO,j,e;O,j,s,sKO,vSsK;K,s,vTsU,v,kMjMv;U,MvUs,vOsUs,KSvO;T,S,Kj;M,S,K");
        assertEquals("S,ejv;O,jsv;K,ksv;U,jksv;T,ejksv;M,ejksv", cfg.first());
    }

    @Test
    public void testCFG4Follow() {
        FFCFG cfg = new FFCFG("S,vKkO,j,e;O,j,s,sKO,vSsK;K,s,vTsU,v,kMjMv;U,MvUs,vOsUs,KSvO;T,S,Kj;M,S,K");
        assertEquals("S,jsv$;O,jksv$;K,jksv$;U,jksv$;T,s;M,jv", cfg.follow());
    }

    @Test
    public void testCFG5First() {
        FFCFG cfg = new FFCFG("S,G,hLBa,cS;G,lVlV,cBVS,e;Q,bShBl,a,aGh,l;V,aL,a;L,VGl,GQaQl;B,S,lVa");
        assertEquals("S,cehl;G,cel;Q,abl;V,a;L,abcl;B,cehl", cfg.first());
    }

    @Test
    public void testCFG5Follow() {
        FFCFG cfg = new FFCFG("S,G,hLBa,cS;G,lVlV,cBVS,e;Q,bShBl,a,aGh,l;V,aL,a;L,VGl,GQaQl;B,S,lVa");
        assertEquals("S,abhl$;G,abhl$;Q,al;V,abchl$;L,abchl$;B,al", cfg.follow());
    }

}
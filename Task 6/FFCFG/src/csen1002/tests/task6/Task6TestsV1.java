package csen1002.tests.task6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task6.FFCFG;

@Timeout(5)
public class Task6TestsV1 {

    @Test
    public void testCFG1First() {
        FFCFG cfg = new FFCFG("S,X,aX;T,aKtNN,XXZtT,SS,tK;Z,X,a;X,nS,gNg,nN,Kf,e;K,nT,gN,KNS;N,t,aZfZf,aTfKf,nNg");
        assertEquals("S,aegn;T,aegnt;Z,aegn;X,egn;K,gn;N,ant", cfg.first());
    }

    @Test
    public void testCFG1Follow() {
        FFCFG cfg = new FFCFG("S,X,aX;T,aKtNN,XXZtT,SS,tK;Z,X,a;X,nS,gNg,nN,Kf,e;K,nT,gN,KNS;N,t,aZfZf,aTfKf,nNg");
        assertEquals("S,afgnt$;T,afnt;Z,ft;X,afgnt$;K,afnt;N,afgnt$", cfg.follow());
    }

    @Test
    public void testCFG2First() {
        FFCFG cfg = new FFCFG("S,sGpPv,G,sEpPv,jXG;Y,jY,vXGs,pY;G,nEv,s,e;E,YvYwE,GwYpP,sEpY;P,G,sXp,pGsEX;X,pGjG,P");
        assertEquals("S,ejns;Y,jpv;G,ens;E,jnpsvw;P,enps;X,enps", cfg.first());
    }

    @Test
    public void testCFG2Follow() {
        FFCFG cfg = new FFCFG("S,sGpPv,G,sEpPv,jXG;Y,jY,vXGs,pY;G,nEv,s,e;E,YvYwE,GwYpP,sEpY;P,G,sXp,pGsEX;X,pGjG,P");
        assertEquals("S,$;Y,npsvw$;G,jnpsvw$;E,npsv$;P,npsv$;X,npsv$", cfg.follow());
    }

    @Test
    public void testCFG3First() {
        FFCFG cfg = new FFCFG("S,u,aYSV;Y,V,sYzSS,t;V,EuEu,uV,t,E;W,z,zE;X,bE,E,SuWV,tV;E,SaXt,tV,e");
        assertEquals("S,au;Y,aestu;V,aetu;W,z;X,abetu;E,aetu", cfg.first());
    }

    @Test
    public void testCFG3Follow() {
        FFCFG cfg = new FFCFG("S,u,aYSV;Y,V,sYzSS,t;V,EuEu,uV,t,E;W,z,zE;X,bE,E,SuWV,tV;E,SaXt,tV,e");
        assertEquals("S,atuz$;Y,auz;V,atuz$;W,atu;X,t;E,atuz$", cfg.follow());
    }

    @Test
    public void testCFG4First() {
        FFCFG cfg = new FFCFG("S,Q,tYdQ,tA,t;A,Kc,yKt,DSdAt;Q,dSQQQ,S,e;K,tY,tKtS,cKc;D,Q,y;Y,cSyS,cDtS");
        assertEquals("S,det;A,cdty;Q,det;K,ct;D,dety;Y,c", cfg.first());
    }

    @Test
    public void testCFG4Follow() {
        FFCFG cfg = new FFCFG("S,Q,tYdQ,tA,t;A,Kc,yKt,DSdAt;Q,dSQQQ,S,e;K,tY,tKtS,cKc;D,Q,y;Y,cSyS,cDtS");
        assertEquals("S,cdty$;A,cdty$;Q,cdty$;K,ct;D,dt;Y,cdt", cfg.follow());
    }

    @Test
    public void testCFG5First() {
        FFCFG cfg = new FFCFG("S,l,GfF;G,l,F;I,tFlJl,fSn,aItI,aGjJ;J,T,fJ,F;T,IJt,t,j,e;F,t,lJ,jInFt,e");
        assertEquals("S,fjlt;G,ejlt;I,aft;J,aefjlt;T,aefjt;F,ejlt", cfg.first());
    }

    @Test
    public void testCFG5Follow() {
        FFCFG cfg = new FFCFG("S,l,GfF;G,l,F;I,tFlJl,fSn,aItI,aGjJ;J,T,fJ,F;T,IJt,t,j,e;F,t,lJ,jInFt,e");
        assertEquals("S,n$;G,fj;I,afjlnt;J,afjlnt$;T,afjlnt$;F,afjlnt$", cfg.follow());
    }

}
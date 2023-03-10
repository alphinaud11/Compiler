package csen1002.tests.task6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task6.FFCFG;

@Timeout(5)
public class Task6TestsV2 {

    @Test
    public void testCFG1First() {
        FFCFG cfg = new FFCFG("S,gTT,TwYpP,lSpT,P;N,qP,P,pY;Y,PNl,NmP;T,SlPw,wYl,wST,SSg;P,pSq,p,e");
        assertEquals("S,eglpw;N,epq;Y,lmpq;T,glpw;P,ep", cfg.first());
    }

    @Test
    public void testCFG1Follow() {
        FFCFG cfg = new FFCFG("S,gTT,TwYpP,lSpT,P;N,qP,P,pY;Y,PNl,NmP;T,SlPw,wYl,wST,SSg;P,pSq,p,e");
        assertEquals("S,glpqw$;N,lm;Y,lmp;T,glpqw$;P,glmpqw$", cfg.follow());
    }

    @Test
    public void testCFG2First() {
        FFCFG cfg = new FFCFG("S,jYjD,cYY;Y,cM,cAvAj,Yj;E,S,M,vE,D;A,MME,SjE,MDM;M,cDvY,McMYD,vY,c,e;D,v,vAv,EjDc");
        assertEquals("S,cj;Y,c;E,cejv;A,cejv;M,cev;D,cjv", cfg.first());
    }

    @Test
    public void testCFG2Follow() {
        FFCFG cfg = new FFCFG("S,jYjD,cYY;Y,cM,cAvAj,Yj;E,S,M,vE,D;A,MME,SjE,MDM;M,cDvY,McMYD,vY,c,e;D,v,vAv,EjDc");
        assertEquals("S,jv$;Y,cjv$;E,jv;A,jv;M,cjv$;D,cjv$", cfg.follow());
    }

    @Test
    public void testCFG3First() {
        FFCFG cfg = new FFCFG("S,WkWuQ,QrIIQ,bS;C,uQ,b,k,Q,e;I,C,kI,rSuNr;W,Q,b,NuIkQ;Q,rNb,u,e;N,uNbS,k,QQ,r");
        assertEquals("S,bkru;C,bekru;I,bekru;W,bekru;Q,eru;N,ekru", cfg.first());
    }

    @Test
    public void testCFG3Follow() {
        FFCFG cfg = new FFCFG("S,WkWuQ,QrIIQ,bS;C,uQ,b,k,Q,e;I,C,kI,rSuNr;W,Q,b,NuIkQ;Q,rNb,u,e;N,uNbS,k,QQ,r");
        assertEquals("S,bru$;C,bkru$;I,bkru$;W,ku;Q,bkru$;N,bru", cfg.follow());
    }

    @Test
    public void testCFG4First() {
        FFCFG cfg = new FFCFG("S,KK,f,nKnS,KnHOp;H,K,fNNGN,HGkN;G,dSpK,gH;N,K,f;K,dSn,pOfNf,KdHkO,KdKdN,e;O,kO,nKp,Kd,e");
        assertEquals("S,defnp;H,defgp;G,dg;N,defp;K,dep;O,deknp", cfg.first());
    }

    @Test
    public void testCFG4Follow() {
        FFCFG cfg = new FFCFG("S,KK,f,nKnS,KnHOp;H,K,fNNGN,HGkN;G,dSpK,gH;N,K,f;K,dSn,pOfNf,KdHkO,KdKdN,e;O,kO,nKp,Kd,e");
        assertEquals("S,np$;H,dfgknp;G,dfgknp;N,dfgknp$;K,dfgknp$;O,dfgknp$", cfg.follow());
    }

    @Test
    public void testCFG5First() {
        FFCFG cfg = new FFCFG("S,nVnV,s,XXy,VhJ;Q,hLoL,QnQ,yVo;L,XoXh,sV,e;X,sSnVo,hQV,L;J,sQQh,LnQ,L;V,ySnV,s,e");
        assertEquals("S,hnosy;Q,hy;L,ehos;X,ehos;J,ehnos;V,esy", cfg.first());
    }

    @Test
    public void testCFG5Follow() {
        FFCFG cfg = new FFCFG("S,nVnV,s,XXy,VhJ;Q,hLoL,QnQ,yVo;L,XoXh,sV,e;X,sSnVo,hQV,L;J,sQQh,LnQ,L;V,ySnV,s,e");
        assertEquals("S,n$;Q,hnosy$;L,hnosy$;X,hosy;J,n$;V,hnosy$", cfg.follow());
    }

}
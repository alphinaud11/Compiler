package csen1002.tests.task7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task7.LL1CFG;

@Timeout(5)
public class Task7TestsV7 {
    @Test
    public void testLL1CFG1Parse1() {
        LL1CFG ll1cfg1 = new LL1CFG("S,aWc,vDcWJv,cSaDcS,jJD;W,jWvJa,dWwSj,e;J,wS,aJ,vDwJ;D,jWa,wSa,cSwS#S,a,v,c,j;W,j,d,e;J,w,a,v;D,j,w,c#S,acjvw$;W,acvw;J,acjvw;D,acjvw$");
        assertEquals("S,jJD,jaJD,jawSD,jawaWcD,jawacD,jawacwSa,jawacwaWca,jawacwaca", ll1cfg1.parse("jawacwaca"));
    }

    @Test
    public void testLL1CFG1Parse2() {
        LL1CFG ll1cfg1 = new LL1CFG("S,aWc,vDcWJv,cSaDcS,jJD;W,jWvJa,dWwSj,e;J,wS,aJ,vDwJ;D,jWa,wSa,cSwS#S,a,v,c,j;W,j,d,e;J,w,a,v;D,j,w,c#S,acjvw$;W,acvw;J,acjvw;D,acjvw$");
        assertEquals("S,vDcWJv,vjWacWJv,vjacWJv,vjacJv,vjacwSv,vjacwaWcv,vjacwacv", ll1cfg1.parse("vjacwacv"));
    }

    @Test
    public void testLL1CFG1Parse3() {
        LL1CFG ll1cfg1 = new LL1CFG("S,aWc,vDcWJv,cSaDcS,jJD;W,jWvJa,dWwSj,e;J,wS,aJ,vDwJ;D,jWa,wSa,cSwS#S,a,v,c,j;W,j,d,e;J,w,a,v;D,j,w,c#S,acjvw$;W,acvw;J,acjvw;D,acjvw$");
        assertEquals("S,cSaDcS,caWcaDcS,cacaDcS,cacajWacS,cacajacS,cacajacaWc,cacajacac", ll1cfg1.parse("cacajacac"));
    }

    @Test
    public void testLL1CFG1Parse4() {
        LL1CFG ll1cfg1 = new LL1CFG("S,aWc,vDcWJv,cSaDcS,jJD;W,jWvJa,dWwSj,e;J,wS,aJ,vDwJ;D,jWa,wSa,cSwS#S,a,v,c,j;W,j,d,e;J,w,a,v;D,j,w,c#S,acjvw$;W,acvw;J,acjvw;D,acjvw$");
        assertEquals("S,aWc,ajWvJac,ajvJac,ajvaJac,ajvawSac,ajvawaWcac,ajvawacac", ll1cfg1.parse("ajvawacac"));
    }

    @Test
    public void testLL1CFG1Parse5() {
        LL1CFG ll1cfg1 = new LL1CFG("S,aWc,vDcWJv,cSaDcS,jJD;W,jWvJa,dWwSj,e;J,wS,aJ,vDwJ;D,jWa,wSa,cSwS#S,a,v,c,j;W,j,d,e;J,w,a,v;D,j,w,c#S,acjvw$;W,acvw;J,acjvw;D,acjvw$");
        assertEquals("S,vDcWJv,vjWacWJv,vjacWJv,ERROR", ll1cfg1.parse("vjca"));
    }

    @Test
    public void testLL1CFG2Parse1() {
        LL1CFG ll1cfg2 = new LL1CFG("S,gShWpS,zMx,e;W,xWpMW,hSp,zRg;M,hMxR,pWhShM,m;R,gRgR,zMW#S,g,z,e;W,x,h,z;M,h,p,m;R,g,z#S,hp$;W,ghpxz;M,hxz;R,ghxz");
        assertEquals("S,gShWpS,ghWpS,ghzRgpS,ghzzMWgpS,ghzzmWgpS,ghzzmhSpgpS,ghzzmhpgpS,ghzzmhpgp", ll1cfg2.parse("ghzzmhpgp"));
    }

    @Test
    public void testLL1CFG2Parse2() {
        LL1CFG ll1cfg2 = new LL1CFG("S,gShWpS,zMx,e;W,xWpMW,hSp,zRg;M,hMxR,pWhShM,m;R,gRgR,zMW#S,g,z,e;W,x,h,z;M,h,p,m;R,g,z#S,hp$;W,ghpxz;M,hxz;R,ghxz");
        assertEquals("S,gShWpS,ghWpS,ghhSppS,ghhppS,ghhppzMx,ghhppzmx", ll1cfg2.parse("ghhppzmx"));
    }

    @Test
    public void testLL1CFG2Parse3() {
        LL1CFG ll1cfg2 = new LL1CFG("S,gShWpS,zMx,e;W,xWpMW,hSp,zRg;M,hMxR,pWhShM,m;R,gRgR,zMW#S,g,z,e;W,x,h,z;M,h,p,m;R,g,z#S,hp$;W,ghpxz;M,hxz;R,ghxz");
        assertEquals("S,zMx,zpWhShMx,zphSphShMx,zphphShMx,zphphhMx,zphphhmx", ll1cfg2.parse("zphphhmx"));
    }

    @Test
    public void testLL1CFG2Parse4() {
        LL1CFG ll1cfg2 = new LL1CFG("S,gShWpS,zMx,e;W,xWpMW,hSp,zRg;M,hMxR,pWhShM,m;R,gRgR,zMW#S,g,z,e;W,x,h,z;M,h,p,m;R,g,z#S,hp$;W,ghpxz;M,hxz;R,ghxz");
        assertEquals("S,gShWpS,gzMxhWpS,gzmxhWpS,gzmxhhSppS,gzmxhhppS,gzmxhhpp", ll1cfg2.parse("gzmxhhpp"));
    }

    @Test
    public void testLL1CFG2Parse5() {
        LL1CFG ll1cfg2 = new LL1CFG("S,gShWpS,zMx,e;W,xWpMW,hSp,zRg;M,hMxR,pWhShM,m;R,gRgR,zMW#S,g,z,e;W,x,h,z;M,h,p,m;R,g,z#S,hp$;W,ghpxz;M,hxz;R,ghxz");
        assertEquals("S,zMx,zhMxRx,zhmxRx,ERROR", ll1cfg2.parse("zhmg"));
    }

}
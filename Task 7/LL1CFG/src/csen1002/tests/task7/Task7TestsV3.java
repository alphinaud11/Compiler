package csen1002.tests.task7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task7.LL1CFG;

@Timeout(5)
public class Task7TestsV3 {
    @Test
    public void testLL1CFG1Parse1() {
        LL1CFG ll1cfg1 = new LL1CFG("S,gXl,VUc,e;X,gSv,VU;V,cU,yUV;U,lVlXX,gUlV#S,g,cy,e;X,g,cy;V,c,y;U,l,g#S,v$;X,cgly;V,cgly;U,cgly");
        assertEquals("S,gXl,ggSvl,gggXlvl,ggggSvlvl,ggggvlvl", ll1cfg1.parse("ggggvlvl"));
    }

    @Test
    public void testLL1CFG1Parse2() {
        LL1CFG ll1cfg1 = new LL1CFG("S,gXl,VUc,e;X,gSv,VU;V,cU,yUV;U,lVlXX,gUlV#S,g,cy,e;X,g,cy;V,c,y;U,l,g#S,v$;X,cgly;V,cgly;U,cgly");
        assertEquals("S,gXl,ggSvl,ggvl", ll1cfg1.parse("ggvl"));
    }

    @Test
    public void testLL1CFG1Parse3() {
        LL1CFG ll1cfg1 = new LL1CFG("S,gXl,VUc,e;X,gSv,VU;V,cU,yUV;U,lVlXX,gUlV#S,g,cy,e;X,g,cy;V,c,y;U,l,g#S,v$;X,cgly;V,cgly;U,cgly");
        assertEquals("S,VUc,cUUc,clVlXXUc,ERROR", ll1cfg1.parse("clv"));
    }

    @Test
    public void testLL1CFG1Parse4() {
        LL1CFG ll1cfg1 = new LL1CFG("S,gXl,VUc,e;X,gSv,VU;V,cU,yUV;U,lVlXX,gUlV#S,g,cy,e;X,g,cy;V,c,y;U,l,g#S,v$;X,cgly;V,cgly;U,cgly");
        assertEquals("S,VUc,yUVUc,ylVlXXVUc,ERROR", ll1cfg1.parse("yl"));
    }

    @Test
    public void testLL1CFG1Parse5() {
        LL1CFG ll1cfg1 = new LL1CFG("S,gXl,VUc,e;X,gSv,VU;V,cU,yUV;U,lVlXX,gUlV#S,g,cy,e;X,g,cy;V,c,y;U,l,g#S,v$;X,cgly;V,cgly;U,cgly");
        assertEquals("S,gXl,gVUl,gcUUl,ERROR", ll1cfg1.parse("gc"));
    }

    @Test
    public void testLL1CFG2Parse1() {
        LL1CFG ll1cfg2 = new LL1CFG("S,sRrS,zYRrH,e;Y,sSr,rYr,zYsYSy;R,zYrYH,sRR,r;H,rR,sYcSr#S,s,z,e;Y,s,r,z;R,z,s,r;H,r,s#S,ry$;Y,crsyz;R,rsyz$;H,rsyz$");
        assertEquals("S,sRrS,srrS,srrsRrS,srrsrrS,srrsrr", ll1cfg2.parse("srrsrr"));
    }

    @Test
    public void testLL1CFG2Parse2() {
        LL1CFG ll1cfg2 = new LL1CFG("S,sRrS,zYRrH,e;Y,sSr,rYr,zYsYSy;R,zYrYH,sRR,r;H,rR,sYcSr#S,s,z,e;Y,s,r,z;R,z,s,r;H,r,s#S,ry$;Y,crsyz;R,rsyz$;H,rsyz$");
        assertEquals("S,zYRrH,zrYrRrH,zrsSrrRrH,zrsrrRrH,zrsrrrrH,zrsrrrrrR,zrsrrrrrr", ll1cfg2.parse("zrsrrrrrr"));
    }

    @Test
    public void testLL1CFG2Parse3() {
        LL1CFG ll1cfg2 = new LL1CFG("S,sRrS,zYRrH,e;Y,sSr,rYr,zYsYSy;R,zYrYH,sRR,r;H,rR,sYcSr#S,s,z,e;Y,s,r,z;R,z,s,r;H,r,s#S,ry$;Y,crsyz;R,rsyz$;H,rsyz$");
        assertEquals("S,sRrS,ssRRrS,ssrRrS,ssrsRRrS,ssrsrRrS,ssrsrrrS,ssrsrrr", ll1cfg2.parse("ssrsrrr"));
    }

    @Test
    public void testLL1CFG2Parse4() {
        LL1CFG ll1cfg2 = new LL1CFG("S,sRrS,zYRrH,e;Y,sSr,rYr,zYsYSy;R,zYrYH,sRR,r;H,rR,sYcSr#S,s,z,e;Y,s,r,z;R,z,s,r;H,r,s#S,ry$;Y,crsyz;R,rsyz$;H,rsyz$");
        assertEquals("S,zYRrH,zsSrRrH,zsrRrH,zsrrrH,zsrrrrR,zsrrrrr", ll1cfg2.parse("zsrrrrr"));
    }

    @Test
    public void testLL1CFG2Parse5() {
        LL1CFG ll1cfg2 = new LL1CFG("S,sRrS,zYRrH,e;Y,sSr,rYr,zYsYSy;R,zYrYH,sRR,r;H,rR,sYcSr#S,s,z,e;Y,s,r,z;R,z,s,r;H,r,s#S,ry$;Y,crsyz;R,rsyz$;H,rsyz$");
        assertEquals("S,zYRrH,zsSrRrH,zsrRrH,ERROR", ll1cfg2.parse("zsyy"));
    }

}
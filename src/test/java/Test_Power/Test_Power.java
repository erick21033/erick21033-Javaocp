package Test_Power;

import com.ocp.day29_assert.Power;
import junit.framework.Assert;
import org.junit.Test;

public class Test_Power {
    @Test
    public void t1(){
        Power p = new Power();
        int v = 10;
        int a = 10;
        
        int exp = 100;
        int act = p.getW(v, a);
        Assert.assertEquals(exp, act);
    }
    @Test
    public void t2(){
         Power p = new Power();
        int w = 100;
        int v = 10;
        
        int exp = 1000;
        int act = p.getA(w, v);
        Assert.assertEquals(exp, act);
    }
    @Test
    public void t3(){
         Power p = new Power();
        int w = 100;
        int a = 100;
        
        int exp = 10000;
        int act = p.getV(w, a);
        Assert.assertEquals(exp, act);
    }
}

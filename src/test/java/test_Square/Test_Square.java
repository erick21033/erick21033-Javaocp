
package test_Square;

import com.ocp.day29_assert.Square;
import org.junit.Assert;
import org.junit.Test;


public class Test_Square {
    @Test
    public void t1(){
        //測試符合三A
        //Arrange 安排目標物件
        //Act 目標方法
        //Assert 驗證是否符合預期
        
        //1.Arrange 安排
        Square square = new Square();
        //參數配置
        int top = 4;
        int bottom = 6;
        int h = 10;
        //期望結果
        int exp = 50;
        //Acr - 目標方法(實際得到的結果)
        int act = square.getArea(top, bottom, h);
        Assert.assertEquals(exp, act);
                
    }
    
}

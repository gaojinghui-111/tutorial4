import cn.edu.gao.Calc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class calcTest{
	@Test
	public void test(){
		Calc c=new Calc();
		assertEquals(10,c.add(4,6));
	}

}
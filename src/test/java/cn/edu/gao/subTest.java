import cn.edu.gao.Calc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class subTest{
	@Test
	public void test(){
		Calc c=new Calc();
		assertEquals(3,c.sub(10,7));
	}
}
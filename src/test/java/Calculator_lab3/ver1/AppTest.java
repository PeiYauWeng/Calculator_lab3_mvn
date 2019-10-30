package Calculator_lab3.ver1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	private operation opt;
	
	@Before
	public void setup() {
		opt = new operation();
	}
	
	@Test
	public void Addition_test() {
		assertEquals("5+5=10.0", opt.evaluate("5+5"));
	}
	
	@Test
	public void Subtraction_test() {
		assertEquals("5-5=0.0", opt.evaluate("5-5"));
	}

}

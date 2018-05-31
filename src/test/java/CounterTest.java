package test.java;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import main.java.com.svn.entities.Counter;


public class CounterTest{

	Counter cpt;
	
	@Before
	public void start() {
		cpt = new Counter();
	}
	
	@Test
	public void testIncrement() {
		for(int i = 1 ; i < 10 ; i++) {
			Assert.assertEquals(i, cpt.increment());
		}
	}
	
	@Test
	public void testDecrement() {
		for(int i = -1 ; i > -10 ; i--) {
			Assert.assertEquals(i, cpt.decrement());
		}
	}
	
}

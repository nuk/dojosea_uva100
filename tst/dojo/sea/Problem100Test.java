package dojo.sea;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class Problem100Test {

	
	private Main resolver;

	@Before
	public void setUp(){
		resolver = new Main();
	}
	
	@Test
	public void should_return_length_1_for_1() throws Exception {
		Assert.assertEquals(1, resolver.lenghtOf(1));
	}
	
	@Test
	public void should_return_length_8_for_3() throws Exception {
		Assert.assertEquals(8, resolver.lenghtOf(3));
	}
	
	@Test
	public void should_return_length_17_for_7() throws Exception {
		Assert.assertEquals(17, resolver.lenghtOf(7));
	}
	
	@Test
	public void should_return_length_16_for_22() throws Exception {
		Assert.assertEquals(16, resolver.lenghtOf(22));
	}

	@Test
	public void should_return_2_between_1_2() throws Exception {
		Assert.assertEquals(2, resolver.maxBetween(1, 2));
	}

	@Test
	public void should_return_8_between_1_3() throws Exception {
		Assert.assertEquals(8, resolver.maxBetween(1, 3));
	}
	
	@Test
	public void should_return_2_between_2_1() throws Exception {
		Assert.assertEquals(2, resolver.maxBetween(2, 1));
	}

	@Test
	public void should_return_8_between_1_4() throws Exception {
		Assert.assertEquals(8, resolver.maxBetween(1, 4));
	}
	
	@Test
	public void should_return_8_between_4_1() throws Exception {
		Assert.assertEquals(8, resolver.maxBetween(4, 1));
	}
	
	@Test
	public void should_return_17_between_1_7() throws Exception {
		Assert.assertEquals(17, resolver.maxBetween(1, 7));
	}
	
	@Test
	public void should_return_17_between_7_1() throws Exception {
		Assert.assertEquals(17, resolver.maxBetween(7, 1));
	}
	
	/*@Test
	public void should_return_X_between_1_1000000() throws Exception {
		Assert.assertEquals(17, resolver.maxBetween(1, 1000000));
	}*/
	
}

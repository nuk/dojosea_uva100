package dojo.sea;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class Problem100Test {

	
	private Resolver100 resolver;

	@Before
	public void setUp(){
		resolver = new Resolver100();
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
	public void should_return_the_correct_array_for_1() throws Exception {
		Assert.assertEquals(toList(1), resolver.do3N_1(1));
	}
	@Test
	public void should_return_the_correct_array_for_3() throws Exception {
		Assert.assertEquals(toList(3,10,5,16,8,4,2,1), resolver.do3N_1(3));
	}

	@Test
	public void should_return_the_correct_array_for_22() throws Exception {
		Assert.assertEquals(toList(22,11,34,17,52,26,13,40,20,10,5,16,8,4,2,1), resolver.do3N_1(22));
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
	public void should_return_8_between_1_4() throws Exception {
		Assert.assertEquals(8, resolver.maxBetween(1, 4));
	}
	
	@Test
	public void should_return_17_between_1_7() throws Exception {
		Assert.assertEquals(17, resolver.maxBetween(1, 7));
	}
	
	private List<Integer> toList(int... array){
		List<Integer> retorno = new ArrayList<Integer>();
		for (int i : array){
			retorno.add(i);
		}
		return retorno;
	}
	
}

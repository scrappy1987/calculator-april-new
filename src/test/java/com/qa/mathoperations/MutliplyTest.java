package com.qa.mathoperations;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;



public class MutliplyTest {

	@Test
	public void test() {
		Multiply multiply = new Multiply();
		int actual = multiply.multiply(2,2);
		Assert.assertEquals(4, actual);
	}

}

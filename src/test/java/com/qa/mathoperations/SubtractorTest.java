package com.qa.mathoperations;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;



public class SubtractorTest {

	@Test
	public void test() {
		Subtractor subtractor = new Subtractor();
		int actual = subtractor.subtract(4,1);
		Assert.assertEquals(3, actual);
	}

}

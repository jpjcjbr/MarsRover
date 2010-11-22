package br.com.jp.model;

import org.junit.Assert;
import org.junit.Test;

public class PositionTest {

	@Test
	public void shouldCreatePositionWithValues() {
		int x = 10;
		int y = 5;
		Position position = new Position(x, y);
		
		Assert.assertEquals(x, position.getX());
		Assert.assertEquals(y, position.getY());
	}

}

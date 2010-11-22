package br.com.jp.adapter;

import org.junit.Assert;
import org.junit.Test;

import br.com.jp.model.HeadingTo;
import br.com.jp.model.Position;
import br.com.jp.model.Rover;
import br.com.jp.model.exceptions.InvalidRoverInformationException;


public class RoverAdapterTest {

	private RoverAdapter adapter = new RoverAdapter();
	
	@Test
	public void shouldAdapt_1_2_E()
	{
		Rover rover = adapter.adaptStringToRover("1 2 E");
		
		Assert.assertEquals(new Position(1, 2), rover.getPosition());
		Assert.assertEquals(HeadingTo.EAST, rover.getHeadingTo());
	}
	
	@Test
	public void shouldAdapt_4_5_E()
	{
		Rover rover = adapter.adaptStringToRover("4 5 N");
		
		Assert.assertEquals(new Position(4, 5), rover.getPosition());
		Assert.assertEquals(HeadingTo.NORTH, rover.getHeadingTo());
	}
	
	@Test(expected = InvalidRoverInformationException.class)
	public void shouldNotAdapt_4_5_X()
	{
		adapter.adaptStringToRover("4 5 X");
	}
	
	@Test(expected = InvalidRoverInformationException.class)
	public void shouldNotAdapt_45E()
	{
		adapter.adaptStringToRover("45E");
	}
	
	@Test(expected = InvalidRoverInformationException.class)
	public void shouldNotAdaptEmpty()
	{
		adapter.adaptStringToRover("");
	}
	
	@Test(expected = InvalidRoverInformationException.class)
	public void shouldNotAdaptNull()
	{
		adapter.adaptStringToRover(null);
	}
	
}

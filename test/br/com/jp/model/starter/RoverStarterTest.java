package br.com.jp.model.starter;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.jp.model.exceptions.InvalidContentInTheFileException;


public class RoverStarterTest {

	private RoverStarter starter;
	
	@Test(expected = InvalidContentInTheFileException.class)
	public void shouldThrowInvalidContentInTheFileExceptionNull()
	{
		starter = new RoverStarter(null);
	}
	
	@Test(expected = InvalidContentInTheFileException.class)
	public void shouldThrowInvalidContentInTheFileExceptionSize0()
	{
		starter = new RoverStarter(new ArrayList<String>());
	}

	@Test
	public void shouldStartRovers()
	{
		List<String> commands = new ArrayList<String>();
		commands.add("5 5");
		commands.add("1 2 N");
		commands.add("LMLMLMLMM");
		commands.add("3 3 E");
		commands.add("MMRMMRMRRM");
		
		starter = new RoverStarter(commands);
		List<String> rovers = starter.startRovers();
		
		Assert.assertEquals(2, rovers.size());
	}
	
	@Test
	public void shouldSetValues()
	{
		List<String> commands = new ArrayList<String>();
		commands.add("5 5");
		commands.add("1 2 N");
		commands.add("LMLMLMLMM");
		commands.add("3 3 E");
		commands.add("MMRMMRMRRM");
		
		starter = new RoverStarter(commands);
		
		Assert.assertEquals(2, starter.getRoverInformations().size());
		Assert.assertNotNull(starter.getPlateau());
		Assert.assertEquals(5, starter.getPlateau().getWidth());
		Assert.assertEquals(5, starter.getPlateau().getHeight());
		Assert.assertEquals("1 2 N", starter.getRoverInformations().get(0).getPosition());
		Assert.assertEquals("LMLMLMLMM", starter.getRoverInformations().get(0).getCommands());
		Assert.assertEquals("3 3 E", starter.getRoverInformations().get(1).getPosition());
		Assert.assertEquals("MMRMMRMRRM", starter.getRoverInformations().get(1).getCommands());
	}
	
}

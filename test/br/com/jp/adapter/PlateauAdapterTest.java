package br.com.jp.adapter;

import org.junit.Assert;
import org.junit.Test;

import br.com.jp.model.Plateau;
import br.com.jp.model.exceptions.InvalidPlateauInformationException;

public class PlateauAdapterTest {

	private PlateauAdapter adapter = new PlateauAdapter();
	
	@Test
	public void shouldAdapt_1_1() {
		Plateau plateau = adapter.adaptStringToPlateau("1 1");
		
		Assert.assertEquals(1, plateau.getWidth());
		Assert.assertEquals(1, plateau.getHeight());
	}
	
	@Test
	public void shouldAdapt_10_7() {
		Plateau plateau = adapter.adaptStringToPlateau("10 7");
		
		Assert.assertEquals(10, plateau.getWidth());
		Assert.assertEquals(7, plateau.getHeight());
	}
	
	@Test(expected = InvalidPlateauInformationException.class)
	public void shouldAdapt_0_0()
	{
		adapter.adaptStringToPlateau("0 0");
		
		
	}
	
	@Test(expected = InvalidPlateauInformationException.class)
	public void shouldNotAdapt_10()
	{
		adapter.adaptStringToPlateau("10");
	}
	
	@Test(expected = InvalidPlateauInformationException.class)
	public void shouldNotAdaptEmpty()
	{
		adapter.adaptStringToPlateau("");
	}
	
	@Test(expected = InvalidPlateauInformationException.class)
	public void shouldNotAdaptNull()
	{
		adapter.adaptStringToPlateau(null);
	}

}

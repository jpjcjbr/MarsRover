package br.com.jp.adapter;

import br.com.jp.model.Plateau;
import br.com.jp.model.exceptions.InvalidPlateauInformationException;

public class PlateauAdapter {

	public Plateau adaptStringToPlateau(String plateauStr)
	{
		Plateau plateau = null;
		
		try
		{
			String[] plateauInfo = plateauStr.split("\\s");
			
			int width = Integer.parseInt(plateauInfo[0]);
			int height = Integer.parseInt(plateauInfo[1]);
					
			plateau = new Plateau(width, height);
		}
		catch(Exception e)
		{
			throw new InvalidPlateauInformationException();
		}
		
		return plateau;
	}
}

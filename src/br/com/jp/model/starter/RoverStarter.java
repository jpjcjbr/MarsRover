package br.com.jp.model.starter;

import java.util.ArrayList;
import java.util.List;

import br.com.jp.adapter.PlateauAdapter;
import br.com.jp.adapter.RoverAdapter;
import br.com.jp.model.Plateau;
import br.com.jp.model.Rover;
import br.com.jp.model.caller.RoverCaller;
import br.com.jp.model.exceptions.InvalidContentInTheFileException;

public class RoverStarter {

	private Plateau plateau;
	
	private List<RoverInformation> roverInformations = new ArrayList<RoverInformation>();
	
	public RoverStarter(List<String> commands)
	{
		if(commands == null || commands.size() <= 0)
		{
			throw new InvalidContentInTheFileException();
		}
		
		PlateauAdapter plateauAdapter = new PlateauAdapter();
		plateau = plateauAdapter.adaptStringToPlateau(commands.get(0));
		
		for(int i = 1; i < commands.size(); i += 2)
		{
			String position = commands.get(i);
			String commandStr = commands.get(i + 1);
			
			RoverInformation roverInformation = new RoverInformation(position, commandStr);
			
			roverInformations.add(roverInformation);
		}
	}
	
	public List<String> startRovers()
	{
		RoverAdapter roverAdapter = new RoverAdapter();
		RoverCaller roverCaller = new RoverCaller();
		List<String> roversOutput = new ArrayList<String>();
		
		for(RoverInformation roverInformation: roverInformations)
		{
			Rover rover = roverAdapter.adaptStringToRover(roverInformation.getPosition());
			
			roverCaller.call(rover, roverInformation.getCommands());
			
			String roverOutput = "";
			
			if(!plateau.contains(rover.getPosition()))
			{
				roverOutput = "[" + rover.toString() + "] is out of plateau range.";
			}
			else
			{
				roverOutput = rover.toString();
			}
			
			roversOutput.add(roverOutput);
		}
		
		return roversOutput;
	}

	public Plateau getPlateau() {
		return plateau;
	}

	public List<RoverInformation> getRoverInformations() {
		return roverInformations;
	}
}

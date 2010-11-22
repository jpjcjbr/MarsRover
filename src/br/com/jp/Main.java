package br.com.jp;

import java.io.IOException;
import java.util.List;

import br.com.jp.model.starter.RoverStarter;
import br.com.jp.utils.FileReaderUtils;

public class Main {

	public static void main(String[] args) throws IOException {
		
		if(args.length <= 0)
		{
			System.out.println("You should call the program passing the path o the input file.");
			System.exit(0);
		}
		
		List<String> readLines = FileReaderUtils.readLines(args[0]);
		
		RoverStarter roverStarter = new RoverStarter(readLines);
		List<String> output = roverStarter.startRovers();
		
		for(String roverOutput: output)
		{
			System.out.println(roverOutput);
		}
	}
}

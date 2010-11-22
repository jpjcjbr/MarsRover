package br.com.jp.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReaderUtils {

	public static List<String> readLines(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        
        List<String> lines = new ArrayList<String>();
        
        String line = null;
        
        while ((line = bufferedReader.readLine()) != null) {
            lines.add(line);
        }
        
        bufferedReader.close();
        
        return lines;
    }
	
	public static void main(String[] args) throws IOException {
		List<String> readLines = FileReaderUtils.readLines("data/exampleInput");
		
		for(String line: readLines)
		{
			System.out.println(line);
		}
	}
}

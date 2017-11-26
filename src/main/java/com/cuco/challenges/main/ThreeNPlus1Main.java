package com.cuco.challenges.main;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.cuco.challenges.util.ThreeNPlusOneAlgorithm;

public class ThreeNPlus1Main {

	public static void main(String[] args) throws IOException {
		final List<String> inputList = FileUtils.readLines(new File("src/main/resources/input01.txt"), 
				Charset.defaultCharset());
		
		final ThreeNPlusOneAlgorithm algorithm = new ThreeNPlusOneAlgorithm();
		
		for (String string : inputList) {
			final String[] input = string.split(" ");
			final long from = Long.valueOf(input[0]);
			final long to = Long.valueOf(input[1]);
			
			System.out.println(string + " " + algorithm.calcMaxCycleLength(from, to));
		}
	}

}

package co.edu.uptc.FirstPart.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Space {

	private static String newText = "";

	public static String eliminateSpace(String path) throws IOException, FileNotFoundException {
		FileReader fileReader = new FileReader(path);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			newText += line.replaceAll("\\s+", "");
			// newText += line.replace(" ", "");
		}
		bufferedReader.close();
		return newText;
	}

	public static void writeNewFile(String path, String text) throws IOException, FileNotFoundException {
		FileWriter writer = new FileWriter(path);
		writer.write(text);
		writer.close();
	}
}

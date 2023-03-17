package co.edu.uptc.FirstPart.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Space {

	public int eliminateSpace(String string) {
		String path = "src/resources/input/texto.txt";
		try {

			FileReader fileReader = new FileReader(path);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line = bufferedReader.readLine();
			FileWriter writer = new FileWriter("src/resources/NewFile.txt");

			while (line != null) {

				String lineWithoutSpaces = line.replaceAll("\\s+", "");
				writer.write(lineWithoutSpaces);
				writer.write("\n");

				line = FileReader.read();
			}

			FileReader fileReader2 = new FileReader(null);
			fileReader2.close();
			writer.close();

			System.out.println("Archivo procesado exitosamente.");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Space firstActivity = new Space();
		System.out.println("Nueva frase" +eliminateSpace ("src/resources/input/newFile.txt"));
	}
}
    

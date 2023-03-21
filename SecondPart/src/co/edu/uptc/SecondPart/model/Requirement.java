package co.edu.uptc.SecondPart.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Requirement {
    private String textBin = "";
    private String textTxt = "";

    public String readFileBin(String pathBin) throws IOException, FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(pathBin);
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        textBin += dataInputStream.readUTF();
        dataInputStream.close();
        return textBin;
    }

    public void writeNewBin(String path, String phrase) throws IOException, FileNotFoundException{
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(path));
        dataOutputStream.writeUTF(phrase);
        dataOutputStream.close();
    }

    public String readFileTxt(String pathTxt) throws IOException, FileNotFoundException {
        FileReader fileReader = new FileReader(pathTxt);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        textTxt += bufferedReader.readLine();
        bufferedReader.close();
        return textTxt;
    }

    public void writeNewTxT(String path, String phrase) throws IOException, FileNotFoundException{
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
        bufferedWriter.write(phrase);
        bufferedWriter.close();
    }

    public String createNewTextFile(String pathTxt, String pathBin) throws IOException, FileNotFoundException{
        String pathTxtName = getFileStringName(pathTxt);
        String pathBinName = getFileStringName(pathBin);
        String pathNewTxt = pathTxtName + "-" + pathBinName + ".txt";
        return pathNewTxt;
    }

    public String createNewBinaryFile(String pathTxt, String pathBin){
        String pathTxtName = getFileStringName(pathTxt);
        String pathBinName = getFileStringName(pathBin);
        String pathNewBin = pathBinName + "-" + pathTxtName + ".bin";
        return pathNewBin;
    }

    public String getFileStringName(String pathTxt){
        File fileTxt = new File(pathTxt);
        String fileName = fileTxt.getName();
        int index = fileName.lastIndexOf(".");
        if (index != -1) {
            return fileName = fileName.substring(0, index);
        }
        return fileName;
    }

    public String getNewText() {
        return textBin + " " + textTxt;
    }
}

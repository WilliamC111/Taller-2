package co.edu.uptc.FirstPart.presenter;

import co.edu.uptc.FirstPart.model.*;
import co.edu.uptc.FirstPart.view.*;

public class Presenter {
    Space space = new Space();
    View view = new View();

    public Presenter(){
        init();
    }

    public void init(){
        try {
        String text = view.readString("Ingrese el texto al que desea eliminar los espacios: ");
        space.writeNewFile(Constants.PATH_INPUT, text);
        view.showMessage("El texto ingresado es: " + text + ". Puedes revisar el archivo Phrase.txt para comprobar.");
        view.showMessage("Eliminando...");
        String textFinal = space.eliminateSpace(Constants.PATH_INPUT);
        space.writeNewFile(Constants.PATH_OUTPUT, textFinal);
        view.showMessage("El texto sin espacios es: " + textFinal + ". Puedes revisar el archivo NewFile.txt para comprobar.");
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public static void main(String[] args) {
        new Presenter();
    }
}

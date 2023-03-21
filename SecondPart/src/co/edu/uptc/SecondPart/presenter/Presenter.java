package co.edu.uptc.SecondPart.presenter;

import co.edu.uptc.SecondPart.model.*;
import co.edu.uptc.SecondPart.view.*;

public class Presenter {
    private Requirement requirement;
    private View view;

    public Presenter() {
        requirement = new Requirement();
        view = new View();
        start();
    }

    public void start() {
        try {
            requirement.writeNewTxT(Constants.PATH_TXT, view.readString("Ingrese un texto"));
            requirement.readFileTxt(Constants.PATH_TXT);
            requirement.writeNewBin(Constants.PATH_BIN, view.readString("Ingrese un texto"));
            requirement.readFileBin(Constants.PATH_BIN);
            view.showMessage("Nuevo texto fusionado = " + requirement.getNewText());
            int option = view.readInt(
                    "Ingrese una opcion:\n1. Crear nuevo archivo de texto.\n2. Crear nuevo archivo binario\n3. Salir");
            switch (option) {
                case 1:
                    requirement.writeNewTxT(
                            Constants.PATH_NEW_FILE + requirement.createNewTextFile(Constants.PATH_TXT, Constants.PATH_BIN),
                            requirement.getNewText());
                    System.out.println("Nuevo archivo creado = "
                            + requirement.createNewTextFile(Constants.PATH_TXT, Constants.PATH_BIN));
                    break;
                case 2:
                    requirement.writeNewBin(
                            Constants.PATH_NEW_FILE + requirement.createNewBinaryFile(Constants.PATH_TXT, Constants.PATH_BIN),
                            requirement.getNewText());
                    System.out.println("Nuevo archivo creado = "
                            + requirement.createNewBinaryFile(Constants.PATH_TXT, Constants.PATH_BIN));
                    break;
                case 3:
                    view.showMessage("Fue un placer, adios!");
                default:
                    break;
            }
        } catch (Exception e) {
            view.showMessage("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Presenter();
    }
}

package co.edu.uptc.SecondPart.view;

import java.util.Scanner;

public class View {

    private Scanner input;

    public View() {
        input = new Scanner(System.in);
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public int readInt(String message) {
        this.showMessage(message);
        return input.nextInt();
    }

    public String readString(String message) {
        this.showMessage(message);
        return input.nextLine();
    }
}

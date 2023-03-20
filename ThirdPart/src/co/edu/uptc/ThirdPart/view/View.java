package co.edu.uptc.ThirdPart.view;

import java.util.Scanner;

public class View {
	private Scanner input;

    public View(){
Scanner input = new Scanner(System.in);
	}

    public void showMessage(String message) {
        System.out.println(message);
    }

    public String readString(String message) {
        this.showMessage(message);
        return input.nextLine();
    }

    public int readInt(String message) {
        this.showMessage(message);
        return input.nextInt();
    }

}

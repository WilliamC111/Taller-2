package co.edu.uptc.ThirdPart.presenter;

import co.edu.uptc.ThirdPart.model.*;
import co.edu.uptc.ThirdPart.view.*;

public class Presenter {
	Vehicle newVehicle;
	View view;

	public Presenter() {
		newVehicle = new Vehicle();
		view = new View();
		init();
	}

	public void init() {
		try {
			int option = view.readInt(Constants.MAIN_MENU);
			switch (option) {
				case 1:
					int option1 = view.readInt(Constants.CREATE_VEHICLE_MENU);
					createVehicle();
					break;
				case 2:

					break;
				case 3:

					break;
				case 4:

					break;

				default:
					break;
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

	public void createVehicle(int option){
		switch (option) {
			case 1:
				
				break;
		
			default:
				break;
		}
	}

	public static void main(String[] args) {
		new Presenter();
	}

}

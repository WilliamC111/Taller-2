package co.edu.uptc.ThirdPart.presenter;

public class Presenter {
  	Vehicle newVehicle = new Vehicle();
	View view = new View();

	public Presenter() {
		init();
	}

	public void init() {
		try {
			int option= 0;
			int text = view.readInt("        ...MENU INFORMACION VEHICULAR ...           "
					+ "\n\n1. Crear Nuevo Vehiculo\n"
				    +"2. Buscar todos los vehiculos\n"
				    + "3. Buscar vehiculo por Id\n"
				    + "4. Salir");
		switch (option) {
		case 1:
			if (option == 1) {
				int text1= view.readInt("        ...MENU CREAR VEHICULO ...           "
						+ 				"\n\n1. Ingrese marca\n"
						+ 			    "2. Ingrese modelo\n"
						+ 				    "3. Ingrese Año\n"
						+ 				    "4. Ingrese placa\n"
						+ 				    "5. Ingrese color\n"
						+ 			   "4. Salir");
			} else {

			}
			
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

	public static void main(String[] args) {
		new Presenter();
	}

}

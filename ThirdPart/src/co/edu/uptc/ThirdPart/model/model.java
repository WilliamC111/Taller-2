package co.edu.uptc.ThirdPart.model;

public class model {
  private static Vehicle readVehicle(String path) {
		Vehicle vehicle  = new Vehicle();
		try (DataInputStream stream = new DataInputStream(new FileInputStream(path))) {
			vehicle.setBrand(stream.readUTF());
		  vehicle.setModel(stream.readUTF());
	    vehicle.setYear(stream.readInt());
			vehicle.setLicensePlate(stream.readUTF());
			vehicle.setColor(stream.readUTF());		
		} catch (Exception e) {
			System.err.println(e.getStackTrace());
		}
		return vehicle;
	}
		
	public static int readId (String path) {
	
			int counter = 0;
			try {
				FileReader fileReader = new FileReader(path);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				String line = bufferedReader.readLine();
				while (line != null) {
					for (int i = 0; i < line.length(); i++) {
							counter++;
						}
					}
					line = bufferedReader.readLine();
				
				bufferedReader.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return counter;
		}
	private static int showVehicle(String vehicles) {
		
		return  = vehicles;
	}
	
private static String  searchVehicle(int id, String path) {
		 String vehicles = null;
		File carpeta = new File(path);
		String[] listado = carpeta.list();
		if (listado == null || listado.length == 0) {
		    System.out.println("No hay elementos dentro de la carpeta actual"); 	
		}
		else {
		    for (int i=0; i< listado.length; i++) {
		        System.out.println(listado[i]);
		    }
		}
		return vehicles ;
	}
}

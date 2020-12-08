package bridge_s3;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class GuardarEnArchivo implements IGuardar{

	@Override
	public void guardar(Cliente cliente) {
		try {
			ObjectOutputStream objectOut = new ObjectOutputStream(
					new FileOutputStream("D:/Desktop/SIS3/sistemas3",true));
			objectOut.writeObject(cliente);
			objectOut.close();
		} catch (Exception e) {
			System.err.println("Error el guardar en archivo");
		}
		
	}
	

}

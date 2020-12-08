package bridge_s3;

public class Main {

	static Cliente c = new Cliente();
	static RepositorioBase fileRepository,dbRepository;
	public static void main(String[] args) {
		fileRepository = new RepositorioCliente(new GuardarEnArchivo());
		
		c.setId(2);
		c.setNombre("Jose");
		
		//Guardar en archivos
	    fileRepository.guardar(c);
	 
	    //Guardar en base de datos
	    dbRepository = new RepositorioCliente(new GuardarEnBD());
	    dbRepository.guardar(c);
	}

}


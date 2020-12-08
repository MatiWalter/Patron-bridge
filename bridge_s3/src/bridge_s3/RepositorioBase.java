package bridge_s3;

public abstract class RepositorioBase {
	protected IGuardar iguardar;
	
	protected int guardar(Cliente cliente) {
		iguardar.guardar(cliente);
		return 1;
	}
    
}

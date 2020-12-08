package bridge_s3;

public class RepositorioCliente extends RepositorioBase {
	
    public RepositorioCliente(IGuardar iguardar) {
    	super.iguardar=iguardar;
	}

	public IGuardar getRepositorio(){
		return super.iguardar;
	}
     
    @Override
     public int guardar(Cliente cliente) {

        if (cliente == null || cliente.getNombre() == null) {
            return 0;
        }
        //ID AUTOINCREMENTAL EN LA BASE DE DATOS.
        super.guardar(cliente);
        return 1;
    }
}

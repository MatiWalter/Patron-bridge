package bridge_s3;

import javax.persistence.*;

public class GuardarEnBD implements IGuardar {
	private static EntityManagerFactory emf = null;
	private static EntityManager em = null;
	
	@Override
	public void guardar(Cliente cliente) {
		emf = Persistence.createEntityManagerFactory("db");
		em = emf.createEntityManager();
		EntityTransaction emt = em.getTransaction();
		try {
			emt.begin();
			em.persist(cliente);
			emt.commit();

			}catch(Exception ex) {
				if (emt.isActive()) {
					emt.rollback();
				}
				System.err.println("Error al guardar en base de datos");
			}

		}
		
	}



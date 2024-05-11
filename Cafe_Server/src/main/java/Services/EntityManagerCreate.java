package Services;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerCreate {
	private EntityManagerFactory entityManageFactory;
	private EntityManager entityManager;
	
	public EntityManagerCreate() {
		entityManageFactory = Persistence.createEntityManagerFactory("2t_server");
		entityManager = entityManageFactory.createEntityManager();
	}
	
	public EntityManagerFactory getEmf() {
		return entityManageFactory;
	}

	public void setEmf(EntityManagerFactory emf) {
		this.entityManageFactory = emf;
	}
	
	public EntityManager getEnManager() {
		return entityManager;
	}
	
	public void setEm(EntityManager em) {
		this.entityManager = em;
	}

	public void closeEnManager() {
		entityManager.close();
	}
	
	public void closeEnManagerFactory() {
		entityManageFactory.close();
	}
	
}

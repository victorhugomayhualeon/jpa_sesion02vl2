package main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.TbUsuario;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=====PRUEBA EN JPA=======");
		System.out.println("=====LISTAR  USUARIO=======");
		EntityManagerFactory fabrica=Persistence.createEntityManagerFactory("JPA_sesion01");
		EntityManager em=fabrica.createEntityManager();
		
		List<TbUsuario> listUsuario=em.createQuery("select  a From TbUsuario a",TbUsuario.class ).getResultList();
		System.out.println("Nro de usuario : "+listUsuario.size());
		

	}

}

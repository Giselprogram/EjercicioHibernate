package controllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import models.Usuarios;

public class UsuarioController {
	public String createUsuario(String username,String userpassword) {
		
		
		SessionFactory sessionFactory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Usuarios.class).buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		
		try {
			Usuarios usuarios= new Usuarios(username, userpassword);
			session.beginTransaction();
			session.persist(usuarios);
	        session.getTransaction().commit();
            sessionFactory.close();
			
			return"Usuario Creado";
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return"error al registrar usuario";
	}

}

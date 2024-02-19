package view;

import controllers.UsuarioController;

public class UsuarioView {

	public static void main(String[] args) {
		String usuario= new UsuarioController().createUsuario("Alexandra", "pw5634cdf");
		
		System.out.println(usuario);

	}

}

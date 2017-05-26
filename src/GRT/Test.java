package GRT;

public class Test {

	public static void main(String[] args) {
		Login miLogin = new Login ();
		Home miHome = new Home();
		Registro miRegistro = new Registro();
		VerUsuario miVerUsuario= new VerUsuario();
		AddUsuario miAddUsuario =new AddUsuario();
		AddMoto miAddMoto = new AddMoto();
		AddCamp miAddCamp = new AddCamp();
		
		Controlador miControlador = new Controlador(miHome, miLogin, miRegistro,miVerUsuario, miAddUsuario, miAddMoto, miAddCamp);
		
		miLogin.setControlador(miControlador);
		miHome.setControlador(miControlador);
		miRegistro.setControlador(miControlador);
		miLogin.setVisible(true);
		miVerUsuario.setControlador(miControlador);
		miAddUsuario.setControlador(miControlador);
	}

}
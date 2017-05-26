package GRT;

public class Controlador {
	private Home home;
	private Login login;
	private Registro registro;
	private VerUsuario verUsuario;
	private AddUsuario addUsuario;
	private AddMoto addMoto;
	private AddCamp addCamp;

	public Controlador(Home home, Login login, Registro registro, VerUsuario verUsuario, AddUsuario addUsuario, AddMoto addMoto, AddCamp addCamp) {
		this.home = home;
		this.login = login;
		this.registro = registro;
		this.verUsuario = verUsuario;
		this.addUsuario = addUsuario;
		this.addMoto = addMoto;
		this.addCamp = addCamp;
	}

	public void loginHome() {
		login.setVisible(false);
		home.setVisible(true);
	}

	public void loginRegistro() {
		login.setVisible(false);
		registro.setVisible(true);
	}

	public void homeLogin() {
		home.setVisible(false);
		login.setVisible(true);
	}

	public void registroLogin() {
		registro.setVisible(false);
		login.setVisible(true);
	}

	public void HomeVerUsuario() {
		home.setVisible(false);
		verUsuario.setVisible(true);
	}
	public void VerUsuarioHome() {
		home.setVisible(true);
		verUsuario.setVisible(false);
	}
	

	public void homeAddUsuario() {
		home.setVisible(false);
		addUsuario.setVisible(true);
	}

	public void AddUsuarioHome() {
		home.setVisible(true);
		addUsuario.setVisible(false);
	}
	
	
	

}

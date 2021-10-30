package dad.login.ui;

import dad.login.auth.AuthService;
import dad.login.auth.FileAuthService;
import dad.login.auth.LdapAuthService;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


public class Controller {

	private Model modelo = new Model();

	private View vista = new View();

	private Controller controlador = new Controller();

	public View  getVista() {
		return this.vista;
	}
		
	public Controller() {
		super();

		modelo.usuarioProperty().bind(vista.getUsuTextField().textProperty());
		modelo.contraseñaProperty().bind(vista.getContraPasswordField().textProperty());
		vista.getAccederButton().setOnAction(e -> onAccederButton(e));
		vista.getCancelarButton().setOnAction(e -> onCancelarButton(e));

	}

	

	private void onCancelarButton(ActionEvent e) {
		Platform.exit();
	}

	private void onAccederButton(ActionEvent e) {

		AuthService auth = modelo.isLdap() ? new LdapAuthService() : new FileAuthService();

		try {
			if (auth.login(modelo.getUsuario(), modelo.getContraseña()) == true) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Inicio sesión");
				alert.setHeaderText("Acceso permitido");
				alert.setContentText("Las credenciales de acceso son válidas.");
				alert.showAndWait();
			} else {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Inicio sesión");
				alert.setHeaderText("Acceso denegado");
				alert.setContentText("El usuario y/o contraseña no son válidas.");
				alert.showAndWait();
			}
		} catch (Exception e1) {
		}
		
	}


}

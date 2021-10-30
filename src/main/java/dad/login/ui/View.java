package dad.login.ui;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class View {

	private Label usuarioLabel, contrasenaLabel;
	private TextField usuTextField;
	private PasswordField contraPasswordField;
	private CheckBox ldapCheckBox;
	private Button accederButton, cancelarButton;
	VBox root;
	HBox buttonsHBox,usuHBox,contraHBox;

	public View() {
		super();

		usuarioLabel = new Label("Usuario:     ");
		contrasenaLabel = new Label("Contraseña:");

		usuTextField = new TextField("");
		contraPasswordField.setPromptText("Nombre del usuario");

		contraPasswordField = new PasswordField();
		contraPasswordField.setPromptText("Contraseña del usuario");

		ldapCheckBox = new CheckBox("Usar LDAP");

		accederButton = new Button("Acceder");
		// accederButton.setOnAction(e -> onAcceder(e));

		cancelarButton = new Button("Cancelar");
		// cancelarButton.setOnAction(e -> onCancelar(e));

		usuHBox = new HBox(usuarioLabel, usuTextField);
		usuHBox.setAlignment(Pos.BASELINE_CENTER);
		usuHBox.setSpacing(4);

		contraHBox = new HBox(contrasenaLabel, contraPasswordField);
		contraHBox.setAlignment(Pos.BASELINE_CENTER);
		contraHBox.setSpacing(4);

		buttonsHBox = new HBox(accederButton, cancelarButton);
		buttonsHBox.setAlignment(Pos.BASELINE_CENTER);
		buttonsHBox.setSpacing(4);

		root = new VBox(usuHBox, contraHBox, ldapCheckBox, buttonsHBox);
		root.setAlignment(Pos.CENTER);
		root.setSpacing(8);

	}

	public TextField getUsuTextField() {
		return usuTextField;
	}

	public TextField getContraPasswordField() {
		return contraPasswordField;
	}

	public Button getAccederButton() {
		return accederButton;
	}

	public Button getCancelarButton() {
		return cancelarButton;
	}

	public VBox getRoot() {
		return root;
	}
	

}

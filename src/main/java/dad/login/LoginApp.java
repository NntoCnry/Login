package dad.login;

import dad.login.*;
import dad.login.ui.Controller;
import dad.login.ui.View;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginApp extends Application {
	Controller controller=new Controller();
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		View vista=new View();
		Scene escena=new Scene(vista,200,200);
	}
	public static void main(String[] args) {
		launch(args);
	}

}

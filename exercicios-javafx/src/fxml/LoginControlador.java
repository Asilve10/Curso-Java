package fxml;


import org.controlsfx.control.Notifications;



import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControlador {

	@FXML
	private TextField campoEmail;
	
	@FXML
	private PasswordField campoSenha;
	
	public void entrar() {
		
		//System.out.println(campoEmail.getText());
		//System.out.println(campoSenha.getText());
		boolean emailValido = campoEmail.getText().equals("asilve10@gmail.com");
		boolean senhaValida = campoSenha.getText().equals("123456");
		
		if (emailValido && senhaValida) {
			//System.out.println("Login com sucesso");
			Notifications.create()
			.position(Pos.TOP_RIGHT)
			.title("Login FXML")
			.text("Login efetuado com sucesso!")
			.showInformation();
		}else {
			//System.out.println("Falha no login");
			Notifications.create()
			.position(Pos.TOP_RIGHT)
			.title("Login FXML")
			.text("Usuário e senha inválidos!")
			.showError();
		}
			
	}
}

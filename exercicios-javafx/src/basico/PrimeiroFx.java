package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class PrimeiroFx extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {

		
		
		Button butaoA = new Button("A");
		Button butaoB = new Button("B");
		Button butaoC = new Button("C");
		
		butaoA.setOnAction(e -> System.out.println("A"));
		butaoB.setOnAction(e -> System.out.println("B"));
		butaoC.setOnAction(e -> System.exit(0));
		
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.setSpacing(10);
		box.getChildren().add(butaoA);
		box.getChildren().add(butaoB);
		box.getChildren().add(butaoC);
		
		Scene unicaCena = new Scene(box, 100, 150);
		
		primaryStage.setScene(unicaCena);		
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

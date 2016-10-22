package gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Window extends Application{
	
	private Stage window;
	private Scene mainScene;
	
	public static void main(String[] args){
		launch(args);
	}

	public void start(Stage primaryStage) throws Exception {
		
		window = primaryStage;
		primaryStage.setTitle("Calling Bailey");
		
		window.setOnCloseRequest(e ->{
			e.consume();
			System.exit(0);
		});
		
		mainScene = new Scene(new VBox(), 500, 500);
		window.setScene(mainScene);
		window.show();
	}
}

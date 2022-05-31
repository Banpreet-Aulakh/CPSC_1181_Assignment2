import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Problem2 extends Application {
	
	public void start(Stage primaryStage) {
			GridPane root = new GridPane();
			Scene scene = new Scene(root,300,200);
			char letterA = 65;
			
			Button[] button = new Button[26];
			Label label = new Label("Click a letter");
			root.add(label, 0, 8);
			FlowPane buttonPane = new FlowPane();
			buttonPane.setPrefWrapLength(300);
			buttonPane.setVgap(10);
			buttonPane.setHgap(10);
			
			for(int i = 0; i < button.length; ++i) {
				button[i] = new Button(String.valueOf(letterA));
				button[i].setOnAction(e -> {
					if(((Button) e.getSource()).getText().toString().matches("[AEIOU]")) {
						label.setText(((Button) e.getSource()).getText().toString() + " is a vowel.");
					}
					else if(((Button) e.getSource()).getText().toString().equals("Y")) {
						label.setText(((Button) e.getSource()).getText().toString() + " is a sometimes a vowel.");
					}
					else {
						label.setText(((Button) e.getSource()).getText().toString() + " is a consonant.");
					}
				});
				
				buttonPane.getChildren().add(button[i]);
				letterA++;
			}
			
			root.add(buttonPane, 0, 0);
			primaryStage.setTitle("Problem 2");
			primaryStage.setScene(scene);
			primaryStage.show();

	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

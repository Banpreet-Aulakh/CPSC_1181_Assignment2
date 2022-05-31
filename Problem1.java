import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Problem1 extends Application implements EventHandler<MouseEvent> {
	@Override
	public void start(Stage primaryStage) {
			Pane root = new Pane();
			Text text = new Text("Programming is fun");
			Scene scene = new Scene(root,300,100);
			root.getChildren().add(text);
			PathTransition animation = new PathTransition(Duration.millis(5000), new Line(-50, 50, 350, 50), text);
				animation.setCycleCount(Timeline.INDEFINITE);
				animation.play();

				root.setOnMousePressed(e-> {
					animation.pause();
				});

				root.setOnMouseReleased(e -> {
					animation.play();
				});
			primaryStage.setTitle("Problem 1");
			primaryStage.setScene(scene);
			primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void handle(MouseEvent event) {
		
		
	}
}

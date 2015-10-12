// ScrollingText.java

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;

import javafx.application.Application;
import javafx.geometry.VPos;
import javafx.scene.paint.Color;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
 
public class ScrollingText extends Application {
	int A [] = new int[90];
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage) {
		
		Text msg = new Text("Elihu Alejandro Cruz Albores");
		Text msg2 = new Text("BETA");
		Rectangle x = new Rectangle(10,10,20,20);
		x.setFill(Color.BLACK);
		
		msg.setTextOrigin(VPos.TOP);
		msg.setFont(Font.font(24));
		
		Pane root = new Pane(x);
		root.setPrefSize(500, 70);
		Scene scene = new Scene(root);
		
		stage.setScene(scene);
		stage.setTitle("Scrolling Text");
		stage.show();
		
		/* Set up a Timeline animation */
		// Get the scene width and the text width
		double sceneWidth = scene.getHeight();//Obtiene tamaño de frame en vertical
												//tambien es valido width
		//double sceneWidth = (double)A.length;//Inicializa en posicion
		
		double msgWidth = x.getLayoutBounds().getHeight();
		
		// Create the initial and final key frames
		System.out.println(x.translateYProperty());
		System.out.println(x.layoutYProperty());
		
		KeyValue initKeyValue = new KeyValue(x.layoutYProperty(), sceneWidth);
		
		KeyFrame initFrame = new KeyFrame(Duration.seconds(0), initKeyValue);
		
		KeyValue endKeyValue = new KeyValue(x.scaleXProperty(), 20);
		
		KeyFrame endFrame = new KeyFrame(Duration.seconds(1), endKeyValue);
		
		// Create a Timeline object
		Timeline timeline = new Timeline(initFrame, endFrame);
		
		// Let the animation run forever
		timeline.setCycleCount(Timeline.INDEFINITE);
		
		// Start the animation
		timeline.play();
	}
}
 
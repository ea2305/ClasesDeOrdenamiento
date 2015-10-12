/*
*@author Elihu Alejandro Cruz Albores
*@version 1.2
*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
 
public class Canvas extends Application {
    
    int Height = 300;
    int Width  = 500;
    int A [] = {5,6,9,86,1,56};
    public static void main(String[] args) {Application.launch(args);}
 
    @Override
    public void start(Stage stage)throws Exception {
        
        //Container de filas
        Pane root = new Pane();
      
        root = getTableFrame(this.A.length);//Generador de barra para grafica
        
        //CSS
        root.setStyle("  -fx-padding: 10;" +
                        "-fx-border-style: solid inside;" +
                        "-fx-border-width: 2;" +
                        "-fx-border-insets: 5;" +
                        "-fx-border-radius: 5;" +
                        "-fx-border-color: blue;");
                        
        //Size of window                        
        Scene scene = new Scene(root,Width,Height);
        stage.setScene(scene);
        
        stage.setTitle("Prueba Rendimiento Ordenación");//Establece titulo a ventana
        stage.show();//Ventana visible
    }
   
    /*
    *@param valor entero positivo : int N : Determina numero de columnas.
    *@return Pane myPane : retorna un Pane cargado con N columnas
    */
    public Pane getTableFrame(int N){
        Pane myPane = new Pane();
        Rectangle [] myRectangle = new Rectangle[N]; 
        for(int i = 0; i < N; i++){
            
            myRectangle[i] = new Rectangle((20 * i) + 20 ,(Height - (A[i]) * 10),10,(10 * this.A[i]));
            myRectangle[i].setFill(Color.GRAY);
            myRectangle[i].setStroke(Color.BLACK);
            
            myPane.getChildren().add(myRectangle[i]);

        } 
        
        return myPane;
    }
}
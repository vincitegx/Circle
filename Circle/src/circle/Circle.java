package circle;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
public class Circle extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
         Rectangle rect = new Rectangle();
        rect.setHeight(1000);
        rect.setWidth(1200);
        rect.setStroke(Color.BLACK);
        rect.setFill(Color.DARKGOLDENROD);
        
        pane.getChildren().add(rect);
        FlowPane pane2 = new FlowPane();
        Rectangle rect1 = new Rectangle();
        rect1.setHeight(100);
        rect1.setWidth(80);
        rect1.setStroke(null);
        rect1.setFill(Color.WHITESMOKE);
        
        pane.getChildren().add(rect1);
       /* Label label = new Label("3");
        label.textAlignmentProperty().set(TextAlignment.LEFT);*/
        Text text1 = new Text(0, 12, "3");
         text1.setRotate(0);
         text1.setFont(Font.font("", FontWeight.BOLD,
        FontPosture.REGULAR, 15));
        pane.getChildren().add(text1);
        
      javafx.scene.shape.Circle circle = new javafx.scene.shape.Circle(8,22,8);
      
      circle.setRadius(6);
      circle.setFill(Color.BROWN);
      pane.getChildren().add(circle);
       javafx.scene.shape.Circle circle2 = new javafx.scene.shape.Circle(38,50,8);
      circle2.centerXProperty();
      circle2.setRadius(30);
      circle2.applyCss();
      circle2.setFill(Color.BROWN);
      pane.getChildren().add(circle2);
      
      javafx.scene.shape.Circle circle3 = new javafx.scene.shape.Circle(67,80,8);
      circle3.setFill(Color.BROWN);
      circle3.setRadius(6);
      circle3.setRotate(360);
      pane.getChildren().add(circle3);
       Label label3 = new Label("3");
         Text text3 = new Text(70, 98, "3");
         text3.setRotate(180);
         text3.setFont(Font.font("", FontWeight.BOLD,
        FontPosture.REGULAR, 15));
        pane.getChildren().add(text3);
        
        Scene scene = new Scene(pane, 300, 250);
        
        primaryStage.setTitle("Hello");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}


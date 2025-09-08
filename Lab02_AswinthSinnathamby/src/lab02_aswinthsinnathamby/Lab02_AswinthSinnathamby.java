/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02_aswinthsinnathamby;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.image.*;
import java.util.Random;
import javafx.geometry.Pos;

/**
 *
 * @author 2472557
 */
public class Lab02_AswinthSinnathamby extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage){
        BorderPane root = new BorderPane();
        
        Scene scene = new Scene(root, 250, 300);
        
        VBox middle = new VBox();
        
        Label top = new Label("Random Game");
        Label bottom = new Label("Waiting...");
        Label lblImage = new Label("");
        
        root.setTop(top);
        root.setBottom(bottom);
        middle.getChildren().add(lblImage);
        
        root.setCenter(middle);
        
        
        int min = 101;
        int max = 120;
        int random = (int) (Math.random() * (max - min + 1)) + min;
        String path = "file:src/images/" + random + ".jpg";
        Image image = new Image(path);
        //Random rand = new Random();
        //int imageNumber = rand.nextInt(20) + 101;
        //String imagePath = "images/" + imageNumber + ".png";
        //Image img = new Image(imagePath);
        //lblImage.setGraphic(new ImageView(img));
        
        primaryStage.setScene(scene);
        primaryStage.setTitle("Java Games");
        primaryStage.show();
        
    }
    
}

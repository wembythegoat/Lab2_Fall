/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02_aswinthsinnathamby;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

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
        
        primaryStage.setScene(scene);
        primaryStage.setTitle("Java Games");
        primaryStage.show();
    }
    
}

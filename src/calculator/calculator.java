/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculator;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class calculator extends Application {

    @Override
    public void start(Stage primaryStage) {
    try {
        
        Parent root=FXMLLoader.load(getClass().getResource("main.fxml"));
        Scene scene = new Scene(root, 300, 300);
        scene.getStylesheets().add(getClass().getResource("main.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
        }catch(IOException e){
            }
    }

    public static void main(String[] args) {
        launch(args);
    }

}

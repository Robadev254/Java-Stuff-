package com.example.stopsign;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class StopApplication extends Application {
    @Override
    public void start(Stage stage) {
        Polygon octagon = new Polygon();
        octagon.getPoints().addAll(
                50.0, 0.0,100.0, 0.0, 150.0, 50.0, 150.0, 100.0, 100.0, 150.0, 50.0, 150.0, 0.0, 100.0, 0.0, 50.0
        );

        octagon.setFill(Color.RED);

        Text stopText = new Text("STOP");
        stopText.setFont(new Font(50));
        stopText.setFill(Color.WHITE);

        StackPane root = new StackPane();
        root.getChildren().addAll(octagon, stopText);
        Scene scene = new Scene(root, 200, 200);
        stage.setTitle("Stop Sign");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}

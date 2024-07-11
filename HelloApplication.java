package com.example.assignment;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) {
        FlowPane flowPane = new FlowPane();

        // Load image files (replace with your actual image paths)
        Image swiftImage = new Image("file:/home/peterkyle01/IdeaProjects/Assignment/src/main/resources/images/swift.png",80,80,false,false);
        Image cppImage = new Image("file:/home/peterkyle01/IdeaProjects/Assignment/src/main/resources/images/cpp.png",80,80,false,false);
        Image javaImage = new Image("file:/home/peterkyle01/IdeaProjects/Assignment/src/main/resources/images/java.jpg",80,80,false,false);

        // Create labels with custom font
        Label swiftLabel = new Label("Swift", new ImageView(swiftImage));
        Label cppLabel = new Label("C++", new ImageView(cppImage));
        Label javaLabel = new Label("Java", new ImageView(javaImage));

        // Set font for labels
        Font customFont = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20);
        swiftLabel.setFont(customFont);
        cppLabel.setFont(customFont);
        javaLabel.setFont(customFont);

        // Add labels to the FlowPane
        flowPane.getChildren().addAll(swiftLabel, cppLabel, javaLabel);

        Scene scene = new Scene(flowPane, 400, 100);
        stage.setTitle("Programming Languages");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

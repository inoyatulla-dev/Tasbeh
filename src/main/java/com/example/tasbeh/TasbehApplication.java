package com.example.tasbeh;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TasbehApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(TasbehApplication.class.getResource("tasbeh-view.fxml"));
        Scene scene = new Scene((Parent) fxmlLoader.load());
        stage.setTitle("TASBEH");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
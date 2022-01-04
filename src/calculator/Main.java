package calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("CalculatorPane.fxml"));
        primaryStage.setTitle("JFXCalculator");
        primaryStage.setScene(new Scene(root, 495, 475));
        primaryStage.show();
        primaryStage.setMaxWidth(495);
        primaryStage.setMaxHeight(475);

        primaryStage.setMinWidth(495);
        primaryStage.setMinHeight(475);
        primaryStage.setResizable(false);
    }

    public static void main (String[] args)
    {
        launch(args);
    }
}


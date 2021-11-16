package com.nth.frostedpanel;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * Created by HAU TRUNG NGUYEN <haunt.hcm2015@gmail.com> on Nov 16, 2021
 */
public class Main extends Application {

    FrostedPanel panel;

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Dash dash = new Dash();

        Scene scene = new Scene(root, 800, 600);

        dash.setup(scene);

        panel = new FrostedPanel(dash);

        dash.prefWidthProperty().bind(scene.widthProperty());
        dash.prefHeightProperty().bind(scene.heightProperty());

        root.getChildren().add(dash);
        root.getChildren().add(panel);

        primaryStage.setTitle("Frosted panel");
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

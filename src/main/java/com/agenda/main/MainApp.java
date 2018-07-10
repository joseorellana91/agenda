package com.agenda.main;

import com.agenda.controller.MainController;
import javafx.application.Application;
import javafx.stage.Stage;

public class MainApp extends Application {







    @Override
    public void start(Stage primaryStage) throws Exception {

        MainController controller = new MainController();
        controller.init();

    }
}

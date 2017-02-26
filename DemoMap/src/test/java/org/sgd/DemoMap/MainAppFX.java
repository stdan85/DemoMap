package org.sgd.DemoMap;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainAppFX extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		GoogleMap map = new GoogleMap();
		
		 Scene scene = new Scene(map);
		 //primaryStage.setTitle("Map");
		 primaryStage.setScene(scene);
		 primaryStage.show();
		
	}
	
	public static void main(String[] args) {
        //System.setProperty("java.net.useSystemProxies", "true");
        launch(args);
    }

}

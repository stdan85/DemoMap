package org.sgd.DemoMap;




import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Worker;
import javafx.scene.Parent;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class GoogleMap extends Parent {

	public GoogleMap() {
		initMap();
		getChildren().add(webView);
	}

	private void initMap() {
		webView = new WebView();
		webEngine = webView.getEngine();
		webEngine.load(getClass().getResource("/html/map.html").toExternalForm());
		ready = false;
		
		
	
		
		
		webEngine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
			
			public void changed(final ObservableValue<? extends Worker.State> observableValue,
					final Worker.State oldState, final Worker.State newState) {
				if (newState == Worker.State.SUCCEEDED) {
					ready = true;
				}
			}
		});
	}

	private WebView webView;
	private WebEngine webEngine;
	private boolean ready;
}

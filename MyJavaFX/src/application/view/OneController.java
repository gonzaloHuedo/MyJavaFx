package application.view;

import java.io.IOException;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;


public class OneController {

	@FXML
	public ImageView bosque;

	private Ellipse ceiling;
	public AnchorPane page;
	public Scene scene;

	
	
	public void showSendProfile() {
		try {

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("Superheader.fxml"));
            AnchorPane page = (AnchorPane) loader.load();
            Stage sendStage = new Stage();
            sendStage.setTitle("Resting area");
            Scene scene = new Scene(page);
            sendStage.setScene(scene);
            
            sendStage.show();


		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	

	

	@FXML
	private void handleSend() {
		showSendProfile();

	}

	
	@FXML
	private void handleClose() {

		System.exit(0);
	}
}

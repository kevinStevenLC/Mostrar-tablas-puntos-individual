package project.controller;

import java.util.ResourceBundle;
import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXML;

import javafx.fxml.Initializable;

import javafx.stage.Stage;

@SuppressWarnings("unused")
public class PanelController implements Initializable {

	Stage stagePanel;
	Stage stageDriversPoints;
	Stage stageConstructorsPoints;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	public void recivePanel(@SuppressWarnings("exports") Stage stage) {
		this.stagePanel = stage;
	}

	public void reciveDrivers(@SuppressWarnings("exports") Stage stage_points) {
		this.stageDriversPoints = stage_points;
	}

	public void reciveConstructors(@SuppressWarnings("exports") Stage stage_points) {
		this.stageConstructorsPoints = stage_points;
	}

	@FXML
	void showTableConstructorsPoints() {
		stageConstructorsPoints.show();
	}

	@FXML
	void showTableDriversPoints() {
		stageDriversPoints.show();
	}
}

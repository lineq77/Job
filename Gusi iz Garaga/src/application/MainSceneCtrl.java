package application;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.StageStyle;

public class MainSceneCtrl {
	
	public void selectFileBtnClick() {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.initStyle(StageStyle.DECORATED);
		alert.setTitle("Диалоговое окно для выбора xlsx-файла");
		alert.setHeaderText("Здесь будет окно для выбора xlsx-файла!");
		alert.showAndWait();
	}
	
	public void selectFiltersBtnClick() {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.initStyle(StageStyle.DECORATED);
		alert.setTitle("Хоба!");
		alert.setHeaderText("Здесь будет переход на другое окно выбора фильтров!");
		alert.showAndWait();
	}
	
	public void sendNotificationsBtnClick() {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.initStyle(StageStyle.DECORATED);
		alert.setTitle("Хоба!");
		alert.setHeaderText("Здесь будет формирование транспортного файла " +
							"и сохранение его в локальную папку!");
		alert.showAndWait();
	}
}

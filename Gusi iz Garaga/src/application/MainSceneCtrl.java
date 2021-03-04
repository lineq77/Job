package application;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.StageStyle;

public class MainSceneCtrl {
	
	public void selectFileBtnClick() {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.initStyle(StageStyle.DECORATED);
		alert.setTitle("���������� ���� ��� ������ xlsx-�����");
		alert.setHeaderText("����� ����� ���� ��� ������ xlsx-�����!");
		alert.showAndWait();
	}
	
	public void selectFiltersBtnClick() {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.initStyle(StageStyle.DECORATED);
		alert.setTitle("����!");
		alert.setHeaderText("����� ����� ������� �� ������ ���� ������ ��������!");
		alert.showAndWait();
	}
	
	public void sendNotificationsBtnClick() {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.initStyle(StageStyle.DECORATED);
		alert.setTitle("����!");
		alert.setHeaderText("����� ����� ������������ ������������� ����� " +
							"� ���������� ��� � ��������� �����!");
		alert.showAndWait();
	}
}

package application.views;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.StageStyle;
import models.Client;

public class MainSceneCtrl {

	@FXML
	private TableView<Client> clientTable;
	@FXML
	private TableColumn<Client, String> statusColumn;
	@FXML
	private TableColumn<Client, String> nameColumn;
	@FXML
	private TableColumn<Client, Double> balanceColumn;

	@FXML
	private Button selectFileBtn;
	@FXML
	private Button selectFiltersBtn;
	@FXML
	private Button sendNotificationBtn;

	// ������ �� ������� ����������.
	private Main mainApp;

	/**
	 * �����������. ����������� ���������� ������ ������ initialize().
	 */
	public MainSceneCtrl() {
	}

	/**
	 * ������������� ������-�����������. ���� ����� ���������� ������������� �����
	 * ����, ��� fxml-���� ����� ��������.
	 */
	@FXML
	private void initialize() {
		// ������������� ������� ��������� � ����� ���������.
		statusColumn.setCellValueFactory(cellData -> cellData.getValue().statusProperty());
		nameColumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
		balanceColumn.setCellValueFactory(cellData -> cellData.getValue().balanceProperty().asObject());
	}

	/**
	 * ���������� ������� �����������, ������� ��� �� ���� ������.
	 * 
	 * @param mainApp
	 */
	public void setMainApp(Main mainApp) {
		this.mainApp = mainApp;

		// ���������� � ������� ������ �� ������������ ������
		clientTable.setItems(mainApp.getClientData());
	}

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
		alert.setHeaderText("����� ����� ������������ ������������� ����� " + "� ���������� ��� � ��������� �����!");
		alert.showAndWait();
	}
}

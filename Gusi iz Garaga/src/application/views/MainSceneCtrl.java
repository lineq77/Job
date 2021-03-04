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

	// Ссылка на главное приложение.
	private Main mainApp;

	/**
	 * Конструктор. Конструктор вызывается раньше метода initialize().
	 */
	public MainSceneCtrl() {
	}

	/**
	 * Инициализация класса-контроллера. Этот метод вызывается автоматически после
	 * того, как fxml-файл будет загружен.
	 */
	@FXML
	private void initialize() {
		// Инициализация таблицы адресатов с двумя столбцами.
		statusColumn.setCellValueFactory(cellData -> cellData.getValue().statusProperty());
		nameColumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
		balanceColumn.setCellValueFactory(cellData -> cellData.getValue().balanceProperty().asObject());
	}

	/**
	 * Вызывается главным приложением, которое даёт на себя ссылку.
	 * 
	 * @param mainApp
	 */
	public void setMainApp(Main mainApp) {
		this.mainApp = mainApp;

		// Добавление в таблицу данных из наблюдаемого списка
		clientTable.setItems(mainApp.getClientData());
	}

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
		alert.setHeaderText("Здесь будет формирование транспортного файла " + "и сохранение его в локальную папку!");
		alert.showAndWait();
	}
}

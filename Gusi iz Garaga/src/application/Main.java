package application;

import java.io.IOException;

import application.views.MainSceneCtrl;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import models.Client;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.scene.media.AudioClip;


public class Main extends Application {
	
	private Stage primaryStage;
	private BorderPane rootLayout;
	
	/**
	 * Данные, в виде наблюдаемого списка клиентов.
	 */
	private ObservableList<Client> clientData = FXCollections.observableArrayList();
	
	
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Интеграционная шина для ЧОП \"Гуси из гаража\"");
		
		initRootLayout();
		
	}
	
	/**
	 * Конструктор
	 */
	public Main() {
		// В качестве образца добавляем некоторые данные
		clientData.add(new Client("Информирование", "ПАО \"Муха-цокотуха\"", 1000.0));
		clientData.add(new Client("Информирование", "ООО \"Мойдодыр\"", 7000.0));
		clientData.add(new Client("Предупреждение", "ИП Петров Николай Иванович", 15000.0));
		clientData.add(new Client("Нет задолженности", "ООО \"Мумий Тролль\"", 0.0));
		clientData.add(new Client("Заблокирован", "ЗАО \"Кот Базилио\"", 50000.0));
		//clientData.add(new Client("Заблокирован", "ЗАО \"Кот Базилио\""));
		//clientData.add(new Client("Заблокирован", "ЗАО \"Кот Базилио\""));
		//clientData.add(new Client("Заблокирован", "ЗАО \"Кот Базилио\""));
		//clientData.add(new Client("Заблокирован", "ЗАО \"Кот Базилио\""));
	}
	
	/**
	 * Возвращает данные в виде наблюдаемого списка клиентов.
	 * @return
	 */
	public ObservableList<Client> getClientData() {
		return clientData;
	}
	
	/**
     * Инициализирует корневой макет.
     */
    public void initRootLayout() {
        try {
            // Загружаем корневой макет из fxml файла.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("views/index.fxml"));
            rootLayout = (BorderPane) loader.load();

            // Отображаем сцену, содержащую корневой макет.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
            
            // Даём контроллеру доступ к главному приложению.
            MainSceneCtrl controller = loader.getController();
            controller.setMainApp(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
		launch(args);
	}
		/*
		try {
			
			
			
			// создаем список объектов
	        ObservableList<Person> people = FXCollections.observableArrayList(
	             
	            new Person("Tom", 34),
	            new Person("Bob", 22),
	            new Person("Sam", 28),
	            new Person("Alice", 29)
	        );
	        // определяем таблицу и устанавливаем данные
	        TableView<Person> table = new TableView<Person>(people);
	        //table.setPrefWidth(250);
	        //table.setPrefHeight(200);
	     
	        // столбец для вывода имени
	        TableColumn<Person, String> nameColumn = new TableColumn<Person, String>("Name");
	        // определяем фабрику для столбца с привязкой к свойству name
	        nameColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("name"));
	         
	        // столбец для вывода возраста
	        TableColumn<Person, Integer> ageColumn = new TableColumn<Person, Integer>("Age");
	        ageColumn.setCellValueFactory(new PropertyValueFactory<Person, Integer>("age"));
	        
	        // добавляем столбцы в таблицу
	        table.getColumns().addAll(nameColumn, ageColumn);
	        
	        BorderPane root = new BorderPane();
	        
	        // * Добавляем таблицу
	        StackPane tablePane = new StackPane();
	        tablePane.setPadding(new Insets(20, 20, 10, 20));
	        tablePane.getChildren().add(table);
	        
	        root.setCenter(tablePane);
	        // *** 
	        
	        // * Добавляем нижние кнопки
	        TilePane buttonsPane = new TilePane(Orientation.HORIZONTAL, 0, 2);
	        buttonsPane.setPadding(new Insets(5, 10, 20, 0));
	        Button fileSelectBtn = new Button("Выбрать файл...");
	        Button filtersSelectBtn = new Button("Задать фильтры...");
	        Button sendNotificationsBtn = new Button("Отправить уведомления");
	        sendNotificationsBtn.setAlignment(Pos.BASELINE_RIGHT);
	        buttonsPane.getChildren().addAll(fileSelectBtn, filtersSelectBtn, sendNotificationsBtn);
	        
	        root.setBottom(buttonsPane);
	        // ***
	        
	         
	        Scene scene = new Scene(root, 750, 600);
	          
	        primaryStage.setScene(scene);
	        primaryStage.setTitle("Интеграционная шина для ЧОП \"Гуси из гаража\"");
	        primaryStage.show();
			
			//BorderPane root = new BorderPane();
			//AnchorPane root = new AnchorPane();
			//root.setPadding(new Insets(5.0));
			//Button button = createButton();
			//AnchorPane.setBottomAnchor(button, 0.0);
			//AnchorPane.setTopAnchor(button, 0.0);
			//AnchorPane.setBottomAnchor(button, 0.0);
			//AnchorPane.setRightAnchor(button, 0.0);
			//AnchorPane.setLeftAnchor(button, 0.0);
			//root.getChildren().add(button);
			//Scene scene = new Scene(root,400,400);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//primaryStage.setScene(scene);
			//primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		*/
	
    /*
	private Button createButton() {
		Button result = new Button("Жми");
		result.setTooltip(new Tooltip("Не бойся, жми!"));
		result.setCursor(Cursor.HAND);
		//result.setOnMouseClicked(mouseEvent -> {
		//	new AudioClip(getResource("click.wav").toString()).play();
		//	showDialog();
		//});
		return result;
	}
	
	private void showDialog() {
		Alert dialog = new Alert(AlertType.INFORMATION);
		dialog.initStyle(StageStyle.UTILITY);
		dialog.setTitle("Инфо");
		dialog.setHeaderText("Привет мир!");
		dialog.showAndWait();
	}
	
	*/
}

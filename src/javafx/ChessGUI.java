package javafx;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model.Board;
import model.Piece;
import model.ChessGame;

public class ChessGUI extends Application{
	
	private BorderPane all;
	private Board board;
	private ChessGame game;
	
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage) throws Exception {


		LayoutGUI();


		Scene scene = new Scene(all, 850, 650);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Chess Game");
		primaryStage.show();

		registerHandlers(primaryStage);
	}
	
	private void LayoutGUI() {
		all = new BorderPane();
	}
	
	private void registerHandlers(Stage stage) {
		
	}

}

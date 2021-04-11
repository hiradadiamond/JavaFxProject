package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.scene.paint.*;

import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.*;
import javafx.event.*;
import javafx.geometry.Insets;
import javafx.scene.layout.*;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Address Form");

		FlowPane flowPane = new FlowPane();
		GridPane firstRow = new GridPane();
		GridPane secondRow = new GridPane();
		GridPane thirdRow = new GridPane();
		flowPane.setAlignment(Pos.CENTER);
		flowPane.setHgap(9);
		flowPane.setVgap(5);
		firstRow.setHgap(30);
		secondRow.setHgap(30);
		thirdRow.setVgap(5);
		thirdRow.setPrefWidth(400);
		thirdRow.setAlignment(Pos.CENTER);

		// top, right, bottom, left
		flowPane.setPadding(new Insets(25, 25, 25, 25));

		Label userName = new Label(" Name:");
		Label street = new Label(" Street:");
		Label city = new Label(" City:");
		firstRow.add(userName, 0, 0);
		firstRow.add(street, 1, 0);
		firstRow.add(city, 2, 0);

		TextField usernameTextField = new TextField();
		TextField streetTextField = new TextField();
		TextField cityTextField = new TextField();
		firstRow.add(usernameTextField, 0, 1);
		firstRow.add(streetTextField, 1, 1);
		firstRow.add(cityTextField, 2, 1);

		Label state = new Label(" State:");
		Label zip = new Label(" Zip:");
		secondRow.add(state, 0, 0);
		secondRow.add(zip, 1, 0);

		TextField stateTextField = new TextField();
		TextField zipTextField = new TextField();
		secondRow.add(stateTextField, 0, 1);
		secondRow.add(zipTextField, 1, 1);

		Button btn = new Button("Submit");
		HBox hbBtn = new HBox(400);

		hbBtn.setAlignment(Pos.CENTER);
		hbBtn.getChildren().add(btn);
		thirdRow.add(hbBtn, 1, 4);

		Text actiontarget = new Text();

		thirdRow.add(actiontarget, 1, 6);

		btn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				actiontarget.setFill(Color.FIREBRICK);
				actiontarget.setText("Submit button pressed");
				System.out.println(usernameTextField.getText());
				System.out.println(streetTextField.getText());
				System.out
						.print(cityTextField.getText() + " " + stateTextField.getText() + " " + zipTextField.getText());

			}
		});

		flowPane.getChildren().add(firstRow);
		flowPane.getChildren().add(secondRow);
		flowPane.getChildren().add(thirdRow);
		Scene scene = new Scene(flowPane, 700, 275);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}

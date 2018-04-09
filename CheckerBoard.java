package application;

/**
 * Program: Programming Exercise_8_Ex6 
 * File: CheckerBoard.java
 * Summary: This is programming exercise 14.6 from the textbook. 
 * 			It displays a black and white checker board.
 * Author: Erica Morgan
 * Date: 4/6/2018 
 */

import javafx.application.*;
import javafx.geometry.Pos;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class CheckerBoard extends Application {

	@Override
	public void start(Stage primaryStage) {
		HBox pane = new HBox();
		pane.setAlignment(Pos.CENTER);

		for (int column = 0; column < 8; column++) {
			VBox col = new VBox();
			col.setAlignment(Pos.CENTER);
			for (int row = 0; row < 4; row++) {

				if (column % 2 == 0) {
					col.getChildren().add(new Rectangle(50, 50, Color.BLACK));
					col.getChildren().add(new Rectangle(50, 50, Color.WHITE));
				}
				else {
					col.getChildren().add(new Rectangle(50, 50, Color.WHITE));
					col.getChildren().add(new Rectangle(50, 50, Color.BLACK));
				}
					
			
			}
			pane.getChildren().add(col);
		}
		Scene scene = new Scene(pane, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Exercise 14.6");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}
}

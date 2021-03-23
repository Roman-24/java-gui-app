package fiit.oop.GUI;

import fiit.oop.Core.App;
import fiit.oop.Core.Order;
import fiit.oop.Storage.Buttons;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CreateOrderScene {

    protected Stage window;
    protected GridPane grid = new GridPane();

    // labels
    protected Label customerID = new Label("CustomerID: ");
    protected Label size = new Label("Veľkosť obleku: ");
    protected Label typeOfSuit = new Label("Typ obleku: ");
    protected Label clothMaterial = new Label("Požadovaný materiál: ");

    // TextFields
    protected TextField customerIDInput = new TextField();
    protected TextField sizeInput = new TextField();
    protected TextField typeOfSuitInput = new TextField();
    protected TextField clothMaterialInput = new TextField();

    protected Button createButton = new Button("Vytvoriť objednávku");
    protected Scene scene = new Scene(grid, 200, 800);
    protected App app;

    public CreateOrderScene(Stage primaryStage, App app) {
        this.app = app;

        GridPane.setConstraints(customerID, 0, 0);
        GridPane.setConstraints(size, 0, 1);
        GridPane.setConstraints(typeOfSuit, 0, 2);
        GridPane.setConstraints(clothMaterial, 0, 3);

        GridPane.setConstraints(customerIDInput, 1, 0);
        GridPane.setConstraints(sizeInput, 1, 1);
        GridPane.setConstraints(typeOfSuitInput, 1, 2);
        GridPane.setConstraints(clothMaterialInput, 1, 3);

        grid.getChildren().addAll(customerIDInput, sizeInput, typeOfSuitInput, clothMaterialInput, createButton);

        window.setScene(scene);
        window.show();
    }

}

package fiit.oop.GUI;

import fiit.oop.Core.ModelApp;
import fiit.oop.Core.Order;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ShowOrderScene {

    private Stage window;
    private GridPane grid = new GridPane();
    private Scene scene = new Scene(grid, 400, 600);

    public ShowOrderScene(Stage primaryStage, ModelApp modelApp) {

        window = primaryStage;
        window.setTitle("Aktuálne objednávky");

        grid.setPadding(new Insets(20, 20, 20, 20));
        grid.setVgap(10);
        grid.setHgap(10);

        int row = 0;
        for(Order order : modelApp.orders){

            // labels
            Label customerID = new Label("CustomerID: " + order.getCustomerID());
            Label size = new Label("Veľkosť obleku je " + order.getSize());
            Label typeOfSuit = new Label("Typ obleku je: " + order.getTypeOfSuit());
            Label clothMaterial = new Label("Použítý materiál: " + order.getClothMaterial());
            Label condition = new Label("Práce na objednávke sú vo fáze " + order.getCondition());

            GridPane.setConstraints(customerID, 0, row++);
            GridPane.setConstraints(size, 0, row++);
            GridPane.setConstraints(typeOfSuit, 0, row++);
            GridPane.setConstraints(clothMaterial, 0, row++);
            GridPane.setConstraints(condition, 0, row++);

            row++;

            grid.getChildren().addAll(customerID, size, typeOfSuit, clothMaterial, condition);
        }

        window.setScene(scene);
        window.show();
    }

}

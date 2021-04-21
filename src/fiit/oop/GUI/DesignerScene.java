package fiit.oop.GUI;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DesignerScene {

    private Stage window = new Stage();
    private Scene scene;
    private VBox vbox = new VBox(10);
    private Label includeYourDesign = new Label("Vložte dizajn: ");
    private TextField includeYourDesignInput = new TextField();
    private Label includeOrderNumber = new Label("Zadajte číslo objednávky");
    private TextField includeOrderNumberInput = new TextField();
    private Button showOrdersButton = new Button("Zobraziť objednávky");
    private Button setDesignButton = new Button("Odoslať dizajn");
    private Button logoutButton = new Button("Odhlasiť");

    public DesignerScene() {

        window.setTitle("Ste prihlásený ako Designer");

        vbox.setPadding(new Insets(10, 10, 10, 10));

        // nastavenie objektov do vbox
        vbox.getChildren().addAll(showOrdersButton, includeOrderNumber, includeOrderNumberInput,
                includeYourDesign, includeYourDesignInput, setDesignButton, logoutButton);

        // nastavenie scény
        scene = new Scene(vbox, 400, 400);
        window.setScene(scene);
    }

    public Stage getWindow() {
        return window;
    }

    public void setWindow(Stage window) {
        this.window = window;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public VBox getVbox() {
        return vbox;
    }

    public void setVbox(VBox vbox) {
        this.vbox = vbox;
    }

    public Label getIncludeYourDesign() {
        return includeYourDesign;
    }

    public void setIncludeYourDesign(Label includeYourDesign) {
        this.includeYourDesign = includeYourDesign;
    }

    public TextField getIncludeYourDesignInput() {
        return includeYourDesignInput;
    }

    public void setIncludeYourDesignInput(TextField includeYourDesignInput) {
        this.includeYourDesignInput = includeYourDesignInput;
    }

    public Label getIncludeOrderNumber() {
        return includeOrderNumber;
    }

    public void setIncludeOrderNumber(Label includeOrderNumber) {
        this.includeOrderNumber = includeOrderNumber;
    }

    public TextField getIncludeOrderNumberInput() {
        return includeOrderNumberInput;
    }

    public void setIncludeOrderNumberInput(TextField includeOrderNumberInput) {
        this.includeOrderNumberInput = includeOrderNumberInput;
    }

    public Button getShowOrdersButton() {
        return showOrdersButton;
    }

    public void setShowOrdersButton(Button showOrdersButton) {
        this.showOrdersButton = showOrdersButton;
    }

    public Button getSetDesignButton() {
        return setDesignButton;
    }

    public void setSetDesignButton(Button setDesignButton) {
        this.setDesignButton = setDesignButton;
    }

    public Button getLogoutButton() {
        return logoutButton;
    }

    public void setLogoutButton(Button logoutButton) {
        this.logoutButton = logoutButton;
    }
}

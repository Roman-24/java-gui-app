package fiit.oop.GUI;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TailorScene {

    private Stage window = new Stage();
    private Scene scene;
    private VBox vbox = new VBox();
    private Button showOrdersButton = new Button("Zobraziť objednávky");
    private Label includeOrderNumber = new Label("Zadajte číslo objednávky na kt. chcete pracovať");
    private TextField includeOrderNumberInput = new TextField();
    private Button logoutButton = new Button("Odhlasiť");
    private Button prepareTheClothButton = new Button("Nachystať látku");
    private Button makeRoughVersionButton = new Button("Pripraviť hrubú verziu");
    private Button earsTopSuitButton = new Button("Ušiť vrchnú časť");
    private Button earsBottomSuitButton = new Button("Ušiť spodnú časť");
    private Button finalizeSuitButton = new Button("Dokončiť oblek");

    public TailorScene(){

        window.setTitle("Ste prihlásený ako Tailor");

        vbox.setPadding(new Insets(10, 10, 10, 10));
        vbox.getChildren().addAll(showOrdersButton, includeOrderNumber, includeOrderNumberInput,
                prepareTheClothButton, makeRoughVersionButton, earsTopSuitButton, earsBottomSuitButton, finalizeSuitButton,
                logoutButton);

        scene = new Scene(vbox, 400,400);

        window.setScene(scene);
    }

    public Stage getWindow() {
        return window;
    }

    public void setWindow(Stage window) {
        this.window = window;
    }

    public VBox getVbox() {
        return vbox;
    }

    public void setVbox(VBox vbox) {
        this.vbox = vbox;
    }

    public Button getShowOrdersButton() {
        return showOrdersButton;
    }

    public void setShowOrdersButton(Button showOrdersButton) {
        this.showOrdersButton = showOrdersButton;
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

    public Button getLogoutButton() {
        return logoutButton;
    }

    public void setLogoutButton(Button logoutButton) {
        this.logoutButton = logoutButton;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public Button getPrepareTheClothButton() {
        return prepareTheClothButton;
    }

    public void setPrepareTheClothButton(Button prepareTheClothButton) {
        this.prepareTheClothButton = prepareTheClothButton;
    }

    public Button getMakeRoughVersionButton() {
        return makeRoughVersionButton;
    }

    public void setMakeRoughVersionButton(Button makeRoughVersionButton) {
        this.makeRoughVersionButton = makeRoughVersionButton;
    }

    public Button getEarsTopSuitButton() {
        return earsTopSuitButton;
    }

    public void setEarsTopSuitButton(Button earsTopSuitButton) {
        this.earsTopSuitButton = earsTopSuitButton;
    }

    public Button getEarsBottomSuitButton() {
        return earsBottomSuitButton;
    }

    public void setEarsBottomSuitButton(Button earsBottomSuitButton) {
        this.earsBottomSuitButton = earsBottomSuitButton;
    }

    public Button getFinalizeSuitButton() {
        return finalizeSuitButton;
    }

    public void setFinalizeSuitButton(Button finalizeSuitButton) {
        this.finalizeSuitButton = finalizeSuitButton;
    }
}

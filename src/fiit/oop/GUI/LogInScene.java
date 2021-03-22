package fiit.oop.GUI;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LogInScene {

    public Scene makeLogIn(Stage window){

        window.setTitle("Prihlásenie");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        // name label
        Label userNameLabel = new Label("Meno používateľa: ");
        GridPane.setConstraints(userNameLabel, 0, 0);
        // name inputs
        TextField nameInput = new TextField();
        GridPane.setConstraints(nameInput, 1, 0);

        // password label
        Label passLabel = new Label("Heslo: ");
        GridPane.setConstraints(passLabel, 0, 1);
        // password input
        TextField passInput = new TextField();
        GridPane.setConstraints(passInput, 1, 1);

        // login button
        Button loginButton = new Button("Prihlásiť sa");
        loginButton.setOnAction(e -> {
            checkUser(nameInput.getText(), passInput.getText());
        });

        GridPane.setConstraints(loginButton, 1, 2);

        grid.getChildren().addAll(userNameLabel, nameInput, passLabel, passInput, loginButton);

        Scene scene = new Scene(grid, 400,400);

        return scene;
    }

    private boolean checkUser(String userName, String pass){

        if(userName.equals("Boss") && pass.equals("0000"))
            return  true;
        else
            return false;
    }
}

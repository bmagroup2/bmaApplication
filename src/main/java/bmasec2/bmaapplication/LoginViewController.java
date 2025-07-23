package bmasec2.bmaapplication;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginViewController
{
    @javafx.fxml.FXML
    private ComboBox loginUserRoleComboBox;
    @javafx.fxml.FXML
    private TextField loginUsernameTextfield;
    @javafx.fxml.FXML
    private PasswordField loginPasswordTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void signInButtonOnAction(ActionEvent actionEvent) {
    }
}
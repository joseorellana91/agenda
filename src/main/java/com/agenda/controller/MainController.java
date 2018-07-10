package com.agenda.controller;

import com.agenda.Util.UserException;
import com.agenda.Util.UserValidation;
import com.agenda.entities.User;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class MainController {

    private UserValidation userValidation = new UserValidation();
    private User user;

    @FXML
    private TextField txtUser;

    @FXML
    private Button buttonSubmit;

    @FXML
    private PasswordField txtPass;

    @FXML
    private Hyperlink linkNewUser;

    @FXML
    private FontAwesomeIcon iconMinimize;

    @FXML
    private FontAwesomeIcon iconClose;

    @FXML
    void closeActionButton(MouseEvent event) {

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.close();
    }

    @FXML
    void linkNewUserAction(MouseEvent event) {

    }

    @FXML
    void minimizeActionButton(MouseEvent event) {
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setIconified(true);

    }

    @FXML
    void subitActionButton(MouseEvent event) {

        if(!emptyFields()){
            try{

                this.user = userValidation.ValidateUsername(this.txtUser.getText(), this.txtPass.getText());


            }catch(UserException e){

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle(e.getMessage());
                alert.setHeaderText(e.getMessage());
                alert.setContentText(e.getMessage());
                alert.showAndWait();


            }



        }
        else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("campos en blanco");
            alert.setHeaderText("campos en blanco");
            alert.setContentText("campos en blanco");
            alert.showAndWait();


        }

    }



    public boolean emptyFields(){
        if(this.txtPass.getText().isEmpty() || this.txtUser.getText().isEmpty()){

            return true;
        }

        return false;


    } //end of emptyFields





    public void init(){

        try {

            System.out.println ("Openning......");

            Stage LogIn = new Stage();
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("main.fxml"));

            LogIn.initStyle(StageStyle.TRANSPARENT);
            // Show the scene containing the root layout.


            // Show the scene containing the root layout.
            Scene scene = new Scene(root);

            scene.setFill(Color.TRANSPARENT);


            LogIn.setScene(scene);
            LogIn.show();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }




}

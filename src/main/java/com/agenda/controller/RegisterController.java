package com.agenda.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class RegisterController implements Initializable {



    @FXML
    private TextField txtName;

    @FXML
    private TextField txtLastName;

    @FXML
    private TextField txtUserName;

    @FXML
    private TextField txtEmail;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private PasswordField txtPassRepeat;

    @FXML
    private Button buttonRegister;

    @FXML
    private Button buttonCancel;

    @FXML
    void actionCancel(MouseEvent event) {

    }

    @FXML
    void actionClose(MouseEvent event) {

    }

    @FXML
    void actionMinimize(MouseEvent event) {

    }

    @FXML
    void actionRegister(MouseEvent event) {

    }







    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}

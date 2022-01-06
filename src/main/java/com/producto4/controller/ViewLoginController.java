/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.producto4.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.*;

/**
 * FXML Controller class
 *
 * @author rojaw
 */
public class ViewLoginController implements Initializable  {

    public ViewLoginController(){

    }

    @FXML
    private TextField username_login;
    
    @FXML
    private PasswordField password_login;
    
    @FXML
    private Button button_login;
    
    @FXML
    private Label wrong_login;
    
    @FXML
    private void eventKey(KeyEvent event){
    
    
    }
    
    @FXML
    private void eventAction(ActionEvent event){


    }
    
        
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

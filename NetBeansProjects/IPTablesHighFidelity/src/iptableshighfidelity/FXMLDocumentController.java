package iptableshighfidelity;

import java.awt.Component;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.stage.*;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javafx.stage.DirectoryChooser;
import javafx.stage.Window;

/**
 *
 * @author christopherchang
 */
public class FXMLDocumentController implements Initializable 
{
    
    @FXML
    private void flushTables(ActionEvent event)
    {
        
        try
        {
            
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FlushDialog.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));  
            stage.show();
        }
        catch(Exception e)
        {
            System.out.println("Cannot open menu");
        }
    }
    
    @FXML
    private void newOptionSelected(ActionEvent event)
    {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));  
            stage.show();
        }
        catch(Exception e)
        {
            System.out.println("Cannot open menu");
        }
    }
    
    @FXML
    private void handleButtonAction(ActionEvent event) 
    {
        try
        {
            
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("InformationWindow.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));  
            stage.show();
        }
        catch(Exception e)
        {
            System.out.println("Cannot open menu");
        }
    }
    
    @FXML
    private void saveOption(ActionEvent event)
    {
       FileChooser fileChooser = new FileChooser();
       fileChooser.showSaveDialog(null);
       
    }
    
    @FXML 
    private void loadOption(ActionEvent event)
    {
        FileChooser fileChooser = new FileChooser();
        fileChooser.showOpenDialog(null);
    }
    
    @FXML
    private void deleteRulePressed(ActionEvent event)
    {
        try
        {
            
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("DeleteRule.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));  
            stage.show();
        }
        catch(Exception e)
        {
            System.out.println("Cannot open wizard");
        }
    }
    
    @FXML
    private void addRulePressed()
    {
        try
        {
            
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddRule.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));  
            stage.show();
        }
        catch(IOException e)
        {
            System.out.println("Cannot open wizard");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }     
}

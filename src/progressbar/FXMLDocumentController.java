/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progressbar;

import com.jfoenix.controls.JFXProgressBar;
import com.jfoenix.controls.JFXSlider;
import com.jfoenix.controls.JFXSpinner;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Onyekachukwu
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private JFXSlider slide;

    @FXML
    private JFXProgressBar progressBar;

    @FXML
    private JFXSpinner spinner;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // for slide
        slide.setMin(0);
        slide.setMax(50);
        
        // for progress bar
        progressBar.setProgress(0);
        
        // for spinner
        spinner.setProgress(0);
        
        // set slide function
        slide.valueProperty().addListener((ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {
            progressBar.setProgress(new_val.doubleValue()/50);
            spinner.setProgress(new_val.doubleValue()/50);
        });
    }    
    
}

package Controllor;


import Entity.offre;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ItemControllor {
    public javafx.scene.control.Label labelN,labelDate ;

    @FXML
    private JFXButton reserver;

    @FXML
    private HBox hbox;
    @FXML
    private ImageView imageViewId;
    @FXML
    private Label labelNB;
    private String[] colors = {"FFFFFF"};

    private String FilePath;
    @FXML
    void clickImagess(MouseEvent event) {
        if (Desktop.isDesktopSupported()) {
            try {
                File myFile = new File(FilePath);
                Desktop.getDesktop().open(myFile);
            } catch (IOException ex) {
                // no application registered for PDFs
            }
        }
        System.out.println(FilePath);
    }






    public void setData(offre f){
     //   this.FilePath=f.getPthFile();
        Image image = new Image("file:///"+f.getImage());
        hbox.setStyle("-fx-background-color: #" + colors[(int) (Math.random() * colors.length)]+";"+
                "-fx-background-radius:15;"+
                "-fx-effect: dropShadow (three-pass-box,rgba(0,0,0,0.1), 10 , 0 , 0 , 10);");
        imageViewId.setImage(image);
        labelN.setText(f.getTitle());
        labelDate.setText( f.getTitle());

    }


    public void reserver(ActionEvent event) throws Exception {

            Parent root  = FXMLLoader.load(getClass().getResource("../gui/commandAdd.fxml"));

            Stage window =(Stage) reserver.getScene().getWindow();
            window.setScene(new Scene(root, 290, 377));
        }

}


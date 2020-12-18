package org.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class PrimaryController {


    public void NewDocumentAction(ActionEvent actionEvent) {
        App.document = App.createDocument.createNew();
        new Alert(Alert.AlertType.INFORMATION, "Документ создан: " + App.document.toString()).showAndWait();
    }

    public void OpenDocumentAction(ActionEvent actionEvent) {
        App.document = App.createDocument.createOpen();
        new Alert(Alert.AlertType.INFORMATION, "Документ открыт: " + App.document.toString()).showAndWait();
    }

    public void SaveDocumentAction(ActionEvent actionEvent) {
        App.document = App.createDocument.createSave();
        new Alert(Alert.AlertType.INFORMATION, "Документ сохранен: " + App.document.toString()).showAndWait();
    }

    public void ExitAction(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void ChoiceMusic(ActionEvent actionEvent) {
        App.createDocument = new CreateMusicDocument();
    }

    public void ChoiceImage(ActionEvent actionEvent) {
        App.createDocument = new CreateImageDocument();

    }

    public void ChoiceText(ActionEvent actionEvent) {
        App.createDocument = new CreateTextDocument();
    }
}

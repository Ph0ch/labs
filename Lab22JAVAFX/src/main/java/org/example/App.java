package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class App extends Application {

    private static Scene scene;

    static IDocument document;
    static ICreateDocument createDocument;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        // По умолчанию TextDocument
        createDocument= new CreateTextDocument();

        launch();



//        TestCreateDocuments();
//
//        TestCreateTextDocument();
//
//        TestCreateMusicDocument();
//
//        TestCreateImageDocument();
    }


//
//    private static void TestCreateImageDocument() {
//        createDocument= new CreateImageDocument();
//        document = createDocument.createNew();
//        document = createDocument.createOpen();
//    }
//
//    private static void TestCreateMusicDocument() {
//        createDocument= new CreateMusicDocument();
//        document = createDocument.createNew();
//        document = createDocument.createOpen();
//    }
//
//    private static void TestCreateTextDocument() {
//        createDocument= new CreateTextDocument();
//        document = createDocument.createNew();
//        document = createDocument.createOpen();
//    }
//
//    private static void TestCreateDocuments() {
//        document = new TextDocument();
//        document = new MusicDocument();
//        document = new ImageDocument();
//    }
}

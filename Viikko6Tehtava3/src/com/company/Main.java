package com.company;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20, 20, 20, 20));
        grid.setVgap(5);
        grid.setHgap(5);
        primaryStage.setTitle("Harjoitus Ohjelma");

        ImageView imageView = new ImageView(new Image("https://www.savonia.fi/app/uploads/2020/10/savonia_logo_2020.png"));
        imageView.setFitHeight(50);
        imageView.setFitWidth(100);
        grid.add(imageView, 15, 0, 1, 1);

        //asetetaan nimi otsikko ja tekstikenttä
        Label labelnimi = new Label();
        labelnimi.setText("Nimi");
        GridPane.setConstraints(labelnimi, 0, 0);
        final TextField name = new TextField();
        name.setPromptText("Nimi");
        name.setPrefColumnCount(15);
        name.getText();
        GridPane.setConstraints(name, 0, 1);
        grid.getChildren().addAll(name, labelnimi);


        //Asetetaan hinta otsikko ja tekstikenttä
        Label labelhinta = new Label();
        labelhinta.setText("Hinta");
        GridPane.setConstraints(labelhinta, 0, 2);
        final TextField hinta = new TextField();
        hinta.setPromptText("Hinta");
        GridPane.setConstraints(hinta, 0, 3);
        grid.getChildren().addAll(hinta, labelhinta);

        //Asetetaan Ostaja otsikko ja tekstikenttä
        Label labelostaja = new Label();
        labelostaja.setText("Ostaja");
        GridPane.setConstraints(labelostaja, 0, 4);
        final TextField ostaja = new TextField();
        ostaja.setPromptText("Ostaja");
        GridPane.setConstraints(ostaja, 0, 5);
        grid.getChildren().addAll(ostaja, labelostaja);

        //luodaan sulje painike
        Button sulje = new Button("Sulje");
        GridPane.setConstraints(sulje, 15, 15);
        grid.getChildren().add(sulje);

        //luodaan tallenna painike
        Button tallenna = new Button("Tallenna");
        GridPane.setConstraints(tallenna, 0, 15);
        grid.getChildren().add(tallenna);

        //luodaan combo box tuotteille
        Label labeltuote = new Label();
        labeltuote.setText("Tuote");
        GridPane.setConstraints(labeltuote, 0, 6);
        ObservableList<String> options =
                FXCollections.observableArrayList(
                        "Tietokone",
                        "Hiiri",
                        "Näyttö"
                );
        final ComboBox comboBox = new ComboBox(options);
        GridPane.setConstraints(comboBox, 0, 7);
        grid.getChildren().addAll(comboBox, labeltuote);

        //luodaan kalenteri
        Label labelpaiva = new Label();
        labelpaiva.setText("Päivämäärä");
        GridPane.setConstraints(labelpaiva, 0, 8);
        DatePicker paivamaara = new DatePicker();
        GridPane.setConstraints(paivamaara, 0, 9);
        grid.getChildren().addAll(paivamaara, labelpaiva);

        primaryStage.setScene(new Scene(grid, 375, 375));
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);

    }

}


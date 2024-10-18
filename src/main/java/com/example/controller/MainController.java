package com.example.controller;// Dans MainController.java
import com.example.model.Chanson;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField titreField;

    @FXML
    private TextField artisteField;

    @FXML
    private TextField dureeField;

    @FXML
    private Button ajouterButton;

    @FXML
    private ListView<Chanson> playlistView; // Assurez-vous que c'est de type Chanson

    @FXML
    private void ajouterChanson() {
        String titre = titreField.getText();
        String artiste = artisteField.getText();
        int duree = Integer.parseInt(dureeField.getText());

        Chanson nouvelleChanson = new Chanson(titre, artiste, duree);

        // Ajouter la nouvelle chanson à la ListView
        playlistView.getItems().add(nouvelleChanson);

        // Réinitialiser les champs de texte
        titreField.clear();
        artisteField.clear();
        dureeField.clear();


        // Désactiver le bouton après l'ajout
        ajouterButton.setDisable(true);
    }

}

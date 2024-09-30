package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import model.Deck;
import javafx.scene.control.Alert;

public class MainDashboardController {

    @FXML
    private ListView<Deck> deckListView;

    private ObservableList<Deck> decks = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Example: Preload some decks (later, this will be loaded from data storage)
        decks.add(new Deck("History"));
        decks.add(new Deck("Science"));

        deckListView.setItems(decks);
    }

    @FXML
    public void handleCreateSet() {
        Deck newDeck = new Deck("New Deck");
        decks.add(newDeck);
    }

    @FXML
    public void handleStudyDeck() {
        Deck selectedDeck = deckListView.getSelectionModel().getSelectedItem();
        if (selectedDeck == null) {
            showAlert("No deck selected", "Please select a deck to study.");
        } else {
            // Logic to open the quiz mode for the selected deck
        }
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.showAndWait();
    }
}

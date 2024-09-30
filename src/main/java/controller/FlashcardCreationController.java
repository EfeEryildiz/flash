package controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.Deck;
import model.Flashcard;

public class FlashcardCreationController {

    @FXML
    private TextField questionField;
    @FXML
    private TextField answerField;

    private Deck currentDeck;

    // This method is called to initialize the controller with the selected deck
    public void setCurrentDeck(Deck deck) {
        this.currentDeck = deck;
    }

    @FXML
    public void handleSave() {
        String question = questionField.getText();
        String answer = answerField.getText();

        if (!question.isEmpty() && !answer.isEmpty()) {
            Flashcard flashcard = new Flashcard(question, answer);
            currentDeck.addFlashcard(flashcard);
            clearFields();
        }
    }

    private void clearFields() {
        questionField.clear();
        answerField.clear();
    }
}

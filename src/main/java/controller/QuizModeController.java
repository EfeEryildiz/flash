package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import model.Deck;
import model.Flashcard;
import javafx.scene.control.Button;

import java.util.List;

public class QuizModeController {

    @FXML
    private Label questionLabel;
    @FXML
    private Label answerLabel;
    @FXML
    private Button showAnswerButton;
    @FXML
    private Button nextQuestionButton;

    private List<Flashcard> flashcards;
    private int currentIndex;

    public void startQuiz(Deck deck) {
        this.flashcards = deck.getFlashcards();
        this.currentIndex = 0;
        showNextQuestion();
    }

    public void handleShowAnswer() {
        answerLabel.setVisible(true);
    }

    public void handleNextQuestion() {
        currentIndex++;
        if (currentIndex < flashcards.size()) {
            showNextQuestion();
        } else {
            // Logic to end the quiz
            nextQuestionButton.setDisable(true);
        }
    }

    private void showNextQuestion() {
        Flashcard currentCard = flashcards.get(currentIndex);
        questionLabel.setText(currentCard.getQuestion());
        answerLabel.setText(currentCard.getAnswer());
        answerLabel.setVisible(false);
    }
}

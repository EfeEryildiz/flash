package model;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private String title;
    private List<Flashcard> flashcards;

    public Deck(String title) {
        this.title = title;
        this.flashcards = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Flashcard> getFlashcards() {
        return flashcards;
    }

    public void addFlashcard(Flashcard flashcard) {
        flashcards.add(flashcard);
    }

    public void removeFlashcard(Flashcard flashcard) {
        flashcards.remove(flashcard);
    }

    public void editFlashcard(int index, String question, String answer) {
        Flashcard flashcard = flashcards.get(index);
        flashcard.setQuestion(question);
        flashcard.setAnswer(answer);
    }
}

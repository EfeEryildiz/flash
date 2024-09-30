package utils;

import model.Deck;

import java.io.*;
import java.util.List;

public class DataManager {

    private static final String FILE_PATH = "decks.dat";

    public static void saveDecks(List<Deck> decks) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            out.writeObject(decks);
        }
    }

    public static List<Deck> loadDecks() throws IOException, ClassNotFoundException {
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            return null;
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            return (List<Deck>) in.readObject();
        }
    }
}

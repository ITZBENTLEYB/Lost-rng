import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameLogic {

    private List<AnimeCharacter> characters;

    public GameLogic() {
        characters = new ArrayList<>();
        // Add characters from various anime
        characters.add(new AnimeCharacter("Yuji Itadori", "Jujutsu Kaisen", 80));
        characters.add(new AnimeCharacter("Satoru Gojo", "Jujutsu Kaisen", 100));
        characters.add(new AnimeCharacter("Luffy", "One Piece", 90));
        characters.add(new AnimeCharacter("Zoro", "One Piece", 85));
        characters.add(new AnimeCharacter("Tanjiro Kamado", "Demon Slayer", 85));
        characters.add(new AnimeCharacter("Nezuko Kamado", "Demon Slayer", 80));
        characters.add(new AnimeCharacter("Saiki Kusuo", "Saiki K", 60));
        characters.add(new AnimeCharacter("Gabimaru", "Hell's Paradise", 90));
    }

    // Method to randomly select a character
    public AnimeCharacter spinForCharacter() {
        Random rand = new Random();
        int index = rand.nextInt(characters.size());
        return characters.get(index);
    }

    // Method to simulate a battle between two characters
    public String battle(AnimeCharacter char1, AnimeCharacter char2) {
        if (char1.getPower() > char2.getPower()) {
            return char1.getName() + " wins!";
        } else if (char2.getPower() > char1.getPower()) {
            return char2.getName() + " wins!";
        } else {
            return "It's a tie!";
        }
    }
}
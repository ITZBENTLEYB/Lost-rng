public class AnimeCharacter {
    private String name;
    private String anime;
    private int power;

    // Constructor
    public AnimeCharacter(String name, String anime, int power) {
        this.name = name;
        this.anime = anime;
        this.power = power;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public String getAnime() {
        return anime;
    }

    public int getPower() {
        return power;
    }
}
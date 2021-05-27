package pl.krisT.asercja;

public class Superhero {
    private final String Abilities;
    private final String Color;
    private final String Publisher;

    public Superhero(String abilities, String color, String publisher) {
        Abilities = abilities;
        Color = color;
        Publisher = publisher;
    }

    public String getAbilities() {
        return Abilities;
    }

    public String getColor() {
        return Color;
    }

    public String getPublisher() {
        return Publisher;
    }

}

package pl.krisT.asercja;

public class Superheros extends Superhero{
    private String hulk;
    private String captainAmerica;


    public Superheros(String abilities, String color, String publisher) {
        super(abilities, color, publisher);
    }

    public String getHulk() {
        return hulk;
    }

    public String getCaptainAmerica() {
        return captainAmerica;
    }

    public static void main(String[] args) {
        Superheros superheros = new Superheros("simple", "green","Marvel");
        superheros.getHulk();
    }


    }


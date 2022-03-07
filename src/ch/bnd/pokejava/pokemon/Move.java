package ch.bnd.pokejava.pokemon;

public class Move {

    String name;
    int powerPoints;
    int precision;
    String Type;

    public Move(String name, int powerPoints, int precision, String type) {
        this.name = name;
        this.powerPoints = powerPoints;
        this.precision = precision;
        Type = type;
    }

    @Override
    public String toString() {
        return "Move : " + name;
    }
}
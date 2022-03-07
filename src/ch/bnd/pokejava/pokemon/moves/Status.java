package ch.bnd.pokejava.pokemon.moves;

import ch.bnd.pokejava.pokemon.Move;

public class Status extends Move {

    int statusModifier;

    public Status(String name, int powerPoints, int precision, int statsModifier, String type) {
        super(name, powerPoints, precision, type);
    }
}

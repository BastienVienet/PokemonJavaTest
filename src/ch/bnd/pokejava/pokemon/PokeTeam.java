package ch.bnd.pokejava.pokemon;

import java.util.ArrayList;
import java.util.List;

public class PokeTeam {

    ArrayList<Pokemon> Pokemons;

    public PokeTeam(Pokemon... pokemons) {
        this.Pokemons = new ArrayList<>(List.of(pokemons));
    }

    public ArrayList<Pokemon> getPokemons() {
        return Pokemons;
    }

}

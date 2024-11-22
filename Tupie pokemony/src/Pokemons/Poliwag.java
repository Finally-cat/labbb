package Pokemons;

import ru.ifmo.se.pokemon.*;

import attaks.*;

public class Poliwag extends Pokemon {
    public Poliwag(String name, int level) {
        super(name, level);
        super.setType(Type.WATER);
        super.setStats(40, 50, 40, 40, 40, 90);

        addMove(new Psychic());
        addMove(new Scald());
    }
}

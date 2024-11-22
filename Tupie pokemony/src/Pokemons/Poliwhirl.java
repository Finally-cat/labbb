package Pokemons;

import ru.ifmo.se.pokemon.*;

import attaks.*;

public class Poliwhirl extends Poliwag {
    public Poliwhirl(String name, int level) {
        super(name, level);
        super.setType(Type.WATER);
        super.setStats(65, 65, 65, 50, 50, 90);

        addMove(new BellyDrum());
    }

}

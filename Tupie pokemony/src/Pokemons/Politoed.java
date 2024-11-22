package Pokemons;

import ru.ifmo.se.pokemon.*;

import attaks.*;

public class Politoed extends Poliwhirl{
    public Politoed(String name, int level) {
        super(name, level);
        super.setType(Type.WATER);
        super.setStats(90, 75, 75, 90, 100, 70);

        addMove (new Scald());
    }
}

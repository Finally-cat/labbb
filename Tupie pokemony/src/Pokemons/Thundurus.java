package Pokemons;

import ru.ifmo.se.pokemon.*;

import attaks.*;

public class Thundurus extends Pokemon{
    public Thundurus(String name, int level) {
        super(name, level);
        super.setType(Type.ELECTRIC, Type.FLYING);
        super.setStats(79, 115, 70, 125, 80, 111);

        addMove (new Confide());
        addMove(new SludgeBomb());
        addMove (new Agility());
        addMove (new ChargeBeam());
    }
}

package Pokemons;

import ru.ifmo.se.pokemon.*;

import attaks.*;

public class Simisage extends Pansage{
    public Simisage(String name, int level) {
        super(name, level);
        super.setType(Type.GRASS);
        super.setStats(75, 98, 63, 98, 63, 101);

        addMove (new RockSlide());
    }
}


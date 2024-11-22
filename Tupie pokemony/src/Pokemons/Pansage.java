package Pokemons;

import ru.ifmo.se.pokemon.*;

import attaks.*;

public class Pansage extends Pokemon{
    public Pansage(String name, int level) {
        super(name, level);
        super.setType(Type.GRASS);
        super.setStats(50, 53, 48, 53, 48, 64);

        addMove (new LowSweep());
        addMove(new EnergyBall());
        addMove (new Swagger());
    }
}

package Maincl;

import Pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main (String[] args){

        Battle b = new Battle();
        Pokemon p1 = new Simisage("Чужой", 1);
        Pokemon p2 = new Thundurus("Хищник", 2);
        Pokemon p3 = new Politoed("Bobr", 3);
        Pokemon p4 = new Pansage("Чупопин", 5);
        Pokemon p5 = new Poliwag("mitsubishi", 3);
        Pokemon p6 = new Poliwag("po", 5);

        b.addAlly(p1);
        b.addAlly(p3);
        b.addAlly(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.addFoe(p2);
        b.go();
    }
}
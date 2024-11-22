package attaks;

import java.util.Random;

import ru.ifmo.se.pokemon.*;

public class SludgeBomb extends SpecialMove {
    private boolean oppIsPoisoned = false;
    public SludgeBomb() {
        super(Type.POISON, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        int i = (int) (Math.random() * 100);
        if (i < 31) {
            oppIsPoisoned = true;
            Effect.poison(p);
        }

    }

    @Override
    protected String describe() {
        return "Использовал Sludge bomb " + ((oppIsPoisoned) ? "и отравил цель" : "");

    }
}

package attaks;

import ru.ifmo.se.pokemon.*;

public class Scald extends SpecialMove {
    private boolean oppIsBurned = false;
    public Scald() {
        super(Type.WATER, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        int i = (int) (Math.random() * 100);
        if (i < 31) {
            oppIsBurned = true;
            Effect.burn(p);
        }

    }

    @Override
    protected String describe() {
        return "Использовал Scald " + ((oppIsBurned) ? "и поджёг цель" : "");

    }
}

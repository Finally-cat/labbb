package attaks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class RockSlide extends PhysicalMove {
    public RockSlide() {
        super(Type.ROCK, 75, 90);
    }

    private boolean isFlinched = false;

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.3) {
            isFlinched = true;
            Effect.flinch(p);
        }
    }

    @Override
    protected String describe() {
        return "Использовал RockSlide " + ((isFlinched) ? "и flinch цель" : "");
    }
}
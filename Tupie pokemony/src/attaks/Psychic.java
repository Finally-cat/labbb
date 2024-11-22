package attaks;

import ru.ifmo.se.pokemon.*;

public class Psychic extends SpecialMove {
    private boolean isLowDef = false;
    public Psychic() {
        super(Type.PSYCHIC, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        int i = (int) (Math.random() * 100);
        if (i < 11) {
            isLowDef = true;
            p.setMod(Stat.SPECIAL_DEFENSE, -1);
        }

    }

    @Override
    protected String describe() {
        return "Использовал Psychic " + ((isLowDef) ? "и понизил специальную защиту цели" : "");

    }
}

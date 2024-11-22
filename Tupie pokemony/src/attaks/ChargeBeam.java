package attaks;

import ru.ifmo.se.pokemon.*;

import java.util.Random;

public class ChargeBeam extends SpecialMove{
    public ChargeBeam() {
        super(Type.ELECTRIC, 50, 90);
    }

    boolean selfCharged;
    @Override
    protected void applySelfEffects(Pokemon p) {
        int i = (int) (Math.random() * 100);
        if (i < 31) {
            selfCharged = true;

            p.addEffect(new Effect().stat(Stat.SPECIAL_ATTACK, +2));
        }

    }

    @Override
    protected String describe() {
        return "Использовал Charge Beam " + ((selfCharged) ? "и усилил свою специальнкую атаку на 2" : "");

    }
}

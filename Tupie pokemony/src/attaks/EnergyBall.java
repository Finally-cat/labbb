package attaks;

import ru.ifmo.se.pokemon.*;

public class EnergyBall extends SpecialMove {
    public EnergyBall() {
        super(Type.GRASS, 90, 100);
    }
    private boolean isLowDef = false;
    @Override
    protected void applyOppEffects(Pokemon p) {
        int i = (int) (Math.random() * 100);
        if (i < 11) {
            p.setMod(Stat.SPECIAL_DEFENSE, -1);
            isLowDef = true;
        }
    }

    @Override
    protected String describe(){
        return "Использовал Energy Ball " + ((isLowDef) ? "и понизил специальную защиту цели" : "");
    }
}

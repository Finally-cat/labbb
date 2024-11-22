package attaks;

import ru.ifmo.se.pokemon.*;

public class BellyDrum extends PhysicalMove {
    public BellyDrum() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.HP, -2);
        p.setMod(Stat.ATTACK, +6);

    }

    @Override
    protected String describe(){
        return "Использовал Belly Drum и уменьшил на 50% и увеличил атаку на максимум";
    }
}

package main.java.moves.physical;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class WoodHammer extends PhysicalMove {
    public WoodHammer(){
        super(Type.GRASS, 120, 100);
    }

    @Override
    protected void applySelfDamage(Pokemon p, double damage){
        p.setMod(Stat.HP, (int)Math.round(damage / 3));
    }

    @Override
    protected String describe() {
        return ("обрушает своё древесное тело на цель, подобно молоту");
    }
}

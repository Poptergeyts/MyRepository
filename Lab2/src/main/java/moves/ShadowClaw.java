package main.java.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class ShadowClaw extends PhysicalMove {
    public ShadowClaw(){
        super(Type.GHOST, 70, 100);
    }

    @Override
    protected String describe() {
        return ("использует Shadow Claw");
    }
}

package main.java.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class PlayRough extends PhysicalMove {
    public PlayRough(){
        super(Type.FAIRY, 90, 90);
    }

    @Override
    protected String describe() {
        return ("использует PlayRough");
    }
}

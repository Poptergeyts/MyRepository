package main.java.moves;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Scald  extends SpecialMove {
    public Scald(){
        super(Type.WATER, 80, 100);
    }

    @Override
    protected String describe() {
        return ("использует Scald");
    }
}

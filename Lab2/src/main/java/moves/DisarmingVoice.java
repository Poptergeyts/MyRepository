package main.java.moves;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class DisarmingVoice extends SpecialMove {
    public DisarmingVoice(){
        super(Type.FAIRY, 40, Double.POSITIVE_INFINITY);
    }

    @Override
    protected String describe() {
        return ("использует DisarmingVoice");
    }
}

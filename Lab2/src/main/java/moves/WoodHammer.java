package main.java.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class WoodHammer extends PhysicalMove {
    public WoodHammer(){
        super(Type.GRASS, 120, 100);
    }

    @Override
    protected String describe() {
        return ("использует Wood Hammer");
    }
}

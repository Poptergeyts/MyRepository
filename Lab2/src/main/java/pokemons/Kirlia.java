package main.java.pokemons;

import main.java.moves.DisarmingVoice;
import ru.ifmo.se.pokemon.Type;

public class Kirlia extends Ralts {
    public Kirlia(String name, int level){
        super(name, level);
        setType(Type.PSYCHIC, Type.FAIRY);
        setStats(38, 35, 35, 65, 55, 50);
        addMove(new DisarmingVoice());
    }
}

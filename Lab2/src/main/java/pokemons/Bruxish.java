package main.java.pokemons;

import main.java.moves.PlayRough;
import main.java.moves.Scratch;
import main.java.moves.ShadowClaw;
import main.java.moves.WoodHammer;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bruxish extends Pokemon{
    public Bruxish(String name, int level){
        super(name, level);
        setType(Type.WATER, Type.PSYCHIC);
        setStats(68, 105, 70, 70, 70, 92);
        setMove(new PlayRough(), new WoodHammer(), new ShadowClaw(), new Scratch());
    }
}

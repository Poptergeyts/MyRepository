package main.java;

import main.java.pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Lab2 {
    public static void main(String[] args){
        Battle battle = new Battle();
        Bruxish bruxish = new Bruxish("Гандж", 1);
        Surskit surskit = new Surskit("Цезарь", 1);
        Masquerain masquerain = new Masquerain("Грозны", 1);
        Ralts ralts = new Ralts("Евро", 1);
        Kirlia kirlia = new Kirlia("Грим", 1);
        Gallade gallade = new Gallade("Буян", 1);

        battle.addAlly(bruxish);
        battle.addAlly(surskit);
        battle.addAlly(masquerain); 
        battle.addFoe(ralts);
        battle.addFoe(kirlia);
        battle.addFoe(gallade);
        battle.go();
    }
}

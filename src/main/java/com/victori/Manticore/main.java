package main.java.com.victori.Manticore;
import java.util.Arrays;

import main.java.com.victori.Manticore.player.Player;
import main.java.com.victori.Manticore.player.heroes.Hero;

public class Main{
    public static void main(String[] args) {
        Player Zizzy = new Player();
        Zizzy.comeToLife();
        Hero Razik = new Hero();
        Zizzy.setHero(Razik);
        Zizzy.changeBaseStats();
        System.out.println(Arrays.toString(Zizzy.getBaseStats())); 
    }
}
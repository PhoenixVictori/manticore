package main.java.com.victori.Manticore.player;

import main.java.com.victori.Manticore.player.heroes.Hero;

public class Player{
    private boolean playerIsAlive;
    private Hero hero;
    private int health;
    private int attack;
    private int defense;
    private int luck;

    //set functions
    public void setPlayerIsAlive(boolean playerIsAlive) {
        this.playerIsAlive = playerIsAlive;
    }
    public void setHero(Hero hero) {
        this.hero = hero;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public void setDefense(int defense) {
        this.defense = defense;
    }
    public void setLuck(int luck) {
        this.luck = luck;
    }

    //get functions
    public boolean getPlayerIsAlive(){
        return playerIsAlive;
    }
    public Hero getHero() {
        return hero;
    }
    public int getHealth() {
        return health;
    }
    public int getAttack() {
        return attack;
    }
    public int getDefense() {
        return defense;
    }
    public int getLuck() {
        return luck;
    }
    public int[] getBaseStats(){
        int[] baseStats = {health, attack, defense, luck};
        return baseStats;
    }

    public void comeToLife(){
        setPlayerIsAlive(true);
    }

    public void changeBaseStats(){
        Hero activeHero = this.hero;
        setHealth(activeHero.getHealth());
        setAttack(activeHero.getAttack());
        setDefense(activeHero.getDefense());
        setLuck(activeHero.getLuck());
    }
}
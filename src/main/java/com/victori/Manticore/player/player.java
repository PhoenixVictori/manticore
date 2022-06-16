package main.java.com.victori.Manticore.player;

public class player{
    private boolean playerIsAlive;
    private int health;
    private int attack;
    private int defense;
    private int luck;

    //set functions
    public void setPlayerIsAlive(boolean playerIsAlive) {
        this.playerIsAlive = playerIsAlive;
    }
    public void setHealth(int health) {
        this.health = health;
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
}
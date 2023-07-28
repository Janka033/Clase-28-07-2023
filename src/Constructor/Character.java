package Constructor;

public class Character {
    private String name;
    private int life;
    private int damage;
    private int elixirCost;
    public Character(String name, int life, int damage, int elixirCost) {
        this.name = name;
        this.life = life;
        this.damage = damage;
        this.elixirCost = elixirCost;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getElixirCost() {
        return elixirCost;
    }

    public void setElixirCost(int elixirCost) {
        this.elixirCost = elixirCost;
    }
}

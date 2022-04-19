package model;

public class Character {

    public String name;
    public Double strength;
    public Double hp;

    public Character(String name, Double strength) {
        this.name = name;
        this.strength = 10 * strength;
        this.hp = 100.0;
    }

    public String getName() {
        return name;
    }

    public Double getStrength() {
        return strength;
    }

    public Double getHp() {
        return hp;
    }

    public void setHp(Double hp) {
        this.hp = hp;
    }
}

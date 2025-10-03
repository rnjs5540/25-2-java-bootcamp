package 권태환.assignment3;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Character {
    String name;
    int hp;
    int maxHp;
    int minAttack;
    int maxAttack;

    public Character(String name, int maxHp, int attack) {
        this.name = name;
        this.maxHp = this.hp = maxHp;
        this.minAttack = 0;
        this.maxAttack = attack;
    }

    public void Character(String name, int hp, int attack){
        this.name = name;
        this.hp = hp;
        this.minAttack = attack;
    }

    public abstract void attack(Character target);

    public abstract void introduce();
}

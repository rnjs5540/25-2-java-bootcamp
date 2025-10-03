package 권태환.assignment4;

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

    public abstract void attack(Character target);

    public abstract void introduce();
}

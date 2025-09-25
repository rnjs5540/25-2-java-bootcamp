package assignment2;

import java.util.concurrent.ThreadLocalRandom;

public class Player {
    String name;
    int hp;
    int maxHp;
    int minAttack;
    int maxAttack;

    public Player(String name, int maxHp) {
        this.name = name;
        this.hp = this.maxHp = maxHp;
        this.minAttack = 0;
        this.maxAttack = 20;
    }

    public void introduce() {
        System.out.println("[플레이어 정보] 이름: " + this.name + ", HP: " + this.hp + "/" + this.maxHp);
    }

    public void attack(Monster target) {
        int damage = ThreadLocalRandom.current().nextInt(minAttack, maxAttack + 1);
        target.hp -= damage;
        System.out.println(this.name + "(이)가 " + target.name + "을(를) 공격! " + damage + "의 데미지를 입혔습니다.");
    }
}
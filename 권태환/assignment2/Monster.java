package assignment2;

import java.util.concurrent.ThreadLocalRandom;

public class Monster {

    String name;
    int hp = 100;
    int maxHp = 100;
    int maxAttack = 100;
    int minAttack = 0;

    public Monster(String name){
        this.name = name;
    }

    public void attack(Monster target) {
        int damage = ThreadLocalRandom.current().nextInt(minAttack, maxAttack + 1);
        target.hp -= damage;
        System.out.println(this.name + "(이)가 " + target.name + "을(를) 공격! " + damage + "의 데미지를 입혔습니다.");
        System.out.println(this.name + "(이)가 화가났습니다. minAttack이 10만큼 증가하였습니다.");
        this.minAttack += 10;
    }

    public void attack(Player target) {
        int damage = ThreadLocalRandom.current().nextInt(minAttack, maxAttack + 1);
        target.hp -= damage;
        System.out.println(this.name + "(이)가 " + target.name + "을(를) 공격! " + damage + "의 데미지를 입혔습니다.");
    }

    public void introduce() {
        System.out.println("[몬스터 정보] 이름: " + this.name + ", HP: " + this.hp + "/" + this.maxHp);
    }
}
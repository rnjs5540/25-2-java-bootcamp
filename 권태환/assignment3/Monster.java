package 권태환.assignment3;

import java.util.concurrent.ThreadLocalRandom;

public class Monster extends Character {

    public Monster(String name, int maxHp, int attack) {
        super(name, maxHp, attack);
    }

    @Override
    public void attack(Character target) {
        int damage = ThreadLocalRandom.current().nextInt(minAttack, maxAttack + 1);
        target.hp -= damage;
        System.out.println(this.name + "(이)가 " + target.name + "을(를) 공격! " + damage + "의 데미지를 입혔습니다.");
    }

    @Override
    public void introduce() {
        System.out.println("[몬스터 정보] 이름: " + this.name + ", HP: " + this.hp + "/" + this.maxHp);
    }
}
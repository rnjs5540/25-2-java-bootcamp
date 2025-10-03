package 권태환.assignment4;

import java.util.concurrent.ThreadLocalRandom;

public class Monster extends Character implements SpecialAbility{

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

    @Override
    public void castSpell(Character target) {
        System.out.println(this.name + "(이)가 힐을 사용하였습니다.");
        int heal = ThreadLocalRandom.current().nextInt(1, 5);
        target.hp += heal;
        System.out.println(this.name + "(이)가 " + heal + "만큼 회복하였습니다.");
    }
}
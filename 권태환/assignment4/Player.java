package 권태환.assignment4;

import java.util.concurrent.ThreadLocalRandom;

public class Player extends Character {
    protected int totalAttackCount;

    public Player(String name, int maxHp, int attack) {
        super(name, maxHp, attack);
    }

    @Override
    public void introduce() {
        System.out.println("[플레이어 정보] 이름: " + this.name + ", HP: " + this.hp + "/" + this.maxHp);
    }

    @Override
    public void attack(Character target) {
        totalAttackCount++;
        int damage = ThreadLocalRandom.current().nextInt(minAttack, maxAttack + 1);
        target.hp -= damage;
        System.out.println(this.name + "(이)가 " + target.name + "을(를) 공격! " + damage + "의 데미지를 입혔습니다.");
    }

    public void getTotalAttackCount(){
        System.out.println("총 " + totalAttackCount + "번 공격하였습니다.");
    }
}
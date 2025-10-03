package 권태환.assignment4;

import java.util.concurrent.ThreadLocalRandom;

public class mage extends Player implements SpecialAbility{

        public mage(String name, int maxHp, int attack) {
            super(name, maxHp, attack);
            System.out.println();
        }

        @Override
        public void castSpell(Character target) {
            super.totalAttackCount++;
            int damage = ThreadLocalRandom.current().nextInt(10, maxAttack*2 + 1);
            target.hp -= damage;
            System.out.println(this.name + "(이)가 썬더 볼트를 사용하였습니다.");
            System.out.println(target.name + "(이)가 " + damage + "만큼 피해를 입었습니다.");
        }

        public void introduce() {
            super.introduce();
        }

}

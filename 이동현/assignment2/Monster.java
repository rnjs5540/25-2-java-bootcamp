package 이동현.assignment2;

public class Monster {
    private String name;
    private int hp;
    private int attack;

    public Monster(String name) {
        this.name = name;
        this.hp = 100;
        this.attack = 40;
    }

    public void introduce() {
        System.out.println("[몬스터 정보] 이름: " + this.name + ", HP: " + this.hp + ", 공격력: " + this.attack);
    }

    // Player 공격
    public void attack(Player p) {
        if (p == null) return;
        p.setHp(p.getHp() - this.attack);
        System.out.println(this.name + "이 " + p.getName() + "을 공격 -" + this.attack + " HP");
    }

    // Monster 공격
    public void attack(Monster m) {
        if (m == null) return;
        if (m == this) {
            this.attack += 10;
            System.out.println(this.name + "이 공격당해 공격력이 " + this.attack + "으로 증가함");
        } else {
            m.setHp(m.getHp() - this.attack);
            System.out.println(this.name + "이 " + m.getName() + "을 공격 -" + this.attack + " HP");
        }
    }

    // getter / setter
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = Math.max(0, hp); // 음수 방지
    }

    public String getName() {
        return name;
    }
}
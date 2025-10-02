package 이동현.assignment2;

public class Player {
    private String name;
    private int hp;
    private int attack;

    public Player(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.attack = 20;
    }

    public void introduce() {
        System.out.println("[플레이어 정보] 이름: " + this.name + ", HP: " + this.hp + ", 공격력: " + this.attack);
    }

    public void attack(Monster target) {
        if (target == null) return;

        target.setHp(target.getHp() - this.attack);
        System.out.println(this.name + "이(가) " + target.getName() + "을(를) 공격" + this.attack + " HP");
    }

    // getter & setter
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = Math.max(0, hp); // 음수 방지
    }
}
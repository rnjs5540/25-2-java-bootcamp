package 이동현.assignment2;

public class Game {
    public static void main(String[] args) {
        Player player = new Player("Donghyun Lee", 100);
        player.introduce();
        Monster monster = new Monster("Slime");
        monster.introduce();

        System.out.println("\n--- 전투 시작 ---");

        // 전투 루프
        while (player.getHp() > 0 && monster.getHp() > 0) {
            // 1. Player -> Monster 공격
            player.attack(monster);
            player.introduce();
            monster.introduce();
            System.out.println();

            if (monster.getHp() <= 0) break; // 몬스터 쓰러짐 체크

            // 2. Monster -> Monster 공격 (자기 자신 공격)
            monster.attack(monster);
            player.introduce();
            monster.introduce();
            System.out.println();

            if (monster.getHp() <= 0) break;

            // 3. Monster -> Player 공격
            monster.attack(player);
            player.introduce();
            monster.introduce();
            System.out.println();

            if (player.getHp() <= 0) break; // 플레이어 쓰러짐 체크
        }

        System.out.println("\n--- 전투 종료 ---");
        player.introduce();
        monster.introduce();
    }
}
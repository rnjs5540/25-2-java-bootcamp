package assignment2;

public class Game {
    public static void main(String[] args) {
        Player player = new Player("권태환", 100);
        player.introduce();
        Monster monster = new Monster("Slime");
        monster.introduce();

        System.out.println("\n--- 전투 시작 ---");

        while(true) {
            player.attack(monster);
            if(monster.hp <= 0) {
                break;
            }
            monster.attack(monster);
            if(monster.hp <= 0) {
                break;
            }
            monster.attack(player);
            if(player.hp <= 0){
                break;
            }

            player.introduce();
            monster.introduce();
            System.out.println();
        }

        System.out.println("\n--- 전투 종료! ---");
        player.introduce();
        monster.introduce();
    }
}
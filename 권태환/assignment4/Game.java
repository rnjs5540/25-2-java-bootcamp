package 권태환.assignment4;

import java.util.*;

public class Game {
    public static void main(String[] args) {

        mage Mage = new mage("마법사", 100, 20);
        warrior Warrior = new warrior("전사", 200, 10);

        ArrayList<Player> player = new ArrayList<Player>();
        player.add(Mage);
        player.add(Warrior);

        for(Player p : player) {
            p.introduce();
        }

        Monster monster = new Monster("Slime", 1000, 5);
        monster.introduce();

        System.out.println("\n--- 전투 시작 ---");



        while(true) {
            for(Player p : player) {
                if(p instanceof SpecialAbility){
                    ((SpecialAbility) p).castSpell(monster);
                }
                else{
                    p.attack(monster);
                }
            }
            if(monster.hp <= 0) {
                System.out.println(monster.name + "(이)가 쓰러졌다.");
                break;
            }
            if(monster instanceof SpecialAbility) {
                monster.castSpell(monster);
            }

            for(Player p : player) {
                monster.attack(p);
            }

            if(player.get(0).hp <= 0 &&  player.get(1).hp <= 0) {
                System.out.println("레이드 실패");
                break;
            }

            for(Player p : player) {
                p.introduce();
            }
            monster.introduce();
            System.out.println();
        }

        System.out.println("\n--- 전투 종료! ---");
        for(Player p : player) {
            p.introduce();
            p.getTotalAttackCount();
        }
        monster.introduce();
    }
}
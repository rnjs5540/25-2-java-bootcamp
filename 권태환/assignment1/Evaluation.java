package assignment1;

import java.util.*;

public class Evaluation {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[] score = new int[5];

        for(int i =0; i<score.length; ++i){
            score[i] = s.nextInt();
        }

        int count = 0;
        for(int i =0; i<score.length; ++i){
            if(score[i] >= 60){
                ++count;
                System.out.println("합격");
            }
            else{
                System.out.println("불합격");
            }
        }

        System.out.println("최종 합격자는 " + count + "명 입니다.");
    }
}

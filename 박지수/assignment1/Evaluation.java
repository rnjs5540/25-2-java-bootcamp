package 박지수.assignment1;

import java.util.Scanner;

public class Evaluation {
    public static void main(String[] args) {

        int[] scores = new int[5];
        Scanner scanner = new Scanner(System.in);


        System.out.println("점수를 입력해주세요.");
        for (int i=0;i<scores.length; i++) {
            scores[i]=scanner.nextInt();
        }

        int n = 0;
        for (int i = 0; i<scores.length; i++)
        {
            if(scores[i]>= 60){
                n=n+1;
                System.out.println(i+"번 학생 점수:"+scores[i]+" 합격!");
            }
            else {
                System.out.println(i+"번 학생 점수:"+scores[i]+" 불합격!");
            }
        }

        System.out.println("최종 합격 인원:"+n);

    }
}

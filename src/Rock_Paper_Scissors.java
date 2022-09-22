import com.sun.source.tree.CaseTree;

import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors {

    final int scissor = 0;
    final int rock = 1;
    final int paper = 2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("가위(0), 바위(1), 보(2)");
        int user = sc.nextInt();


        int computer = (int)(Math.random()*3);

        if(user == computer){
            System.out.println("비겼습니다.");
        }
        else if (user == (computer + 1) % 3) // 0은 1한테 지고 1은 2한테, 2는 0한테 진다.
            //컴퓨터가 0이면 (0 + 1) % 3 = 2(보) , 1이면 2 % 3 = 1 (주먹) , 2이면 3 % 3 = 0 (가위)

            System.out.println("유저: " + user + "    컴퓨터: " + computer + "   유저 승!");
        else
            System.out.println("유저: " + user + "    컴퓨터: " + computer + "   컴퓨터 승!");

        sc.close();
    }
}

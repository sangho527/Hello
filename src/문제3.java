import java.util.Scanner;

public class 문제3 {

    //금액을 넣었을때 ex) 120000원을 넣었을때 50000원 두장 10000원 두장이 나와야하는

        public static void main(String[] args) {
        int money;



        Scanner sc = new Scanner(System.in); // System.in 사용자로부터 입력을 받기위한 입력 스트림
        System.out.print("금액을 넣으세요: " );
        money = sc.nextInt();

        System.out.println("50000원" + money/50000 + "개");
                money = money % 50000;
        System.out.println("10000원" + money/10000 + "개");
                money = money % 10000;
        System.out.println("5000원" + money/5000 + "개");
                money = money % 5000;
        System.out.println("1000원" + money/1000 + "개");
                money = money % 1000;
        System.out.println("500원" + money/500 + "개");
                money = money % 500;
        System.out.println("100원" + money/100 + "개");
                money = money % 100;
        System.out.println("50원" + money/50 + "개");
                money = money % 50;
        System.out.println("10원" + money/10 + "개");


        
    }
}

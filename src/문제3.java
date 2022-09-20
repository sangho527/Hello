import java.util.Scanner;

public class 문제3 {


        public static void main(String[] args) {
        int money;



        Scanner sc = new Scanner(System.in);
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

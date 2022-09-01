import java.util.Scanner;

public class 문제1 {
    public static void main(String[] args) {
        double radius;
        double PI = Math.PI;





        Scanner sc = new Scanner(System.in); // System.in 사용자로부터 입력을 받기위한 입력 스트림
        System.out.print("반지름을 입력하세요 : " );
        radius = sc.nextFloat();

        double area = radius*radius*PI;
        System.out.print("원의 넓이는 : " + area);

    }
}

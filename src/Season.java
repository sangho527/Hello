import java.util.Scanner;

public class Season {
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("월을 입력하세요");
        n = sc.nextInt();


        switch (n) {
            case 1:
            case 2:
                System.out.println("겨울");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("봄");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("여름");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("가을");
                break;
            case 12:
                System.out.println("겨울");
                break;

            default:
                System.out.println("올바른 입력 형식이 아닙니다.");

        }
    }
}

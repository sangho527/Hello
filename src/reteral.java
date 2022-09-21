import java.util.Scanner;

public class reteral {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        num = sc.nextInt();

        char ch = (char)num;
        System.out.println(ch);
    }
}

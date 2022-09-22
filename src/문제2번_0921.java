import java.util.Random;
import java.util.Scanner;

public class 문제2번_0921 {

    public static void main(String[] args) {
        Random random = new Random();
        int answer = random.nextInt(100);
        int input_num;
        int count = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("정답을 추측하여 보시오");

        do {
            System.out.println("정답:");
            input_num = sc.nextInt();
            count++;

            if (input_num > answer) {
                System.out.println("LOW");
            }
            if (input_num < answer) {
                System.out.println("HIGH");
            }
        } while (input_num != answer);
        System.out.printf("축하합니다.  " + "시도횟수=" + count);

    }

}

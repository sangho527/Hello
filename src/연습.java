import java.util.PrimitiveIterator;
import java.util.Scanner;

public class 연습 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int size = arr.length;

        Scanner sc = new Scanner(System.in);

        for(int i=0; i < size; i++){
            System.out.println("숫자를 입력해주세요");
            arr[i] = sc.nextInt();
        }

        System.out.println(arr[0] + "," + arr[1] + "," + arr[2] );


    }
}
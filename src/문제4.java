import javax.xml.crypto.Data;
import java.sql.SQLOutput;
import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

public class 문제4 {
    public static void main(String[] args) {

        String title;
        String name;
        LocalDate now = LocalDate.now();






        Scanner sc = new Scanner(System.in);
        ArrayList<String> data = new ArrayList<String>();

        while(true){

            System.out.println("1.전체리스트 2.등록 0.종료");
            String input = sc.next();


            if(input.equals("1")) {
                System.out.println("== 게시물 리스트 ==");
                System.out.println("no          "+"title            "+"date");
                System.out.println(String.format(String.valueOf(now)));




            }
            else if (input.equals("2")) {
                System.out.print("제목:");
                title = sc.next();
                System.out.print("작성자:");
                name = sc.next();
                System.out.println("글이 추가 되었습니다.");
            }
            else if (input.equals("0")) {
                System.out.println("프로그램이 종료되었습니다.");
                break;
            }


        }
    }
}

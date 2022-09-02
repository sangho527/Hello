import javax.xml.crypto.Data;
import java.sql.SQLOutput;
import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;


public class 문제4 {
    public static void main(String[] args) {

        ArrayList<String> title = new ArrayList<String>();
        String name = null;
        LocalDate now = LocalDate.now();
        int size = title.size();
        String newline = System.getProperty("line.separator");
        title.add(0, "");

        


        Scanner sc = new Scanner(System.in);
        boolean bool = true;


        while (bool) {


            System.out.println("1.전체리스트 2.등록 0.종료");
            int input = sc.nextInt();
            

            switch (input) {
                case 1:{

                    System.out.println("== 게시물 리스트 ==");
                    System.out.println("no          " + "title                  " + "date");
                    for (int i = 1; i <title.size(); i++){
                    System.out.printf("%d           %s            %s", i, title.get(i), now + newline);
                    }
                    break;


                }
                case 2 : {

                    System.out.print("제목:");
                    String str = sc.next();
                    title.add(str);
                    System.out.print("작성자:");
                    name = sc.next();
                    System.out.println("글이 추가 되었습니다.");
                    break;
                }

                case 0: {
                    System.out.println("프로그램이 종료되었습니다.");
                    bool = false;
                }


            }
        }
    }
}
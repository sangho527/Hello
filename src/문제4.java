import javax.xml.crypto.Data;
import java.sql.SQLOutput;
import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;


/*class post {
    private final long name;
    private final String title;
    private final LocalDate createdAt;


}*/
public class 문제4 {
    public static void main(String[] args) {

        ArrayList<String> title = new ArrayList<String>();
        String name = null;
        LocalDate now = LocalDate.now();


        Scanner sc = new Scanner(System.in);





        while(true) {


                System.out.println("1.전체리스트 2.등록 0.종료");
                String input = sc.next();

                if (input.equals("1")) {
                    System.out.println("== 게시물 리스트 ==");
                    System.out.println("no          " + "title            " + "date");
                    System.out.printf("%d           %s          %s\n", i, title.get(i), now);

                    //System.out.printf("%d           %s          %s\n", i, title.get(i), now);
                    //System.out.println(i.toString(), title.toString(), now.toString());


                } else if (input.equals("2")) {
                    System.out.print("제목:");
                    String str = sc.next();
                    title.add(str);
                    /*title.add(sc.next());*/
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

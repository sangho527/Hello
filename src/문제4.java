import javax.xml.crypto.Data;
import java.sql.SQLOutput;
import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;


public class 문제4 {
    public static void main(String[] args) {

        ArrayList<String> title = new ArrayList<String>(); // 어레이리스트를 통해 객체를 저장하게 했습니다.
        String name = null;
        LocalDate now = LocalDate.now(); // 로컬데이트 api를 사용해 현재 날짜 출력
        int size = title.size();
        String newline = System.getProperty("line.separator"); // 개행문자를 사용해 게시판 글 목록을 아래로 내려줍니다.
        title.add(0, ""); // 0번째 인덱스에 공백을 넣어 1부터 출력이 되게합니다.

        


        Scanner sc = new Scanner(System.in);
        boolean bool = true;


        while (bool) { // while문 무한루프를 사용해 종료를 눌러야 나갈 수 있게 만듭니다.


            System.out.println("1.전체리스트 2.등록 0.종료");
            int input = sc.nextInt();
            

            switch (input) {
                case 1:{

                    System.out.println("== 게시물 리스트 ==");
                    System.out.println("no          " + "title                  " + "date");
                    for (int i = 1; i <title.size(); i++){ //for 문을 사용해 게시물 번호를 갱신해줍니다.
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
                    bool = false; // false 논리 값을 통해 while문 종료
                }


            }
        }
    }
}
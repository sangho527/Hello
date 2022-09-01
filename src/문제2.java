public class 문제2 {
    public static void main(String[] args) {

        // 1~100까지 , 7의 배수이자 8의 배수인것, = 7과 8의 공배수

        for (int i = 1; i < 100; i++) {
            if ((i % 7 == 0) && (i % 8 == 0)) {
                System.out.println("찾는정수:" + i);
            }
        }


    }
}

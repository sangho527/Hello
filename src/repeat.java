public class repeat {

    public static void main(String[] args) {

        for(int i= 1; i <=9; i++){
            System.out.println(i + "단");

            for (int j = 1; j <=9; j++){
                System.out.println(i + "x" + j + "=" + i*j);
            }
            System.out.println();
        }

        /* int num1 = 5;
        int num2 = 7;
        int i = 1;


        while (i <= 100) {
            if ((i % num1 == 0 && i % num2 ==0)){
                System.out.println("찾는 정수:" + i++);

            }
            i++;
            continue;



        }
*/
    }
}



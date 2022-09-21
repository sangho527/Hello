import java.util.Arrays;

public class lotto {

    public static void main(String[] args) {


        int [] arrLotto = new int[6];

        for(int i=0; i<arrLotto.length;i++) {

            arrLotto[i] = (int)(Math.random() * 46) + 1;

            for(int j=0; j<i; j++) {

                if(arrLotto[i] == arrLotto[j])

                    i--;
            }
        }

        System.out.println(Arrays.toString(arrLotto));

    }
}

public class array1 {

    public static void main(String[] args) {

        int[] arr1 = new int[1000];
        int res = 0;

        for(int i=0; i<1000; i++) {
            arr1[i] = i + 1;
        }
        for(int i = 0; i < 1000; i++) {
            res += arr1[i];
        }

        System.out.println(res);


    }
}

public class 연습{
    static int nSize = 4;

    public static void main(String[] args) {
        int[] arr = new int[nSize];
        makeArray(arr);
        
        for(int i = 0; i<nSize; i++) {
            System.out.println(arr[i] + "");
        }
    }

    public static void makeArray(int[] args) {
        for(int i = 0; i<nSize; i++) {
            int[] arr = new int[0];
            arr[i] = i;
        }
    }
}
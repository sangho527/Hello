public class 연습 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 30;
        int max_value = (x > y) ? x : y;
        max_value = (max_value > z) ? max_value : z;

        System.out.println(max_value);
    }
}
import javax.sound.sampled.Line;

public class 문제1번_0921 {
    public static void main(String[] args) {

        String tree = "*";
        for (int i = 0; i < 4; i++){
            for (int j = 3 - i; j > 0; j--){
                System.out.print(" ");

            }
            System.out.println(tree);
            tree += "**";
        }
    }
}

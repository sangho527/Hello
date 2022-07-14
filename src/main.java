import java.io.*;


class Triangular{
    public static void main(String[] args) {
        int value = tri(100);
        System.out.println("결과=" + value);
    }
    public static int tri(int n){
        if(n==1)
            return 1;
        else
            return (n+tri(n-1));
    }
}
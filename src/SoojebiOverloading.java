public class SoojebiOverloading {
    public static void main(String[] args) {
        A a = new A();

        a.fn();

        a.fn(7);

        a.fn(10.0);

        System.out.println(a.fn(2,3));
    }
}

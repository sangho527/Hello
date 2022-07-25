class A{
    static void f() {
        System.out.println("1");

}

    class B extends A {
        static void f() {
            System.out.println("3");
        }

        public class C {
            public void main(String[] args) {
                A a = new B();
                a.f();
            }
        }

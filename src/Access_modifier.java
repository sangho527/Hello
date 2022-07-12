public class Access_modifier {
    String name = "홍길동";
    public int age = 40;
    protected  int height = 170;
    private int weight = 68;
}
class Child extends Access_modifier{
    public static void main(String[] args) {
        Child c = new Child();

        System.out.println(c.name);
        System.out.println(c.age);
        System.out.println(c.height);
        //System.out.println(c.weight); // weight 는 private 접근지정자를 사용하기 때문에 상속관계에서 사용이 불가능하다.
    }
}
class circle {
    int radius;
    String color;

    double calcArea() {
        return 3.14 * radius * radius;
    }
}

public class circleTest {
    public static void main(String[] args) {
        circle obj;
        obj = new circle();
        obj.radius = 100;
        obj.color = "blue";
        double area = obj.calcArea();
        System.out.println("원의 면적=" + area);

    }
}

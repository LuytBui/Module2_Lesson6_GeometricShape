public class Main {

    public static void main(String[] args) {

        Shape c1 = new Circle(3, "red", false);
        System.out.println(c1);
        System.out.printf("Area: %.2f, Perimeter: %.2f\n", c1.getArea(), c1.getPerimeter());

        Shape r1 = new Rectangle();
        System.out.println(r1);
        System.out.printf("Area: %.2f, Perimeter: %.2f\n", r1.getArea(), r1.getPerimeter());

        Shape s1 = new Square();
        System.out.println(s1);
        System.out.printf("Area: %.2f, Perimeter: %.2f\n", s1.getArea(), s1.getPerimeter());



    }
}

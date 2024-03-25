public class Circle {
    int radius;

    public double CirclePrint(){
        return radius*radius*3.14;
    }
    public static void main(String [] args){
        Circle circle1 = new Circle();
        circle1.radius = 8;
        System.out.println(circle1.CirclePrint());
    }
}

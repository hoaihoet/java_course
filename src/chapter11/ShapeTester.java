package chapter11;

public class ShapeTester {
    public static void main(String [] args){
        Shape rectange = new Rectange(5,7);
        rectange.print();
        rectange.calculateArea();
        System.out.println(rectange.calculateArea());
    }
}

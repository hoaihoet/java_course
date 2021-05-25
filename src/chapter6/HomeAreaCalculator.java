package chapter6;

public class HomeAreaCalculator {
    public static void main(String arg[]){
        //Create instance  of Rectangle class
        Rectangle room1 = new Rectangle();
        room1.setWidth(25);
        room1.setLength(50);
        double areOfRoom1 = room1.calculateArea();

        //Create instance of Rectangle class
        Rectangle room2 = new Rectangle(30, 75);
        double areaOfRoom2 = room1.calculateArea();

        double totalArea = areOfRoom1 + areaOfRoom2;
        System.out.println("Area of both rooms : "+ totalArea);

    }
}

package day02;

public class Geometry {

    public static void main(String [] args) {

        Rectangle rectangle = new Rectangle(3.15, 6.33);

        System.out.println("a oldal= " + rectangle.getSideA() + " cm.");
        System.out.println("b oldal= " + rectangle.getSideB() + " cm.");
        System.out.println("A téglalap területe: " + rectangle.calculateArea() + " cm.");
    }
}

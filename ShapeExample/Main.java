package ShapeExample;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter radius for calculating area and perimeter of circle: ");
        int circleRadius= sc.nextInt();
        Shape circle=new Circle(circleRadius);

        System.out.println();
        System.out.println("Enter Length & Width for Rectangle: ");
        int rectangleLength=sc.nextInt();
        int rectangleWidth=sc.nextInt();

        Shape rectangle=new Rectangle(rectangleLength,rectangleWidth);

        System.out.println();
        System.out.println("Enter base,height,side1 and side 2 for Triangle: ");
        int triangleBase=sc.nextInt();
        int triangleHeight=sc.nextInt();
        int triangleSide1=sc.nextInt();
        int triangleSide2=sc.nextInt();

        Shape triangle=new Triangle(triangleBase,triangleHeight,triangleSide1,triangleSide2);

        System.out.println();
        circle.calculateArea();
        circle.calculatePerimeter();

        System.out.println();

        rectangle.calculateArea();
        rectangle.calculatePerimeter();

        System.out.println();

        triangle.calculateArea();
        triangle.calculatePerimeter();



        }
}

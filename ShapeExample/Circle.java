package ShapeExample;


public class Circle implements Shape{
 int circleRadius;
 double circleArea;
 double circlePerimeter;

 Circle(int circleRadius){
     this.circleRadius=circleRadius;
 }
    @Override
    public void calculateArea() {
     circleArea=3.14*circleRadius*circleRadius;
     System.out.println("Area of Circle: "+circleArea);

    }

    @Override
    public void calculatePerimeter() {
     circlePerimeter=2*3.14*circleRadius;
        System.out.println("Perimeter of Circle: "+circlePerimeter);

    }
}

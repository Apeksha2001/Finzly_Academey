package ShapeExample;

public class Rectangle implements Shape{
    int rectangleLength;
    int rectangleWidth;
    int rectangleArea;
    int rectanglePerimeter;

    Rectangle( int rectangleLength,int rectangleWidth){
        this.rectangleLength=rectangleLength;
        this.rectangleWidth=rectangleWidth;
    }

    @Override
    public void calculateArea() {
        rectangleArea=rectangleLength*rectangleWidth;
        System.out.println("Area of Rectangle: "+rectangleArea);

    }

    @Override
    public void calculatePerimeter() {
        rectanglePerimeter=2*(rectangleLength+rectangleWidth);
        System.out.println("Perimeter of rectangle: "+rectanglePerimeter);

    }
}

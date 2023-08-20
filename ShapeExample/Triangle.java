package ShapeExample;

public class Triangle implements Shape{
    int triangleBase;
    int triangleHeight;
    int triangleSide1,triangleSide2;
    double triangleArea;
    int trianglePerimeter;

    Triangle( int triangleBase,int triangleHeight,int triangleSide1,int triangleSide2){
        this.triangleBase =triangleBase;
        this.triangleHeight =triangleHeight;
        this.triangleSide1=triangleSide1;
        this.triangleSide2=triangleSide2;
    }

    @Override
    public void calculateArea() {
        triangleArea = 0.5 * triangleBase * triangleHeight;
        System.out.println("Area of Triangle: "+ triangleArea);

    }

    @Override
    public void calculatePerimeter() {
        trianglePerimeter =triangleBase+triangleSide1+triangleSide2;
        System.out.println("Perimeter of rectangle: "+ trianglePerimeter);

    }
}
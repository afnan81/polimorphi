interface Shape{
    double getArea();
}
class Rectangle implements Shape{
    private double width;
    private double height;

    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    @Override
    public double getArea(){
        return width*height;
    }
}

class Circle implements Shape{
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double getArea(){
        return 3.14*radius*radius;
    }
}

class AreaCalculator{
    public double sumAreas(Shape[] shapes) {
        double totalArea=0;
        for (Shape shape : shapes){
            totalArea += shape.getArea();
        }
        return totalArea;
    }
}
public class Main{
    public static void main(String[]args){
        Shape[] shapes=new Shape[2];
        shapes[0]=new Rectangle(3,5);
        shapes[1]=new Circle(9);

        AreaCalculator calculator=new AreaCalculator();
        double totalArea=calculator.sumAreas(shapes);

        System.out.println("Total Area"+totalArea);
    }
}

public class Circle extends Shape {
  double radius;
  final double PI = 3.142;

  public Circle(String color, double radius){
    super(color);
    this.radius = radius;
  }

  @Override
  public double calculateArea(){
    return (PI*this.radius*this.radius);
  }

  @Override
  public double calculatePerimeter(){
    return 2*PI*this.radius;
  }

  @Override
  public void display(){
    System.out.println("This is a "+this.color+" Circle");
  }
}

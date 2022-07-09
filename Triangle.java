public class Triangle extends Shape {
  double height;
  double base;

  public Triangle(String Color,double height, double base){
    super(Color);
    this.base = base;
    this.height = height;
  }
  @Override
  public double calculateArea(){
    return (this.height*this.base)/2;
  }

  @Override
  public double calculatePerimeter(){
    return ((this.height+this.base)+Math.sqrt((this.height*this.height)+(this.base*this.base)));
  }

  @Override
  public void display(){
    System.out.println("This is a "+super.color+" Triangle");

  }  

}

public class Main {
  public static void main(String[] args){
    Triangle obj1 = new Triangle("red", 12, 5);
    System.out.println("Area of a Triangle : "+obj1.calculateArea());
    System.out.println("Perimeter of a Triangle : "+obj1.calculatePerimeter());
    obj1.display();
    System.out.println();

    Rectangle obj2 = new Rectangle("Bule", 3, 4);
    System.out.println("Area of a Rectangle : "+obj2.calculateArea());
    System.out.println("Perimeter of a Rectangle : "+obj2.calculatePerimeter());
    obj2.display();
    System.out.println();

    Circle obj3 = new Circle("Purple", 3);
    System.out.println("Area of a Rectangle : "+obj3.calculateArea());
    System.out.println("Perimeter of a Rectangle : "+obj3.calculatePerimeter());
    obj3.display();
    System.out.println();


    Square obj4 = new Square("White", 4, 4);
    System.out.println("Area of square : "+obj4.calculateArea());
    System.out.println("Perimeter if a square : "+obj4.calculatePerimeter());
    obj4.display();


  
  }
}

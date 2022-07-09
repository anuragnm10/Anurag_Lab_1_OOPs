public class Square extends Rectangle{
  
  public Square(String color, double height, double width){
    super(color, height, width);
  }

  @Override
  public void display(){
    System.out.println("This is a "+super.color+" color Square");
  }

}

// Main
public class TestMain {
   public static void main(String[] args) {
      Circle c1 = new Circle(1.1); //Cercle
      System.out.println(c1);   
      Circle c2 = new Circle(); 
      System.out.println(c2);
      c1.setRadius(2.2);
      System.out.println(c1);   
      System.out.println("radius is: " + c1.getRadius());
      System.out.printf("area is: %.2f%n", c1.getArea());
      System.out.printf("circumference is: %.2f%n", c1.getCircumference());
      
      Rectangle r1 = new Rectangle(1.2f, 3.4f); //Rectangle
      System.out.println(r1);  
      Rectangle r2 = new Rectangle();  
      System.out.println(r2);
      r1.setLength(5.6f);
      r1.setWidth(7.8f);
      System.out.println(r1);  
      System.out.println("length is: " + r1.getLength());
      System.out.println("width is: " + r1.getWidth());
      System.out.printf("area is: %.2f%n", r1.getArea());
      System.out.printf("perimeter is: %.2f%n", r1.getPerimeter());
   }
}

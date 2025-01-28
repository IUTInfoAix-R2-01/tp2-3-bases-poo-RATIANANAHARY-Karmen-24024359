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
      
      Employee e1 = new Employee(8, "Peter", "Tan", 2500); // Employé
      System.out.println(e1);  
      e1.setSalary(999);
      System.out.println(e1);  
      System.out.println("id is: " + e1.getId());
      System.out.println("firstname is: " + e1.getFirstName());
      System.out.println("lastname is: " + e1.getLastName());
      System.out.println("salary is: " + e1.getSalary());

      System.out.println("name is: " + e1.getName());
      System.out.println("annual salary is: " + e1.getAnnualSalary());
      System.out.println(e1.raiseSalary(10));
      System.out.println(e1);
   }
}

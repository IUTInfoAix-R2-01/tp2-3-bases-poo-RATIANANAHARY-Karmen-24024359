// Exercice 1 Circle
public class Circle {
    private double radius;
    private String color;
    
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }
    
    public String getColor() {
        return this.color;
    }
  
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
   
    public double getArea() {
        return Math.PI * radius * radius;
    }
  
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }

	public Object getCircumference() {
		// TODO Auto-generated method stub
		return null;
	}
}

/*Raymond Luu
 * TCSS143
 * John Mayer
 * 10/31/11
 */
public class Circle extends Shape {
    private double myRadius;
    
    public Circle(final double radius) {
        setRadius(radius);
    }
    
    public void setRadius(final double newRadius) {
        if(newRadius <= 0) {
            throw new IllegalArgumentException("Radius can not be less than or equal to 0");
        }
        myRadius = newRadius;
    }
    
    public double calculateArea() {
        double area = Math.PI * myRadius * myRadius;
        return area;
    }
    
    public String toString() {
        return "Circle:    [Radius: " + myRadius + "]";
    }
}

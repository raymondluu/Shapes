/*Raymond Luu
 * TCSS143
 * John Mayer
 * 10/31/11
 */
public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;
    
    public Triangle(final double a, final double b, final double c) {
        if(a > b + c || b > a + c || c > a + b || a == b + c || b == a + c || c == a + b) {
            throw new IllegalArgumentException("Triangle does not exist");
        }
        sideA = a;
        sideB = b;
        sideC = c;
    }
    
    public double calculateArea() {
        double s = (sideA + sideB + sideC)/2;//semiperimeter or half of triangle perimeter
        double area = Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
        return area;
    }
    
    public String toString() {
        return "Triangle: [Side A:" + sideA + ", Side B:" + sideB + ", Side C:" + sideC + "]";
    }
}

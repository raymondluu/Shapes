/*Raymond Luu
 * TCSS143
 * John Mayer
 * 10/31/11
 */
public class Rectangle extends Shape {
    private double myLength;
    private double myWidth;
    
    public Rectangle(final double length, final double width) {
        setLength(length);
        setWidth(width);
    }
    
    public void setLength(final double newLength) {
    	if(newLength <= 0) {
    		throw new IllegalArgumentException("Length can not be less than equal to 0");
    	}
        myLength = newLength;
    }
    
    public void setWidth(final double newWidth) {
    	if(newWidth <= 0) {
    		throw new IllegalArgumentException("Width can not be less than equal to 0");
    	}
        myWidth = newWidth;
    }
    
    public double calculateArea() {
        double area = myLength * myWidth;
        return area;
    }
    
    public String toString() {
        return "Rectangle: [Length:" + myLength + ", Width:" + myWidth + "]";
    }
}

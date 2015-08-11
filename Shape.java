
public abstract class Shape implements Comparable<Shape> {
    public abstract double calculateArea();
    
    public int compareTo(final Shape other) {
        if(calculateArea() < other.calculateArea()) {
            return -1;
        } 
        else if(calculateArea() > other.calculateArea()) {
            return 1;
        }
        return 0;//the areas are the same
    }
}

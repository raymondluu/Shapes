/*Raymond Luu
 * TCSS143
 * John Mayer
 * 10/31/11
 */
import java.io.File;
import java.util.*;

public class TestShapes {
    public static void main(String args[]) {
        
    	Scanner fileScan = null;//initialize Scanner
    	
    	//import file
    	try {
            fileScan = new Scanner(new File("Shapes.txt"));
    	} catch(Exception e) {//catch if file isn't found
    		System.out.println("File not found");
    	}
    	
        List<Shape> shapeList = new ArrayList<Shape>();//new ArrayList of shapes
        
        //look through file
        while(fileScan.hasNextLine()) {
            String lineString = fileScan.nextLine();//make each line a string
            Scanner lineScan = new Scanner(lineString);//Scanner for each line
        	List<Double> numList =new ArrayList<Double>();//new temporary ArrayList of numbers
            
        	//add # to list
            while(lineScan.hasNextDouble()) {
            	numList.add(lineScan.nextDouble());
            }
            
            //create shapes and store into ArrayList
            if(numList.size() == 1) {
            	Circle cir = new Circle(numList.get(0));
            	shapeList.add(cir);
            } else if(numList.size() == 2) {
            	Rectangle rect = new Rectangle(numList.get(0), numList.get(1));
            	shapeList.add(rect);
            } else if(numList.size() == 3) {
                Triangle tri = new Triangle(numList.get(0), numList.get(1), numList.get(2));
                shapeList.add(tri);
            }
        }
        
        System.out.println("Original Shape List -");
        displayShapes(shapeList);
        List<Shape> copyShapeList = new ArrayList<Shape>();
        copyShapeList.addAll(shapeList);
        Collections.sort(copyShapeList);
        System.out.println("Sorted Shape List -");
        displayShapes(copyShapeList);
        System.out.println("Original Shape List -");
        displayShapes(shapeList);
    }
    
    public static void displayShapes (List<Shape> shapeList) {
    	Iterator<Shape> shapeIter = shapeList.iterator();
    	
    	//display shapes
    	while(shapeIter.hasNext()) {
    	    Shape a = shapeIter.next();
    		
    		System.out.printf("%-50s", a);
    		System.out.printf("Area: %.2f\n", a.calculateArea());
    	}
    	System.out.println();
    }
    
    
}
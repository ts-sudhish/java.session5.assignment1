/**
 * 
 */
package sdh.java.session5;

/**
 * @author Sudhish
 *
 */
public class Assignment1Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assignment1Rectangle Rect = new Assignment1Rectangle();
		Rect.length = 7;
		Rect.breadth = 16;
		Rect.area();
		System.out.println("The Area of rectangle of length "
		+Rect.length+" and breadth "+Rect.breadth+" is "+Rect.area);
		
		Assignment1Square Squa = new Assignment1Square();
		Squa.length = 7;
		Squa.area();
		System.out.println("The Area of square of length "
		+Squa.length+" is "+Squa.area);
	
		Assignment1Triangle Tria = new Assignment1Triangle();
		Tria.length = 7;
		Tria.height = 16;
		Tria.area();
		System.out.println("The Area of triangle of length "
		+Tria.length+" and height "+Tria.height+" is "+Tria.area);
	}

}

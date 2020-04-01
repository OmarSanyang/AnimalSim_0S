/**
 * 
 * @author omarsanyang
 *Inheritance Project
 *2nd Semester/2020
 */
public class Location {

	private int xCoord;
	private int yCoord;
	
	
	/**
	* This is empty-argument constructor that initialize the instance
	variables */
	public Location () {
		
		xCoord = 0;
		yCoord = 0;
		
	}// end of empty constructor
	
	
	
	public Location (int x, int y) throws InvalidCoordinateException {
		
		if(x < 0 || y < 0) {
		
			if (x < 0 && y < 0) {
				
				throw new InvalidCoordinateException("The Coordinate cannot be lessthan zero");
			}
			
			else if(x < 0) {
				
				throw new InvalidCoordinateException ("The X Coordinate cannot be lessthan zero " + x);
			}
			
			else if(y < 0) {
				
				throw new InvalidCoordinateException ("The y Coordinate cannot be lessthan zero " + y);
			}
				
		}
		else 
			xCoord = x;
			yCoord = y;
		
	}// end of preferred constructor
	
	/**
	* This demonstrates a void method.
	*
	* @param a the value sent in to the method * @return the Exception Thrown 
	*
	*/
	
	public void update(int x, int y) throws InvalidCoordinateException {
		
		if(x < 0 || y < 0) {
			
			if (x < 0 && y < 0) {
				
				throw new InvalidCoordinateException("The Coordinate cannot be lessthan zero");
			}
			
			else if(x < 0) {
				
				throw new InvalidCoordinateException ("The X Coordinate cannot be lessthan zero " + x);
			}
			
			else if(y < 0) {
				
				throw new InvalidCoordinateException ("The y Coordinate cannot be lessthan zero " + y);
			}
				
		}
		else 
			xCoord = x;
			yCoord = y;
		
	}// end of the update constructor
	
	public int [] getCoordinates() {
		
		int [] coordinates = new int [] {getxCoord(), getyCoord()};
		return coordinates;
		
	}// end of the getCoordinates constructor

	/**
	* @return the current value of xCoord*/
	public int getxCoord() {
		return xCoord;
	}

	/**
	* @param Subgroud the value of xCoord to be set */
	public void setxCoord(int x) throws InvalidCoordinateException {
		
			if(x < 0) {
				throw new InvalidCoordinateException ("The X Coordinate cannot be lessthan zero " + x);
					
			}
			else 
				xCoord = x;

	}

	/**
	* @return the current value of yCoord*/
	public int getyCoord() {
		return yCoord;
	}

	/**
	* @param Subgroud the value of yCoord to be set */
	public void setyCoord(int y) throws InvalidCoordinateException {
		if(y < 0) {
			throw new InvalidCoordinateException ("The Y Coordinate cannot be lessthan zero " + y);
				
		}
		else 
			yCoord = y;
	}
	
	
	
	
	
}// end of class 

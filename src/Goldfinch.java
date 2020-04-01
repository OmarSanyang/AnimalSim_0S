
public class Goldfinch extends Animal{
	
	private double wingSpan;
	
	/**
	* This is empty-argument constructor that initialize the instance
	variables */
	public Goldfinch() {
		
		simID = 0;
		location = new Location();
		full = false;
		rested = true;
		wingSpan = 9.0;
		
		
		
	}// end of empty constructor 
	
	public Goldfinch(int simID, Location l,	double wingSpan) throws InvalidWingspanException {
		
		if(wingSpan < 5.0|| wingSpan > 11.0) {
			throw new InvalidWingspanException("wingSpan must be between 5.0 and 11.0 " + wingSpan);
		}
		else 
		this.wingSpan = wingSpan;
		
	}// end of preferred constructor 
	
	/**
	* This demonstrates a void method.
	*
	* @param a the value sent in to the method * @return that initialize the instance
	variables 
	*
	*/
	public void fly(Location l) {
		
		location = l;
	}// end of fly constructor

	/**
	* @return the current value of WingSpan */
	public double getWingSpan() {
		return wingSpan;
	}// end of getWinSpan

	/**
	* @param Subgroud the value of WingSpan to be set */
	public void setWingSpan(float wingSpan) throws InvalidWingspanException {
		if(wingSpan < 5.0|| wingSpan > 11.0) {
			throw new InvalidWingspanException("wingSpan must be between 5.0 and 11.0 " + wingSpan);
		}
		else 
		this.wingSpan = wingSpan;
	}//end of setWingSpan
	
	
	public void walk(int direction) {
		int x = location.getxCoord();
		int y = location.getyCoord();
		if(direction < 0)
			try {
				location.setxCoord(x +1);
			} catch (InvalidCoordinateException e2) {
			
				e2.printStackTrace();
			}
		else if (direction > 0)
			try {
				location.setyCoord(y + 1);
			} catch (InvalidCoordinateException e1) {
				
				e1.printStackTrace();
			}
		else
			try {
				location.update(x + 1, y + 1);
			} catch (InvalidCoordinateException e) {
				
				e.printStackTrace();
			}
		
	}

	

	@Override
	public String toString() {
		return "Goldfinch [wingSpan=" + wingSpan + "]";
	}

	
	
}//end of class 

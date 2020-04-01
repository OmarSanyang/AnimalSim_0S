import java.util.Random;

public abstract class Animal {
	
	protected int simID;
	protected Location location;
	protected boolean full;
	protected boolean rested;

	/**
	* This is empty-argument constructor that initialize the instance
	variables */
	public Animal() {
		
		simID = 0;
		location = new Location();
		full = false;
		rested = true;
		
	}// end of empty class
	
	public Animal(int simID, Location l) throws InvalidSimIDException {
		
		
		if (simID < 0) {
			throw new InvalidSimIDException("simId should be greathan zero" + simID);
		}	 
		
		else 
			
			this.simID = simID;
			location = l;
			full = false;
			rested = true;
		
		
	}// end of preferred constructor
	
	/**
	* This demonstrates a void method.
	*
	* @param a the value sent in to the method * @return the object 
	*
	*/
	public void eat() {
		
		Random ran = new Random();
		double number = ran.nextDouble();
		
		if(number <= .5)
			full = false;
		else 
			full = true;
		
		
		
	}//end eat constructor 
	

	/**
	* This demonstrates a void method.
	*
	* @param a the value sent in to the method * @return the object 
	*
	*/
	
	public void sleep() {
		
		Random ran = new Random();
		double number = ran.nextDouble();
		
		if(number <= .5)
			rested = false;
		else 
			rested = true;
		
	}// end of sleep constructor 
	/**
	* @return the current value of SimID */
	public int getSimID() {
		return simID;
	}

	/**
	* @param Subgroud the value of SimID to be set */
	public void setSimID(int simID) {
		this.simID = simID;
	}

	/**
	* @return the current value of Location */
	public Location getLocation() {
		return location;
	}

	/**
	* @param Subgroud the value of Location to be set */
	public void setLocation(Location location) {
		this.location = location;
	}

	/**
	* @return the current value of Full */
	public boolean isFull() {
		return full;
	}


	/**
	* @param Subgroud the value of Full to be set */
	public void setFull(boolean full) {
		this.full = full;
	}

	/**
	* @return the current value of Rested */
	public boolean isRested() {
		return rested;
	}

	/**
	* @param Subgroud the value of Rested to be set */
	public void setRested(boolean rested) {
		this.rested = rested;
	}
	
	
	
}// end of Animal class

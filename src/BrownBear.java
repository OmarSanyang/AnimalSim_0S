
public class BrownBear extends Animal implements Walkable, Swimable {
	
	private String subSpecies;
	
	/**
	* This is empty-argument constructor that initialize the instance
	variables */
	public BrownBear() {
		
		super();
		subSpecies = new String("European");
		
	}// end of empty constructor
	
	public BrownBear(int simID, Location l, String subSpecies) {
		
		super(simID, l);
		InvalidSubspeciesException e = new InvalidSubspeciesException("Invalid supSpecies");
		
		if(e.CheckSubspecies(subSpecies) == false)
			throw e;
		else 
			this.subSpecies= subSpecies;
		
		
	}// end of proffered constructor
	
	/**
	* This demonstrates a void method.
	*
	* @param a the value sent in to the method * @return the try catch 
	*
	*/
	public void walk(int direction) {
		
		int x = location.getxCoord();
		int y = location.getyCoord();
		
		if(direction < 0)
			try {
				location.setxCoord(x + 3);
			} catch (InvalidCoordinateException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		else if (direction > 0)
			try {
				location.setyCoord(y + 3);
			} catch (InvalidCoordinateException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		else
			try {
				location.update(x + 3, y + 3);
			} catch (InvalidCoordinateException e) {
				
				e.printStackTrace();
			}
		
	}// end of walk constructor
	
	/**
	* This demonstrates a void method.
	*
	* @param a the value sent in to the method * @return the try catch 
	*
	*/
	
	public void swim(int direction) {
		
		int x = location.getxCoord();
		int y = location.getyCoord();
		
		if(direction < 0)
			try {
				location.setxCoord(x + 2);
			} catch (InvalidCoordinateException e) {
				e.printStackTrace();
			}
		else if (direction > 0)
			try {
				location.setyCoord(y + 2);
			} catch (InvalidCoordinateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		else
			try {
				location.update(x + 2, y + 2);
			} catch (InvalidCoordinateException e) {
				
				e.printStackTrace();
			}
		
	}//end of swim constructor 
	
	

	/**
	* @return the current value of SubSpecies */
	public String getSubSpecies() {
		return subSpecies;
	}

	/**
	* @param Subgroud the value of SubSpecies to be set */
	public void setSubSpecies(String subSpecies) {
		this.subSpecies = subSpecies;
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

}// end of class 

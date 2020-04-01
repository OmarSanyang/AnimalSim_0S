
public class Application {

	public static void main(String[] args) {
		
		System.out.println("*********************************************");
		System.out.println("\t\t\t Location");
		System.out.println("*********************************************");	
		
	Location k = new Location();
	Location lo = new Location(6,6);
	try {
		Location loc = new Location(-5,-7);
	}
	catch(InvalidCoordinateException e) {
		System.out.println("\n" + e.getMessage());
		
		
	}
	
	lo.update(5, 9);
	int[] coords = lo.getCoordinates();
	System.out.println(coords[0] + " " + coords[1]);
	
	k.setxCoord(13);
	k.setyCoord(12);
	
	System.out.println(k.getxCoord());
	System.out.println(k.getyCoord());
	System.out.println(lo.toString());
	
		System.out.println("*********************************************");
		System.out.println("\t\t\t Animal Tests");
		System.out.println("*********************************************");	
	
		System.out.println("\n Cannot be Instantiated, because it will coursea  compile error.\n");
		
		
		System.out.println("*********************************************");
		System.out.println("\t\t\t Goldfinch Tests");
		System.out.println("*********************************************");	
	
	Location l = new Location (3,3);
	Goldfinch f = new Goldfinch (54,1,8);
	Goldfinch fin = new Goldfinch (1,k,17);
	
	try {
		Goldfinch hunn = new Goldfinch ();
	}
	catch(InvalidWingspanException e) {
		System.out.println("\n" + e.getMessage());
		
		
	}
	catch(InvalidSimIDException e) {
		System.out.println(e.getMessage());
	}
	
	try {
		Goldfinch hunn = new Goldfinch (0,k,20);
	}
	
	catch(InvalidWingspanException e) {
		System.out.println("\n" + e.getMessage());
		
	}
	catch(InvalidSimIDException e) {
		System.out.println(e.getMessage());
		
	}
	
	System.out.println(fin.getLocation());
	fin.walk(-1);
	System.out.println(fin.getLocation());
	fin.walk(0);
	System.out.println(fin.getLocation());
	fin.walk(1);
	
	System.out.println(fin.getLocation());
	Location low = new Location ();
	fin.setLocation(low);
	System.out.println(fin.getLocation());
	
	fin.setWingSpan(9);
	System.out.println(fin.getWingSpan());
	System.out.println(fin.toString());
	
		System.out.println("*********************************************");
		System.out.println("\t\t\t BrownBear Tests");
		System.out.println("*********************************************");

	Location li = new Location (6,6);
	BrownBear b = new BrownBear(0,3);
	BrownBear bu = new BrownBear(6,8);
	
	try {
		BrownBear bum = new BrownBear();
	}
	catch(InvalidCoordinateException e) {
		System.out.println("\n" + e.getMessage());
		
		
	}
	catch(InvalidCoordinateException e) {
		System.out.println(e.getMessage());
	}
	
	try {
		BrownBear bum = new BrownBear();
	}
	
	catch(InvalidCoordinateException e) {
		System.out.println("\n" + e.getMessage());
		
	}
	catch(InvalidCoordinateException e) {
		System.out.println(e.getMessage());
	}	
		System.out.println(bu.getLocation());
		bu.walk(-1);
		System.out.println(bu.getLocation());
		bu.walk(0);
		System.out.println(bu.getLocation());
		bu.walk(1);
		
		System.out.println(bu.getLocation());
		Location lows = new Location ();
		bu.setLocation(low);
		System.out.println(bu.getLocation());
	
		bu.setSubSpecies("European");
		System.out.println(bu.getSubSpecies());
		
		bu.eat();
		System.out.println(bu.isFull());
		bu.sleep();
		System.out.println(bu.isRested());
		bu.setFull(true);
		bu.setRested(false);
		System.out.println(bu.isFull());
		System.out.println(bu.isRested());
		System.out.println(bu.toString());
	
	
	}// end of main class

}

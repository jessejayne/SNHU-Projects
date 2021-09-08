/**
 * 
 */

/**
 * @author Jesse Jayne SNHU
 * jesse.jayne@snhu.edu
 * IT-145-X1825 
 */

// Class for dog attributes and status for PetBag project. 
public class Dog {
   private int dogSpaceNumber; // number of spaces open for dogs
   private double dogWeight; // dog weight
   private String grooming; // grooming status of dog
	
   
	public Dog() { // constructor init all variables for class Dog
		setDogSpaceNumber(0);
		setDogWeight(0.0);
		setGrooming("No");
	}

	/**
	 * Below - method constructor with parameters
	 */
	public Dog(int spacesLeft, double initialWeight, String groomingStatus) {
		if(initialWeight < 0.0) {
			System.out.println("Negative weight not valid. Try again.");
			System.exit(0);
		}
		else {
			setDogSpaceNumber(spacesLeft);
			setDogWeight(initialWeight);
			setGrooming(groomingStatus);
		}

	}

	/**
	 * returns number of dog spaces remaining
	 */
	public int getDogSpaceNumber() {
		return dogSpaceNumber;
	}

	/**
	 * parameter sets number of dog spaces left after this dog
	 */
	public void setDogSpaceNumber(int dogSpaceNumber) {
		this.dogSpaceNumber = dogSpaceNumber;
	}

	/**
	 * returns double dogWeight 
	 */
	public double getDogWeight() {
		return dogWeight;
	}

	/**
	 * parameter to set dogWeight (double)
	 */
	public void setDogWeight(double dogWeight) {
		this.dogWeight = dogWeight;
	}

	/**
	 * returns string for grooming status
	 */
	public String getGrooming() {
		return grooming;
	}

	/**
	 * parameter to set grooming
	 */
	public void setGrooming(String grooming) {
		this.grooming = grooming;
	}

}

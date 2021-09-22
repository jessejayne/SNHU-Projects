import java.util.Scanner;

public class Pet {

    // Initiate private variables
    private String petType;
    private String petName;
    private int petAge;
    private int dogSpace;
    private int catSpace;
    private int daysStay;
    private double amountDue;

    // Pet Default Constructor
    public Pet(String petType, String petName, int petAge, int dogSpace, int catSpace, int daysStay, double amountDue) {
        this.petType = petType;
        this.petName = petName;
        this.petAge = petAge;
        this.dogSpace = dogSpace;
        this.catSpace = catSpace;
        this.daysStay = daysStay;
        this.amountDue = amountDue;
    }

    
    public void checkIn() { // method for check-in, init pet spaces and get info from user. 

        // initialize Cat spaces
        setCatSpace(12);

        // intialize Dog spaces
        setDogSpace(30);

        System.out.print("Welcome, are you checking in a dog or cat:");

        // initialize scanner for input
        Scanner input = new Scanner(System.in);
        String userChoice = input.nextLine();

        // determine pet type for check in 
        if (userChoice.equals("cat")) {
            System.out.println("Checking in your cat!");
            // check space is available
            if (getCatSpace() >= 1) {
                System.out.println("We have room for your pet.");
                System.out.println("Is your Cat a new guest? or a returning visitor? Enter new or returning.");
                // check if new or returning
                String catVisitor = input.nextLine();
                if (catVisitor.equals("new")) {
                    System.out.println("Welcome!");
                    System.out.println("Please allow us to collect some information about your cat:");
                    System.out.println("What is your cat's name?");
                    String newCatName = input.nextLine();
                    setPetName(newCatName);
                    System.out.println("How old is your cat?");
                    int newCatAge = input.nextInt();
                    setPetAge(newCatAge);
                    
                    System.out.println("How many days will your cat be staying with us?");
                    int catDays = input.nextInt();
                    // set the amount of days 
                    setDaysStay(catDays);

                    System.out.println("Thank you for the information!");
                    // decrement cat space -1
                    int currentCatSpace = getCatSpace();
                    setCatSpace(currentCatSpace - 1);

                } 
                else if (catVisitor.equals("returning")) {
                    System.out.println("Thanks for coming back!");
                    System.out.println("Please let us update some of your information");

                    System.out.println("How many days will your pet be staying with us?");
                    int catDays = input.nextInt();
                    // set the amount of days stay
                    setDaysStay(catDays);

                    // decrement cat space -1
                    int currentCatSpace = getCatSpace();
                    setCatSpace(currentCatSpace - 1);
                    updatePet();

                }

            } 
            else {
                System.out.println("Sorry no room available! Try again soon.");
                }
        } 
        else if (userChoice.equals("dog")) {
            System.out.println("Checking in your dog!");
            // check space is available
            if (getDogSpace() >= 1) {
                System.out.println("Dog space availale hooray!");
                System.out.println("Is your Dog a 'new' or 'returning' visitor?");
                // check if new or returning
                String dogVisitor = input.nextLine();
                if (dogVisitor.equals("new")) {
                    System.out.println("Welcome!");
                    System.out.println("Please allow us to collect some information about your dog:");
                    System.out.println("What is your dog's name?");
                    String newDogName = input.nextLine();
                    setPetName(newDogName);
                    System.out.println("How old is your dog?");
                    int newDogAge = input.nextInt();
                    setPetAge(newDogAge);

                    System.out.println("How many days will your dog be staying with us?");
                    int dogDays = input.nextInt();
                    // check if grooming services for dogs are needed
                    if (dogDays >= 2){
                        System.out.println("Grooming services are avaialble for your dog!");
                    } else{
                        System.out.println("Grooming is not availalbe for your dog");
                    }

                    System.out.println("Thank you for the information!");

                    // decrement dog space -1
                    int currentDogSpace = getDogSpace();
                    setDogSpace(currentDogSpace - 1);
                } 
                else if (dogVisitor.equals("returning")) {
                    System.out.println("Welcome back!");
                    System.out.println("Please allow us to update your information");

                    System.out.println("How many days will your dog be staying with us?");
                    int dogDays = input.nextInt();
                    // check if grooming for returning dogs is needed 
                    if(dogDays >= 2){
                        System.out.println("Grooming services are available for your dog!");
                    } else{
                        System.out.println("Grooming is not available for your dog");
                    }

                    // decrement space -1 
                    int currentDogSpace = getDogSpace();
                    setDogSpace(currentDogSpace - 1);
                    updatePet();
                }

            } 
            else {
                System.out.println("Sorry no room available! Try again soon.");
            }
        } else{
            System.out.println("Invalid choice, please select 'cat or 'dog'");
            checkIn();
        }

        // checkIn();
    }

    // checkOut method
    public void checkOut() {

        checkOut();
    }

    // getPet method
    public void getPet() {
        getPet();
    }

    // createPet method
    public void createPet() {
        createPet();
    }

    // updatePet method
    public void updatePet() {
        //updatePet();
    }

    

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getPetAge() {
        return petAge;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    public int getDogSpace() {
        return dogSpace;
    }

    public void setDogSpace(int dogSpace) {
        this.dogSpace = dogSpace;
    }

    public int getCatSpace() {
        return catSpace;
    }

    public void setCatSpace(int catSpace) {
        this.catSpace = catSpace;
    }

    public int getDaysStay() {
        return daysStay;
    }

    public void setDaysStay(int daysStay) {
        this.daysStay = daysStay;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }

}
package virtual_pet;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main (String[]args){

        System.out.println("Greeting");
        System.out.println("Instructions");
        System.out.println("User Input");

        Scanner inputScanner = new Scanner(System.in);

        VirtualPetShelter shelter = new VirtualPetShelter();
        VirtualPet Jeff = new VirtualPet("Jeff", 10, 10, 10, "Aries");
        VirtualPet Stella = new VirtualPet("Stella", 10, 10, 10, "Leo");
        shelter.addPet(Jeff);
        shelter.addPet(Stella);

        for(VirtualPet petToDisplay : shelter.retrievePets()){
            System.out.println(petToDisplay);
        }
        System.out.println("Enter 1 to feed a pet");
        System.out.println("Enter 2 to water a pet");
        System.out.println("Enter 3 to play with a pet");
        System.out.println("Enter 4 to remove a pet");
        String userInput = inputScanner.nextLine();

        while(!userInput.equalsIgnoreCase("quit")){
            if(userInput.equalsIgnoreCase("1")){
                System.out.println("Which pet would you like to feed?"); //Add pet list under this line
                String petNameToFeed = inputScanner.nextLine();
                System.out.println();
                shelter.feedPet(petNameToFeed);

                //Trying to print out the hunger of a single pet.
                //Through an override in VirtualPet.
                //Referencing the Workshop.
            }
        }






//        System.out.println("What is your pet's name?");
//        String name = input.nextLine();
//        VirtualPet pet = new VirtualPet(name, 10, 10, 10, "Aries");
//
//        System.out.println("Your pet's name is " + name);
    }
}

package virtual_pet;

import javax.imageio.plugins.jpeg.JPEGQTable;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        System.out.println("Greeting");
        System.out.println("Instructions");
        System.out.println("User Input");

        Scanner inputScanner = new Scanner(System.in);

        VirtualPetShelter shelter = new VirtualPetShelter();
        VirtualPet Jeff = new VirtualPet("Jeff", 10, 10, 10, "Aries");
        VirtualPet Stella = new VirtualPet("Stella", 10, 10, 10, "Leo");
        shelter.addPet(Jeff);
        shelter.addPet(Stella);

        for (VirtualPet petToDisplay : shelter.retrievePets()) {
            System.out.println(petToDisplay);
        }
        System.out.println("Enter 1 to feed the pets");
        System.out.println("Enter 2 to water the pets");
        System.out.println("Enter 3 to play with pets");
        System.out.println("Enter 4 to remove a pet");
        String userInput = inputScanner.nextLine();

        while (!userInput.equalsIgnoreCase("quit")) {
            if (userInput.equalsIgnoreCase("1")) {
                shelter.feedAllPets();
                shelter.tickAllPets();
                for (VirtualPet petToDisplay : shelter.retrievePets()) {
                    System.out.println(petToDisplay);
                }
            }
                if (userInput.equalsIgnoreCase("2")) {
                    shelter.waterAllPets();
                    shelter.tickAllPets();
                    for (VirtualPet petToDisplay : shelter.retrievePets()) {
                        System.out.println(petToDisplay);
                    }
                }
                if (userInput.equalsIgnoreCase("3")) {
                    shelter.playAllPets();
                    shelter.tickAllPets();
                    for (VirtualPet petToDisplay : shelter.retrievePets()) {
                        System.out.println(petToDisplay);
                    }
                }
            if (userInput.equalsIgnoreCase("4")) {
                System.out.println("Which pet would you like to remove?");
                inputScanner //ask for pet name then try to get one pet to be removed.
            }
                shelter.removePet(petName);
                shelter.tickAllPets();
                for (VirtualPet petToDisplay : shelter.retrievePets()) {
                    System.out.println(petToDisplay);
                }
            }
                        //Trying to print out the hunger of a single pet.
                        //Through an override in VirtualPet.
                        //Referencing the Workshop.


//        System.out.println("What is your pet's name?");
//        String name = input.nextLine();
//        VirtualPet pet = new VirtualPet(name, 10, 10, 10, "Aries");
//
//        System.out.println("Your pet's name is " + name);
            }
        }

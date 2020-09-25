package virtual_pet;

import javax.imageio.plugins.jpeg.JPEGQTable;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        VirtualPetShelter shelter = new VirtualPetShelter();
// Need to fix intro as well as Quit.
        System.out.println();
        System.out.println("Hello, welcome to your virtual pet shelter!");
        System.out.println("Follow the prompts to create or interact with your pets.");
        System.out.println("Your first pet will be an organic cat, what would you like to name it?");
        String userInputIntro = inputScanner.nextLine();
        OrganicCat starterCat = new OrganicCat(userInputIntro, 10, 10, 10, "Aries");
        shelter.addOrganicCat(starterCat);

        for (VirtualPet petToDisplay : shelter.retrievePets()) {
            System.out.println(petToDisplay.status());
        }


        while (!userInputIntro.equalsIgnoreCase("quit")) {
            System.out.println("\n");
            System.out.println("Enter 1 to feed the pets");
            System.out.println("Enter 2 to water the pets");
            System.out.println("Enter 3 to play with pets");
            System.out.println("Enter 4 to remove a pet");
            System.out.println("Enter 5 for pets status");
            System.out.println("Enter 6 to add a pet");
            String userInput = inputScanner.nextLine();

            if (userInput.equalsIgnoreCase("1")) {
                System.out.println(); //trying to print out status of litterbox and cage
                shelter.feedAllPets();
                shelter.tickAllPets();
            }
//            if (userInput.equalsIgnoreCase("1")) {
//                shelter.oilRoboticPets();
//                shelter.tickAllPets();
//            }
            if (userInput.equalsIgnoreCase("2")) {
                shelter.waterAllPets();
                shelter.tickAllPets();
            }
            if (userInput.equalsIgnoreCase("3")) {
                System.out.println("Which pet would you like to play with?");
                for (VirtualPet petToDisplay : shelter.retrievePets()) {
                    System.out.println(petToDisplay.status());
                }
                String petToPlayWith = inputScanner.nextLine();
                shelter.retrievePet(petToPlayWith).play();
            }
            if (userInput.equalsIgnoreCase("4")) {
                System.out.println("Which pet would you like to remove?");
                String petToRemove = inputScanner.nextLine();
                shelter.removePet(petToRemove);
                shelter.tickAllPets();
            }
//            if (userInput.equalsIgnoreCase("5")) {
//                for (VirtualPet petToDisplay : shelter.retrievePets()) {
//                    System.out.println(petToDisplay.status());
//                }
//            }
            if (userInput.equalsIgnoreCase("6")) {
                System.out.println("What's type of pet would you like to create?");
                System.out.println("Type 1 for an organic pet");
                System.out.println("Type 2 for a robotic pet");
                String anotherPet = inputScanner.nextLine();
                if (anotherPet.equalsIgnoreCase("1")) {
                    System.out.println("What kind of organic pet?");
                    System.out.println("Type 1 for Dog");
                    System.out.println("Type 2 for Cat");
                    String catOrDog = inputScanner.nextLine();
                    if (catOrDog.equalsIgnoreCase("1")) {
                        System.out.println("What would you like to name your organic dog?");
                        String newOrganicDog = inputScanner.nextLine();
                        OrganicDog organicDog = new OrganicDog(newOrganicDog, 10, 10, 10, "Aries");
                        shelter.addOrganicDog(organicDog);
                    } else {
                        System.out.println("What would you like to name your organic cat?");
                        String newOrganicCat = inputScanner.nextLine();
                        OrganicCat organicCat = new OrganicCat(newOrganicCat, 10, 10, 10, "Aries");
                        shelter.addOrganicCat(organicCat);
                    }
                }
                if (anotherPet.equalsIgnoreCase("2")) {
                    System.out.println("What kind of robotic pet?");
                    System.out.println("Type 1 for Dog");
                    System.out.println("Type 2 for Cat");
                    String roboticCatOrDog = inputScanner.nextLine();

                    if (roboticCatOrDog.equalsIgnoreCase("1")) {
                        System.out.println("What would you like to name your robotic dog?");
                        String newRoboticDog = inputScanner.nextLine();
                        RoboticDog roboticDog = new RoboticDog(newRoboticDog, 10, 10, 10, "Aries");
                        shelter.addRoboticDog(roboticDog);
                    } else {
                        System.out.println("What would you like to name your robotic cat?");
                        String newRoboticCat = inputScanner.nextLine();
                        RoboticCat roboticCat = new RoboticCat(newRoboticCat, 10, 10, 10, "Aries");
                        shelter.addRoboticCat(roboticCat);
                    }
                }
            }


            for (VirtualPet petToDisplay : shelter.retrievePets()) {
                System.out.println(petToDisplay.status());       //Sending table twice due to this and displays in input cases.
            }
        }
    }
}




package virtual_pet;

import javax.imageio.plugins.jpeg.JPEGQTable;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        VirtualPetShelter shelter = new VirtualPetShelter();
        VirtualPet Jeff = new VirtualPet("Jeff", 10, 10, 10, "Aries");
        VirtualPet Stella = new VirtualPet("Stella", 10, 10, 10, "Leo");
        shelter.addPet(Jeff);
        shelter.addPet(Stella);
// Need to fix intro as well as Quit.
        System.out.println("Hello, welcome to your virtual pet shelter!");
        System.out.println("Follow the prompts to create or interact with your pets.");
        System.out.println("What's your pets name?");
        String userInputIntro = inputScanner.nextLine();
        VirtualPet newPet = new VirtualPet(userInputIntro, 10, 10, 10, "Aries");
        shelter.addPet(newPet);

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
//            if (userInput.equalsIgnoreCase("1")) {
//                shelter.feedAllPets();
//                shelter.tickAllPets();
//            }
            if (userInput.equalsIgnoreCase("1")) {
                shelter.oilRoboticPets();
                shelter.tickAllPets();
            }
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
            if (userInput.equalsIgnoreCase("5")) {
                for (VirtualPet petToDisplay : shelter.retrievePets()) {
                    System.out.println(petToDisplay.toString());
                }
            }
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
                        VirtualPet organicDog = new OrganicDog(newOrganicDog, 10, 10, 10, "Aries");
                        shelter.addPet(organicDog);
                    } else {
                        System.out.println("What would you like to name your organic cat?");
                        String newOrganicCat = inputScanner.nextLine();
                        VirtualPet organicCat = new OrganicCat(newOrganicCat, 10, 10, 10, "Aries");
                        shelter.addPet(organicCat);
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
                        VirtualPet roboticDog = new RoboticDog(newRoboticDog, 10, 10, 10, "Aries");
                        shelter.addPet(roboticDog);
                    } else {
                        System.out.println("What would you like to name your robotic cat?");
                        String newRoboticCat = inputScanner.nextLine();
                        VirtualPet roboticCat = new RoboticCat(newRoboticCat, 10, 10, 10, "Aries");
                        shelter.addPet(roboticCat);
                    }
                }
            }


            for (VirtualPet petToDisplay : shelter.retrievePets()) {
                System.out.println(petToDisplay);       //Sending table twice due to this and displays in input cases.
            }
        }
    }
}




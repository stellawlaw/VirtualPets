package virtual_pet;

import java.util.Scanner;

public class Application {
    public static void main (String[]args){
        Scanner input= new Scanner(System.in);
        VirtualPet pet1 = new VirtualPet("Jeff", 10, 10, 10, "Aries");
        VirtualPet pet2 = new VirtualPet("Stella", 10, 10, 10, "Leo");

//        System.out.println("What is your pet's name?");
//        String name = input.nextLine();
//        VirtualPet pet = new VirtualPet(name, 10, 10, 10, "Aries");
//
//        System.out.println("Your pet's name is " + name);
    }


}

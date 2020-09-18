package virtual_pet;

import java.util.Scanner;

public class Application {
    public static void main (String[]args){
        Scanner input= new Scanner(System.in);

        System.out.println("What is your pet's name?");
        String name = input.nextLine();
        VirtualPet pet = new VirtualPet(name, 10, 10, 10, "Aries");

        System.out.println("Your pet's name is " + name);
    }


}

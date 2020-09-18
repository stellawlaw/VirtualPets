package virtual_pet;

import java.util.ArrayList;
import java.util.Scanner;

public class VirtualPetShelter {
    public static void main(String[] args) {
        VirtualPet pet1 = new VirtualPet("Jeff", 10, 10, 10, "Aries");
        VirtualPet pet2 = new VirtualPet("Stella", 10, 10, 10, "Leo");
        ArrayList<String> pets = new ArrayList<String>();
        pets.add(pet1.getName());
        pets.add("" + pet1.getHunger());
        pets.add("" + pet1.getThirst());
        pets.add("" + pet1.getBoredom());
        pets.add(pet1.getSign());
        pets.add(pet2.getName());
        pets.add("" + pet2.getHunger());
        pets.add("" + pet2.getThirst());
        pets.add("" + pet2.getBoredom());
        pets.add(pet2.getSign());
        System.out.println(pets);
    }

}

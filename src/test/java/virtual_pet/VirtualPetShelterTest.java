package virtual_pet;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {
    @Test
    public void shouldBeAbleToCreatePetShelter() {
        VirtualPetShelter shelter = new VirtualPetShelter();
    }

    @Test
    public void petShouldBeAbleToIntakePets() {
        ArrayList<String> pets = new ArrayList<String>();
        VirtualPet underTest = new VirtualPet("Pat", 10, 10, 10, "Taurus");
        String name = underTest.getName();
        pets.add(name);
        String result = pets.get(0);
        assertEquals("Pat", result);
    }

    @Test
    public void petShouldBeAbleToIntakeManyPets() {
        ArrayList<String> pets = new ArrayList<String>();
        VirtualPet pet1 = new VirtualPet("Jeff", 10, 10, 10, "Aries");
        VirtualPet pet2 = new VirtualPet("Stella", 10, 10, 10, "Leo");
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
        String result = pets.get(0);
        String result1 = pets.get(5);
        assertEquals("Jeff", result);
        assertEquals("Stella", result1);
    }
}

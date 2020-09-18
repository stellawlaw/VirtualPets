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

//    @Test
//    public void petShouldBeAbleToIntakeManyPets() {
//        ArrayList<String> pets = new ArrayList<String>();
//        pets.add("Jeff");
//        String result = pets.get(0);
//        assertEquals("Jeff", result);
//
//    }
}

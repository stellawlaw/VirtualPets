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
    public void petShelterShouldBeAbleToIntakePets() {
        VirtualPetShelter shelter = new VirtualPetShelter();
        VirtualPet pet = new VirtualPet("Pat", 10, 10, 10, "Taurus");
        shelter.add(pet);
    }

//    @Test
//    public void petShouldBeAbleToIntakeManyPets() {
//        ArrayList<String> pets = new ArrayList<String>();
//        VirtualPet pet1 = new VirtualPet("Jeff", 10, 10, 10, "Aries");
//        assertEquals("Stella", result);
//    }
}

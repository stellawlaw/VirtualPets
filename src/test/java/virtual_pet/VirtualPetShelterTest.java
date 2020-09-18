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
    public void petShouldBeAbleToIntakeManyPets() {
       ArrayList<String> pets = new ArrayList<String>();
       pets.set(0,"Jeff");

       String result= pets.get(0);

       assertEquals("Jeff", result);


        // VirtualPet underTest = new VirtualPet("Jeff", 10, 10, 10, "Taurus");
        //String result = underTest.getName();
       // assertEquals("Jeff", result);
    }

}

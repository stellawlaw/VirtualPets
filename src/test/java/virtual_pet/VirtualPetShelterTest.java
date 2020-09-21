package virtual_pet;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {
    @Test
    public void shouldBeAbleToCreatePetShelter() {
        VirtualPetShelter shelter = new VirtualPetShelter();
    }

    @Test
    public void petShelterShouldBeAbleToIntakePets() {
        VirtualPetShelter shelter = new VirtualPetShelter();
        VirtualPet pet1 = new VirtualPet("Pat", 10, 10, 10, "Taurus");
        shelter.addPet(pet1);
        Object foundPet = shelter.getPet;
        assertThat(shelter).is(foundPet);

    }

//    @Test
//    public void petShouldBeAbleToIntakeManyPets() {
//        VirtualPetShelter shelter = new VirtualPetShelter();
//        VirtualPet pet1 = new VirtualPet("Pat", 10, 10, 10, "Taurus");
//        VirtualPet pet2 = new VirtualPet("Stella", 10, 10, 10, "Aquarius");
//        shelter.add(pet1);
//        shelter.add(pet2);
//
//        assertEquals("Stella", result);
    }
}

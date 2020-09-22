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
        Collection<VirtualPet> pets = shelter.retrievePets();
        assertThat(pets).hasSize(1)
                .contains(pet1);
    }

    @Test
    public void petShouldBeAbleToIntakeManyPets() {
        VirtualPetShelter shelter = new VirtualPetShelter();
        VirtualPet pet1 = new VirtualPet("Pat", 10, 10, 10, "Taurus");
        VirtualPet pet2 = new VirtualPet("Stella", 10, 10, 10, "Aquarius");
        shelter.addPet(pet1);
        shelter.addPet(pet2);
        Collection<VirtualPet> pets = shelter.retrievePets();
        assertThat(pets).hasSize(2)
                .contains(pet1, pet2);
    }

    @Test
    public void shouldBeAbleToFeedAllPets(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new VirtualPet("Toasty", 10, 10, 10, "Aries");
        VirtualPet testPet2 = new VirtualPet("Toasted", 10, 10, 10, "Aries");
        underTest.addPet(testPet);
        underTest.addPet(testPet2);
        underTest.feedAllPets();
        assertThat(testPet.getHunger()).isEqualTo(5);
        assertThat(testPet2.getHunger()).isEqualTo(5);
    }

    @Test
    public void shouldBeAbleToWaterAllPets(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new VirtualPet("Toasty", 10, 10, 10, "Aries");
        VirtualPet testPet2 = new VirtualPet("Toasted", 10, 10, 10, "Aries");
        underTest.addPet(testPet);
        underTest.addPet(testPet2);
        underTest.waterAllPets();
        assertThat(testPet.getThirst()).isEqualTo(5);
        assertThat(testPet2.getThirst()).isEqualTo(5);
    }

    @Test
    public void shouldBeAbleToPlayAllPets(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new VirtualPet("Toasty", 10, 10, 10, "Aries");
        VirtualPet testPet2 = new VirtualPet("Toasted", 10, 10, 10, "Aries");
        underTest.addPet(testPet);
        underTest.addPet(testPet2);
        underTest.playAllPets();
        assertThat(testPet.getBoredom()).isEqualTo(5);
        assertThat(testPet2.getBoredom()).isEqualTo(5);
    }

    @Test
    public void shouldBeAbleToRemoveAPet() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new VirtualPet("Toasty", 10, 10, 10, "Aries");
        underTest.addPet(testPet);
        underTest.removePet(testPet.getName());
        Collection<VirtualPet> petList = underTest.retrievePets();
        assertThat(petList).hasSize(0).isEmpty();
    }



}

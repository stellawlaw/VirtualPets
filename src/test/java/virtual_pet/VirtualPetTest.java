package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {

    @Test
    public void shouldBeAbleToCreatePet() {
        VirtualPet pet = new VirtualPet("Test Name", 10, 10, 10);
    }
    @Test
    public void petShouldHaveName() {
        VirtualPet underTest = new VirtualPet("Jeff", 10, 10, 10);
        String result = underTest.getName();
        assertEquals("Jeff", result);
    }
    @Test
    public void shouldHaveDefaultHunger() {
        VirtualPet underTest = new VirtualPet("Steve", 10, 10, 10);
        int result = underTest.getHunger();
        assertEquals(10, result);
    }
    @Test
    public void shouldHaveDefaultThirst() {
        VirtualPet underTest = new VirtualPet("Bob", 10, 10, 10);
        int result = underTest.getThirst();
        assertEquals(10, result);
    }
    @Test
    public void shouldHaveDefaultBoredom() {
        VirtualPet underTest = new VirtualPet("Tom", 10, 10, 10);
        int result = underTest.getBoredom();
        assertEquals(10, result);
    }
    @Test
    public void shouldTick() {
        VirtualPet pet = new VirtualPet("Kendrick", 10, 10, 10);

        int initialHunger = pet.getHunger();
        pet.tick();
        int hungerAfterTick = pet.getHunger();

        assertEquals(initialHunger + 10, hungerAfterTick);
    }

}

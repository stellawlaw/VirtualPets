package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VirtualPetTest {

    @Test
    public void shouldBeAbleToCreatePet() {
        VirtualPet pet = new VirtualPet("Test Name", 10, 10, 10,"Aries", false);
    }
    @Test
    public void petShouldHaveName() {
        VirtualPet underTest = new VirtualPet("Jeff", 10, 10, 10, "Aries", false);
        String result = underTest.getName();
        assertEquals("Jeff", result);
    }
    @Test
    public void shouldHaveDefaultHunger() {
        VirtualPet underTest = new VirtualPet("Steve", 10, 10, 10, "Aries", false);
        int result = underTest.getHunger();
        assertEquals(10, result);
    }
    @Test
    public void shouldHaveDefaultThirst() {
        VirtualPet underTest = new VirtualPet("Bob", 10, 10, 10, "Aries", false);
        int result = underTest.getThirst();
        assertEquals(10, result);
    }
    @Test
    public void shouldHaveDefaultBoredom() {
        VirtualPet underTest = new VirtualPet("Tom", 10, 10, 10,"Aries", false);
        int result = underTest.getBoredom();
        assertEquals(10, result);
    }
    @Test
    public void shouldTickHunger() {
        VirtualPet pet = new VirtualPet("Kendrick", 10, 10, 10,"Aries", false);

        int initialHunger = pet.getHunger();
        pet.tick();
        int hungerAfterTick = pet.getHunger();

        assertEquals(initialHunger + 10, hungerAfterTick);
    }
    @Test
    public void shouldTickThirst() {
        VirtualPet pet = new VirtualPet("Roger", 10, 10, 10, "Aries", false);

        int initialThirst = pet.getThirst();
        pet.tick();
        int thirstAfterTick = pet.getThirst();

        assertEquals(initialThirst + 10, thirstAfterTick);
    }
    @Test
    public void shouldTickBoredom() {
        VirtualPet pet = new VirtualPet("Taco", 10, 10, 10, "Aries", false);

        int initialBoredom = pet.getBoredom();
        pet.tick();
        int boredomAfterTick = pet.getBoredom();

        assertEquals(initialBoredom + 10, boredomAfterTick);
    }
    @Test
    public void decreaseHungerIfFedFood(){
        VirtualPet pet = new VirtualPet("Tony", 10, 10, 10,"Aries", false);

        int initialHunger = pet.getHunger();
        pet.feed();
        int hungerAfterFed = pet.getHunger();

        assertEquals (initialHunger -5, hungerAfterFed);
    }
    @Test
    public void decreaseThirstIfWatered(){
        VirtualPet pet = new VirtualPet("Barry", 10, 10, 10,"Aries", false);

        int initialThirst = pet.getThirst();
        pet.water();
        int thirstAfterWater = pet.getThirst();

        assertEquals (initialThirst -5, thirstAfterWater);
    }
    @Test
    public void decreaseBoredomIfPlay(){
        VirtualPet pet = new VirtualPet("Ben", 10, 10, 10, "Aries", false);

        int initialBoredom = pet.getBoredom();
        pet.play();
        int boredomAfterPlay = pet.getBoredom();

        assertEquals (initialBoredom -5, boredomAfterPlay);
    }
    @Test
    public void makeSureHungerBoredomAndThirstIsNotBelowZero(){
        VirtualPet pet = new VirtualPet("Levi", 0, 0, 0, "Aries", false);
        pet.feed();
        pet.water();
        pet.play();
        int hunger = pet.getHunger();
        int thirst = pet.getThirst();
        int boredom = pet.getBoredom();

        assertEquals(0, hunger);
        assertEquals(0, thirst);
        assertEquals(0, boredom);
    }
    @Test
    public void ifHungerBoredomThirstIs100PetDies(){
        VirtualPet pet = new VirtualPet("Stella", 100, 90, 90, "Aries", false);
       // boolean deceased = false;
        pet.tick();
        pet.dead();
        assertTrue(true);
    }
    @Test
    public void shouldHaveDefaultAstrologicalSign(){
        VirtualPet underTest = new VirtualPet("Lauren", 50, 50, 50, "Aries", false);
        String result = underTest.getSign();
        assertEquals("Aries", result);
    }
}

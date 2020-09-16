package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {

    @Test
    public void shouldBeAbleToCreatePet() {
        VirtualPet pet = new VirtualPet("Test Name");
    }
    @Test
    public void petShouldHaveName() {
        VirtualPet underTest = new VirtualPet("Jeff");
        String result = underTest.getName();
        assertEquals("Jeff", result);
    }
    @Test
    public void shouldHaveDefaultHunger() {
        VirtualPet underTest = new VirtualPet("Steve");
        int result = underTest.getHunger();
        assertEquals(10, result);
    }
    @Test
    public void shouldHaveDefaultThirst() {
        VirtualPet underTest = new VirtualPet("Bob");
        int result = underTest.getThirst();
        assertEquals(10, result);
    }
//    @Test
//    public void shouldHaveDefaultHunger() {
//        VirtualPet underTest = new VirtualPet("Steve");
//        int result = underTest.getHunger();
//        assertEquals(10, result);
//    }
}

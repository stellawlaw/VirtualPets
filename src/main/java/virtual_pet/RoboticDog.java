package virtual_pet;

public class RoboticDog extends RoboticPet implements Walking {
    public RoboticDog(String name, int hunger, int thirst, int boredom, String astrologicalSign) {
        super(name, hunger, thirst, boredom, astrologicalSign);
    }

    @Override
    public void walk() {

    }
}

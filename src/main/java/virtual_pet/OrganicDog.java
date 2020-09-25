package virtual_pet;

public class OrganicDog extends OrganicPet implements Walking{
    public OrganicDog(String name, int hunger, int thirst, int boredom, String astrologicalSign) {
        super(name, hunger, thirst, boredom, astrologicalSign);
    }

    @Override
    public void walk() {

    }
}

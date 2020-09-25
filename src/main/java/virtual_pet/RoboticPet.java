package virtual_pet;

public class RoboticPet extends VirtualPet {
    public RoboticPet(String name, int oilLevel, int fixIt, int boredom, String astrologicalSign) {
        super(name, oilLevel, fixIt, boredom, astrologicalSign);
    }

    private int oilLevel;
    private int fixIt;

    public void oil() {
        oilLevel = oilLevel - 10;
        if (oilLevel <= 0) {
            oilLevel = 0;
        }
    }

    public void maintenance() {
        fixIt = fixIt - 10;
        if (fixIt <= 0) {
            fixIt = 0;
        }
    }

    @Override
    public void feed() {
    }

    @Override
    public void water() {
    }

    @Override
    public void tick() {
        oilLevel = oilLevel + 5;
        fixIt = fixIt + 5;
        boredom = boredom + 5;
    }
}

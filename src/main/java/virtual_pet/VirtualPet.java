package virtual_pet;

public class VirtualPet {

    private String name = "Jeff";
    private int hunger = 10;
    private int thirst = 10;
    private int boredom = 10;

    public VirtualPet(String name, int hunger, int thirst, int boredom) {
        this.name = name;
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
    }

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }

    public void tick() {
        hunger = hunger + 10;
        thirst = thirst + 10;
        boredom = boredom + 10;
    }

    public void feed() {
        hunger = hunger -5;
    }

    public void water() {
        thirst = thirst -5;
    }

    public void play() {
        boredom = boredom -5;
    }
}

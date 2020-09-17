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
        if (hunger >= 5) {
            hunger = hunger - 5;
        } else {
            System.out.println("I am full!");
        }
    }

    public void water() {
        if (thirst >= 5){
            thirst = thirst -5;
        } else {
            System.out.println("I am hydrated!");
        }
    }

    public void play() {
        if (boredom >= 5){
            boredom = boredom -5;
        } else {
            System.out.println("I am content");
        }
    }
}

package virtual_pet;

public class VirtualPet {

    private String name; // = "Jeff";
    private int hunger = 10;
    private int thirst = 10;
    private int boredom = 10;
    private String astrologicalSign = "Aries";
    private boolean deceased = false;

    public VirtualPet(String name, int hunger, int thirst, int boredom, String astrologicalSign) {
        this.name = name;
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
        this.astrologicalSign = astrologicalSign;
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
    public String getSign() {
        return astrologicalSign;
    }

    public void tick() {
        hunger = hunger + 10;
        thirst = thirst + 10;
        boredom = boredom + 10;
    }

    public void feed() {
       hunger = hunger-5;
       if(hunger<=0){
           hunger =0;}
       }

    public void water() {
        thirst = thirst-5;
        if(thirst<=0){
            thirst =0;}
    }

    public void play() {
        boredom = boredom-5;
        if(boredom<=0){
            boredom =0;}
    }

    public void dead() {
        if (hunger >= 100 || thirst >= 100 || boredom >= 100) {
            deceased = true;
            System.out.println("Sorry, your pet has died!");
        } else {
            deceased = false;
        }
    }
        @Override
        public String toString() {
            return name + hunger;
        }
    }


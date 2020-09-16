package virtual_pet;

public class VirtualPet {
    private String name;

    public VirtualPet(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getHunger() {
        return 10;
    }
    public int getThirst() {
        return 10;
    }
    public int getBoredom() {
        return 10;
    }
}

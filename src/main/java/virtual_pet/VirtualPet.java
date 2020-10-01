package virtual_pet;

public class VirtualPet {

    private String name; // = "Jeff";
    private int hunger = 10;
    private int thirst = 10;
    public int boredom = 10;
    private int randomNumber = (int) (Math.random() * 11);
    private String astrologicalSign = signGenerator();
    private boolean deceased = false;
    private Object RoboticCat;
    private Object RoboticDog;

    public VirtualPet(String name, int hunger, int thirst, int boredom, String astrologicalSign) {
        this.name = name;
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
        this.astrologicalSign = signGenerator();
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
        hunger = hunger + 5;
        thirst = thirst + 5;
        boredom = boredom + 5;
    }

    public String signGenerator() {         // Need to get this talking to virtual pet constructor for random sign.
        if (randomNumber == 0) {
            return "Aries";
        } else if (randomNumber == 1) {
            return "Taurus";
        } else if (randomNumber == 2) {
            return "Gemini";
        } else if (randomNumber == 3) {
            return "Cancer";
        } else if (randomNumber == 4) {
            return "Leo";
        } else if (randomNumber == 5) {
            return "Virgo";
        } else if (randomNumber == 6) {
            return "Libra";
        } else if (randomNumber == 7) {
            return "Scorpio";
        } else if (randomNumber == 8) {
            return "Sagittarius";
        } else if (randomNumber == 9) {
            return "Capricorn";
        } else if (randomNumber == 10) {
            return "Aquarius";
        } else if (randomNumber == 11) {
            return "Pisces";
        } return "Aries";
    }

        public void feed () {
            hunger = hunger - 10;
            if (hunger <= 0) {
                hunger = 0;
            }
        }

        public void water () {
            thirst = thirst - 10;
            if (thirst <= 0) {
                thirst = 0;
            }
        }

        public void play () {
            boredom = boredom - 10;
            if (boredom <= 0) {
                boredom = 0;
            }
        }

        public void dead () {
            if (hunger >= 100 || thirst >= 100 || boredom >= 100) {
                deceased = true;
                System.out.println("Sorry, your pet has died!");
            } else {
                deceased = false;
            }
        }

        public String status () {
            if (VirtualPetShelter.retrieveIds().equals(RoboticCat) || VirtualPetShelter.retrieveIds().equals(RoboticDog)) {
                return VirtualPetShelter.retrieveIds() + " | Name: " + name + " | Maintenance: " + hunger + " | Oil Level: " + thirst + " | Boredom: " + boredom + " | Sign: " + astrologicalSign;
            }
            return VirtualPetShelter.retrieveIds() + " | Name: " + name + " | Hunger/Maintenance: " + hunger + " | Thirst/Oil: " + thirst + " | Boredom: " + boredom + " | Sign: " + astrologicalSign;
        }
        @Override
        public String toString () {
            return name + " | Hunger: " + hunger + " | Thirst: " + thirst + " | Boredom: " + boredom + " | Sign: " + astrologicalSign;
        }
    }


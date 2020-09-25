package virtual_pet;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.*;

public class VirtualPetShelter {

    private Map<String, VirtualPet> petList = new HashMap<String, VirtualPet>();
    //need to put pet type in key instaed of name

    public void addRoboticCat(RoboticCat petToAdd) {
        petList.put("Robotic Cat", petToAdd);
    }

    public void addRoboticDog(RoboticDog petToAdd) {
        petList.put("Robotic Dog", petToAdd);
    }

    public void addOrganicCat(OrganicCat petToAdd) {
        petList.put("Organic Cat", petToAdd);
    }

    public void addOrganicDog(OrganicDog petToAdd) {
        petList.put("Organic Dog", petToAdd);
    }

    public void removePet(String petName) {
        petList.remove(petName);
    }

    public void feedAllPets() {
        for (VirtualPet petToFeed : petList.values()) {
            petToFeed.feed();
        }
    }
    public void oilRoboticPets() {
        for (VirtualPet petToFeed : petList.values()) {
            petToFeed.feed();
        }
    }

    public void waterAllPets() {
        for (VirtualPet petToWater : petList.values()) {
            petToWater.water();
        }
    }


    public void playAllPets() {
        for (VirtualPet petToPlay : petList.values()) {
            petToPlay.play();
        }
    }

    public void tickAllPets() {
        for (VirtualPet petToTick : petList.values()) {
            petToTick.tick();
        }
    }

    public Collection<VirtualPet> retrievePets() {
        return petList.values();
    }


    public Set<String> retrieveIds() {
        return petList.keySet();
    }

    public VirtualPet retrievePet(String petName) {
        return petList.get(petName);
    }

    }


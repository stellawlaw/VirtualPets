package virtual_pet;

import java.lang.reflect.Array;
import java.util.*;

public class VirtualPetShelter {

    private Map<String, VirtualPet> petList = new HashMap<String, VirtualPet>();

    public void addPet(VirtualPet petToAdd) {
        petList.put(petToAdd.getName(), petToAdd);
    }

    public void removePet(String petName) {
        petList.remove(petName);
    }

    public void feedAllPets() {
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

    public VirtualPet retrievePet(String petName) {
        return petList.get(petName);
    }

    }


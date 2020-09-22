package virtual_pet;

import java.lang.reflect.Array;
import java.util.*;

public class VirtualPetShelter {

    private Map<String, VirtualPet> petList = new HashMap<String, VirtualPet>();

    public void addPet(VirtualPet pet1) {
        petList.put(pet1.getName(), pet1);
    }

    public Collection<VirtualPet> retrievePets() {
        return petList.values();
    }


    }

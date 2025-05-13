
import java.util.ArrayList;
import java.util.List;

public class Animalerie {
    @SuppressWarnings("Convert2Diamond")
    private final List<Animal> animaux = new ArrayList<Animal>();

    public Animalerie() {
    }

    public List<Animal> getAnimaux() {
        return animaux;
    }

    public void add(Animal animal) {
        animaux.add(animal);
    }
}

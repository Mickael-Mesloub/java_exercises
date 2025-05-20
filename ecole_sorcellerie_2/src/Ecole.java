
import java.util.ArrayList;

public class Ecole {
    private ArrayList<Sorcier> sorciers = new ArrayList<Sorcier>();

    public Ecole() {
    }

    public ArrayList<Sorcier> getSorciers() {
        return sorciers;
    }

    public void addSorcier(Sorcier sorcier) {
        sorciers.add(sorcier);
    }

}

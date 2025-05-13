public class Chien extends Animal {
    public Chien(String nom) {
        super(nom, RaceAnimal.CHIEN);
    }

    public String aboyer() {
        return "ouaf ouaf";
    }

    @Override
    public String toString() {
        return String.format("Salut ! Je m'appelle %s, je suis un %s, et je fais %s !", nom, getRace(), aboyer());
    }
}

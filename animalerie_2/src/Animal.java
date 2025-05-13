public abstract class Animal {
    protected String nom;
    protected RaceAnimal race;

    public Animal(final String nom, RaceAnimal race) {
        this.nom = nom;
        this.race = race;
    }

    public String getRace() {
        String result;
        result = switch (race) {
            case RaceAnimal.CHIEN -> "chien";
            case RaceAnimal.CHAT -> "chat";
            default -> "animal inconnu";
        };

        return result;
    }
}

public class Professeur extends Sorcier {
    private final Cours cours;

    public Professeur(String nom, int age, Cours cours) {
        super(nom, age);
        this.cours = cours;
    }

    public String nomCours() {
        String result;
        result = switch (cours) {
            case Cours.BOTANIQUE -> "Botanique";
            case Cours.METAMORPHOSE -> "Métamorphose";
            case Cours.POTIONS -> "Potions";
            case Cours.SORTILEGES -> "Sortilèges";
        };

        return result;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += String.format(", prof de %s", nomCours());

        return result;
    }
}

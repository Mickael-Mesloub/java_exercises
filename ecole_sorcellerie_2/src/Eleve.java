public class Eleve extends Sorcier {
    private int annee;
    private Maison maison;

    public Eleve(String nom, int age, int annee, Maison maison) throws InvalidYearException {
        super(nom, age);

        if (annee < 1 || annee > 7) {
            throw new InvalidYearException();
        }

        this.annee = annee;
        this.maison = maison;
    }

    public String nomMaison() {
        String result;
        result = switch (maison) {
            case Maison.GRYFFONDOR -> "Gryffondor";
            case Maison.POUFSOUFFLE -> "Poufsouffle";
            case Maison.SERDAIGLE -> "Serdaigle";
            case Maison.SERPENTARD -> "Serpentard";
        };

        return result;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += String.format(", année %d, fait partie de la maison %s", annee, nomMaison());

        return result;
    }
}

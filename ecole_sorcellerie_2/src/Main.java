
public class Main {
    public static void main(String[] args) {

        try {
            Professeur severus = new Professeur("Rogue", 39, Cours.POTIONS);
            Eleve harry = new Eleve("Potter", 11, 1, Maison.GRYFFONDOR);

            System.out.println(severus);
            System.out.println(harry);
        } catch (InvalidYearException e) {
            System.err.println("\u001B[31mErreur: Année invalide: elle doit être entre 1 et 7.\u001B[0m");
        }

    }
}

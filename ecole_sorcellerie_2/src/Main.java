
public class Main {
    public static void main(String[] args) {

        try {
            Professeur severus = new Professeur("Rogue", 39, Cours.POTIONS);
            Professeur minerva = new Professeur("McGonagall", 65, Cours.METAMORPHOSE);
            Professeur filius = new Professeur("Flitwick", 54, Cours.SORTILEGES);
            Professeur pomona = new Professeur("Chourave", 55, Cours.BOTANIQUE);

            Eleve drago = new Eleve("Malefoy", 11, 1, Maison.SERPENTARD);
            Eleve harry = new Eleve("Potter", 11, 1, Maison.GRYFFONDOR);
            Eleve cho = new Eleve("Chang", 12, 2, Maison.SERDAIGLE);
            Eleve cedric = new Eleve("Diggory", 14, 4, Maison.POUFSOUFFLE);

            Ecole poudlard = new Ecole();

            poudlard.addSorcier(severus);
            poudlard.addSorcier(minerva);
            poudlard.addSorcier(filius);
            poudlard.addSorcier(pomona);

            poudlard.addSorcier(drago);
            poudlard.addSorcier(harry);
            poudlard.addSorcier(cho);
            poudlard.addSorcier(cedric);

            System.out.println(poudlard.getSorciers());
        } catch (InvalidYearException e) {
            System.err.println("\u001B[31mErreur: Année invalide: elle doit être entre 1 et 7.\u001B[0m");
        }

    }
}

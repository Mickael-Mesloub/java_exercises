public class Main {
    public static void main(String[] args) throws Exception {
        Chat oiiaCat = new Chat("OiiA");
        Chien scoobyDoo = new Chien("Scooby-Doo");
        Animalerie animalerie = new Animalerie();

        animalerie.add(oiiaCat);
        animalerie.add(scoobyDoo);

        for (Animal animal : animalerie.getAnimaux()) {
            System.out.println(animal);
        }
    }
}

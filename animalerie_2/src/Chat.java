public class Chat extends Animal {
    public Chat(String nom) {
        super(nom, RaceAnimal.CHAT);
    }

    public String miauler() {
        return "miaaaou";
    }

    @Override
    public String toString() {
        return String.format("Salut ! Je m'appelle %s, je suis un %s, et je fais %s !", nom, getRace(), miauler());
    }
}

public class Animal {
    private String nom;
    private String race;
    private String cri;

    public Animal(final String nom, final String race, String cri) {
        this.nom = nom;
        this.race = race;
        this.cri = cri;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getCri() {
        return cri;
    }

    public void setCri(String cri) {
        this.cri = cri;
    }

    @Override
    public String toString() {
        return String.format("Animal{nom='%s', race='%s', cri='%s'}", nom, race, cri);
    }
}

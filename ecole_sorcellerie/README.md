# Ecole de sorcellerie - première partie

Nous allons créer une école de sorcellerie et la gérer ainsi que les sorciers qu'elle contiendra.

Recopier le code suivant dans le main.

```java
public class Main {
 public static void main(String[] args) {

 Sorcier harry = new Sorcier("Potter", 11);
 Sorcier dumby = new Sorcier("Dumbledore", 154);
 Sorcier severus = new Sorcier("Rogue", 33);

    System.out.println(harry);
    System.out.println(dumby);
    System.out.println(severus);

    }
}
```

Sachant que l'exécution du code doit afficher le nom du sorcier et son age entre parenthèses sous la forme
suivante :

```bash
Potter (11 ans)
Dumbledore (154 ans)
Rogue (33 ans)
```

Modifier ce qu'il faut dans la classe Sorcier pour obtenir ce résultat.

Les seules modifications autorisées dans la classe Main sont les imports de classes.

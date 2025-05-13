# Exercice : École de sorcellerie 2ème partie

## Question 1 :

Dans notre école nous voulons différencier nos sorciers :

- les professeurs qui sont des sorciers avec un cours qu'ils enseignent
- les élèves qui sont des sorciers qui possède une année (leur classe de 1 à 7) et une maison

Créez les classes dérivées de sorcier : professeur et eleve avec leurs attributs. Modifier les méthodes toString() pour qu'elles affichent en plus les nouveaux attributs.

## Question 2 :

Créez une école qui possède un tableau de sorcier.
Ajouter une méthode addSorcier(Sorcier sorcier) qui ajoute un sorcier dans l'école

créez les sorciers suivant :
4 professeurs :
Rogue, 39 ans, Potionsa
McGonagall, 65 ans, Métamorphose
Flitwick, 54 ans, Sortilèges
Chourave, 55 ans, Botanique
4 eleves :
Malefoy, 11ans, année 1, serpentard
Potter, 11 ans, année 1, griffondor
Chang, 12 ans, année 2, serdaigle
Diggory, 14 ans, année 4,poufsouffle

Ajoutez les à l'école, puis affichez les sorciers de l'école.

## Question 3 :

Modifier vos classes pour qu'on ne puisse pas instancier de Sorcier mais que le reste de votre code continue de fonctionner de la même façon.

## Question 4 (bonus) :

On veut connaitre le niveau d'excellence de notre école.
Ce niveau est calculé selon plusieurs critères :
_ un professeur apporte 20 points d'excellence + 5 point pas dizaine d'age (un sorcier de 40 ans rapporte 4 dizaine _ 5 = 20 points) \* un eleve rapporte 10 points d'excellence par niveau d'année
Dans votre classe ecole rajouter une méthode calculDExcellence() qui va calculer le total de points d'excellence que rapporte chacun de ses sorciers.
2 méthodes :

- méthode bourrier : on fait tout dans la classe école
- méthode élégante : on se sert de l'héritage

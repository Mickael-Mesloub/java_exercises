# Exercice : École de sorcellerie — 2ᵉ partie

## Question 1 :

Dans notre école, nous voulons différencier nos sorciers :

- les professeurs, qui sont des sorciers avec un cours qu'ils enseignent ;

- les élèves, qui sont des sorciers possédant une année (leur classe de 1 à 7) et une maison.

<br>

Créez les classes dérivées de Sorcier : Professeur et Élève, avec leurs attributs respectifs. Modifiez les méthodes toString() pour qu'elles affichent également les nouveaux attributs.

## Question 2 :

Créez une école qui possède un tableau de sorciers.
Ajoutez une méthode addSorcier(Sorcier sorcier) qui ajoute un sorcier dans l'école.

Créez les sorciers suivants :

- 4 professeurs :

  - Rogue, 39 ans, Potions

  - McGonagall, 65 ans, Métamorphose

  - Flitwick, 54 ans, Sortilèges

  - Chourave, 55 ans, Botanique

- 4 élèves :

  - Malefoy, 11 ans, année 1, Serpentard

  - Potter, 11 ans, année 1, Gryffondor

  - Chang, 12 ans, année 2, Serdaigle

  - Diggory, 14 ans, année 4, Poufsouffle

<br>
Ajoutez-les à l'école, puis affichez les sorciers de l'école.

## Question 3 :

Modifiez vos classes pour qu'on ne puisse pas instancier de Sorcier, mais que le reste de votre code continue de fonctionner de la même façon.

## Question 4 (bonus) :

On veut connaître le niveau d'excellence de notre école.
Ce niveau est calculé selon plusieurs critères :

- Un professeur rapporte 20 points d'excellence, plus 5 points par dizaine d'années (par exemple, un sorcier de 40 ans rapporte 4 dizaines × 5 = 20 points).

- Un élève rapporte 10 points d'excellence par niveau d'année.

<br>

Dans votre classe Ecole, ajoutez une méthode calculDExcellence() qui calcule le total de points d'excellence que rapporte chacun de ses sorciers.

Deux approches possibles :

- Méthode "bourrin" : on fait tout dans la classe Ecole.

- Méthode élégante : on se sert de l'héritage.

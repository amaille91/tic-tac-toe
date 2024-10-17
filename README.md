# Tic Tac Toe

## Contexte

Nous développons un jeu de tic-tac-toe (ou morpion). Les premières fonctionalités ont été
développées par un collègue. Vous reprenez le développement du jeu avec de nouvelles
fonctionalités.

## Existant

Le jeu expose 3 manière d'interagir avec lui :
- une méthod `isWinner` prenant le symbole d'un joueur en entrée et retournant un
booléen indiquant si le joueur a gagné. Pour le moment, cette méthode ne vérifie QUE LES
LIGNES.
- une méthode `nextMove`, l'"intelligence artificielle" du jeu. Son but est de déterminer
quel est le meilleur coup à jouer pour un joueur donné. Pour le moment, cette fonctionalité
renvoie l'indice de la case permettant au joueur de gagner au prochain coup ou bien l'indice
de la première case vide.
- une méthode `play` qui crée un nouveau jeu avec le nouveau jeton de joueur en question, placé
sur la case dont l'indice est spécifié en entrée.

## Évolution

Deux évolutions sont demandées :

1) Faire évoluer la méthode `isWinner` pour qu'elle vérifie également les colonnes et les diagonales

2) Faire évoluer la méthode `nextMove` pour qu'elle retourne l'indice (par ordre de priorité)
  - de la case qui permet au joueur de gagner si elle existe
  - de la case qui permet de bloquer l'adversaire (qui aurait gagné au tour suivant) *(NOUVEAU)*
  - de la première case vide

## Consignes

- Considérez ce code comme vous appartenant. Tout changement est possible
- Des tests existent et passent dans l'état actuel du code. Vous veillerez à ce que les tests passent
encore après vos évolutions.
- Chaque évolution est à faire séparément. Nous vous demandons de ne passer à la deuxième évolution uniquement
lorsque vous considérez que la première est terminée (comme pour un ticket)

Bon courage !

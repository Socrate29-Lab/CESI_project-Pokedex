# CESI_project-Pokedex
Pour notre évaluation, nous simulons un Pokedex simplifié.

## Partie UML
Dans ce dossier, j'ai déposé :
- Le cas d'utilisation en PNG ainsi qu'en '.excalidraw', qui peut se lire sur le site du même nom.
- Le diagramme de classe
- Un autre sous-dossier avec les diagrammes de séquence
    - Recherche d'un pokemon par nom
    - Recherche d'un pokemon par type
    - Ajout d'un nouveau pokémon
    - Mise à jour d'un pokemon
    - Suppression d'un pokemon

## Partie Developpement

### Pokedex
Le logiciel Pokedex est codé sous IntelliJ, en JavaFX, avec Gradle pour compiler
La connexion avec la base de données est effective, il faut simplement créer son fichier **.env** en suivant l'exemple du **.exempleenv**
L'application est pour le moment capable d'afficher la liste des pokemon (Nom, Niveau, Points de vie, Experience, Type) quand on clique sur le bouton pour charger les données.

### Base de données
La base de données sera hébergée sur un serveur MariaDB (compatible avec mySQL).

Pour mettre en place la base de données : 
- créer une nouvelle DB sur votre DB favorite
- copier le contenu du MCD_pokedex.txt
- Adapter la ligne "USE" avec le nom de votre DB à la place.
- Lancer le script SQL
- La DB est créée !



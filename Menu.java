//Ceci importe la classe Scanner du package java.util
import java.util.Scanner;
//Ceci importe toutes les classes du package java.util
import java.util.*;


public class Menu{

    Menu(){

    }

    Menu(Scanner sc){

    }

    public int showMenu(Scanner sc, String statement){
        if (!statement.equals("guide")){
            System.out.println("Bienvenu au menu, vous avez plusieurs choix qui s'offre à vous !");
        }

        System.out.println("Tapez 'guide' pour afficher le guide, 'start' pour lancer la partie, 'exit' pour quitter le jeu");

        String choice = sc.nextLine();

        while (!choice.equals("start") && !choice.equals("guide") && !choice.equals("exit")){
            System.out.println("Veuillez choisir entre start, guide ou exit !");
            choice = sc.nextLine();
        }

        if (choice.equals("start")){
            //lance la partie
            return 1;
        }else if (choice.equals("guide")){
            // affiche le guide
            this.showGuide();
            return 2;
        }else if (choice.equals("exit")){
            //ferme le jeu
            System.out.println("Fermeture du jeu");
            return 3;
        }else {
            System.out.println("Une erreur est survenu");
            return 0;
        }
    }

    private void showGuide(){
        System.out.println("Voici le guide du jeu :");
        System.out.println("Pour commencer, l'objectif du jeu est de battre les sbires du vilain boss pour finalement l'atteindre.");
        System.out.println("Sauf qu'il n'est pas simple de l'atteindre. Ce n'est pas comme dans la majorité des RPG où il suffit de cliquer sur un bouton attaque pour pouvoir battres vos adversaire.");
        System.out.println("Non il faut principalement répondre à la question qu'il vous pose !");
        System.out.println("Chaque question à trois réponse, si vous répondez juste alors ça enlève des points de vie à votre adversaire, sinon c'est le tour de l'ennemie.");
        System.out.println("A chaque fois que vous battez votre ennemie, vous gagnez des points qu'il vous permettra d'acheter des stats ou des compétences pour améliorer votre personnage");
        System.out.println("Sauf qu'il n'est possible d'améliorer votre personnage seulement avant chaque boss, pas avant, ni après.");
        System.out.println("Si vous échouez, c'est retour à la case départ. Il n'y a pas de sauvegarde non plus, donc il faut réussir du premier coup !");
    }
}

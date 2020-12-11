//Ceci importe la classe Scanner du package java.util
import java.util.Scanner;
//Ceci importe toutes les classes du package java.util
import java.util.*;


public class Battle {

    private int levelRoom = 0;
    private Boss bossEnemy = new Boss();
    private final Hero hero = new Hero();

    public Battle() {

    }

    public String battleFight(Scanner sc){
        System.out.println("Vous entrez dans l'arene et vous êtes prêt à vous battre !");

        for (int i = 0; i < bossEnemy.sbires.length; i++){

            //on vérifie si le sbire n'est pas déjà battu
            if (!bossEnemy.sbires[i].beat){
                System.out.println("Vous tombez nez à nez contre " + bossEnemy.sbires[i].getName());
            }


            // tant qu'il y aura un sbire du boss alors on combat les sbires
            while (roundBattle(bossEnemy, false, i) == 0){

                if (hero.getHp() == 0){
                    System.out.println("Vous n'avez plus de point de vie.. c'est un game over");
                    return "exit";
                }

                System.out.println("Il a actuellement " + bossEnemy.sbires[i].getHp() + " points de vie");
                String choice = sc.nextLine();


                // Si l'utilisateur décide de retourner au menu, alors ça met le jeu en pause.
                if (choice.equals("menu")){
                    return this.askUser(choice, 0);
                }

                System.out.println(this.askUser(choice, i));
            }

        }

        String choice = sc.nextLine();

        return this.askUser(choice, 0);
    }

    public String askUser(String response, int sbire){

        if (response.equals("menu")){
            return "menu";
        }

        if (response.equals("1") || response.equals("2") || response.equals("3") ){
            int responseInt = Integer.parseInt(response);

            if (responseInt == bossEnemy.sbires[sbire].getGoodAnswer(0)){
                bossEnemy.sbires[sbire].setHp(3);
                return "Bravo ! Vous avez répondu juste !";
            }
        }

        hero.setHp(2);
        return "Arf, vous vous êtes trompé !";

    }

    private int roundBattle(Boss boss, boolean bool, int sbire){
        if (!bool){
            if (boss.sbires[sbire].getHp() == 0){
                return 1;
            }

            System.out.println(boss.sbires[sbire].getQuestion(0));
            System.out.println("Réponse 1 : " + boss.sbires[sbire].getReponse(0)[0]);
            System.out.println("Réponse 2 : " + boss.sbires[sbire].getReponse(0)[1]);
            System.out.println("Réponse 3 : " + boss.sbires[sbire].getReponse(0)[2]);
        }
        return 0;
    }
}

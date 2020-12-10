//Ceci importe la classe Scanner du package java.util
import java.util.Scanner;
//Ceci importe toutes les classes du package java.util
import java.util.*;


public class Battle {

    private int levelRoom;
    private Boss bossEnemy = new Boss();

    public Battle() {

    }

    public String battleFight(Scanner sc){
        System.out.println("Vous tombez nez à nez contre " + bossEnemy.sbires[0].getName());
        System.out.println("Il a actuellement " + bossEnemy.sbires[0].getHp() + " points de vie");
        System.out.println(bossEnemy.sbires[0].getQuestion(0));
        System.out.println("Réponse 1 : " + bossEnemy.sbires[0].getReponse(0)[0]);
        System.out.println("Réponse 2 : " + bossEnemy.sbires[0].getReponse(0)[1]);
        System.out.println("Réponse 3 : " + bossEnemy.sbires[0].getReponse(0)[2]);

        String choice = sc.nextLine();

        return this.askUser(choice);
    }

    public String askUser(String response){

        if (response.equals("menu")){
            return "menu";
        }

        int responseInt = Integer.parseInt(response);
        System.out.println(bossEnemy.sbires[0].getGoodAnswer(0));
        if (responseInt == bossEnemy.sbires[0].getGoodAnswer(0)){
            return "Bravo ! Vous avez répondu juste !";
        }else {
            return "Arf, vous vous êtes trompé !";
        }
    }
}

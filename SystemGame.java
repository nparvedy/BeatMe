//Ceci importe la classe Scanner du package java.util
import java.util.Scanner;
//Ceci importe toutes les classes du package java.util
import java.util.*;

public class SystemGame {
    private final Scanner sc = new Scanner(System.in);
    private final Menu menu = new Menu(this.sc);
    private final Battle battle = new Battle();
    private String statement = "";

    public int start(){
        if (this.statement.equals("start")){
            System.out.println("Vous êtes en game");

            String choice = battle.battleFight(this.sc);

            if (choice.equals("menu")){
                this.statement = "menu";
            }else if (choice.equals("exit")){
                return 1;
            } else{
                System.out.println(choice);
            }

        }else if (this.statement.equals("menu") || this.statement.equals("") || this.statement.equals("guide")){
            int response = menu.showMenu(this.sc, this.statement);

            if (response == 3 ){
                return 1;
            }else if (response == 2){
                this.statement = "guide";
            }else if (response == 1){
                this.statement = "start";
            }
        }

        return 0;
    }

}

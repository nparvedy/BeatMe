public class Sbire extends CharacterGame implements Enemy{
    protected int givePointSkill;
    private String[] listSkill;
    private String questions[] = {"Combien font 1+1 ?"};
    private String response[][] = { {"3", "2", "5"}, { "Réponse 4", "Réponse 5", "Réponse 6"} };
    private int[] goodAnswer = {2};
    boolean beat = false;

    Sbire(String name, int hp, int mana){
         this.name = name;
         this.hp = hp;
         this.mana = mana;
    }


    String getName(){
        return this.name;
    }



    void setHp(int dmg){
        this.hp = this.hp - dmg;
        if (this.hp < 0){
            this.hp = 0;
            System.out.println("Bravo ! Votre ennemi n'a plus de point de vie, vous avez gagné !");
            this.beat = true;
        }
    }

    int getMana(){
        return this.mana;
    }

    String getQuestion(int nb){
        return this.questions[nb];
    }

    String[] getReponse(int nbQuestion){
        return this.response[nbQuestion];
    }

    int getGoodAnswer(int nbQuestion){
        return this.goodAnswer[nbQuestion];
    }

}

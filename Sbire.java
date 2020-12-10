public class Sbire extends CharacterGame implements Enemy{
    protected int givePointSkill;
    private String[] listSkill;
    private String questions[] = {"Combien font 1+1 ?"};
    private String response[][] = { {"réponse 1", "réponse 2", "réponse 3"}, { "Réponse 4", "Réponse 5", "Réponse 6"} };

    Sbire(String name, int hp, int mana){
         this.name = name;
         this.hp = hp;
         this.mana = mana;
    }


    String getName(){
        return this.name;
    }

    int getHp(){
        return this.hp;
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

}

public class Battle {

    private int levelRoom;
    private Boss bossEnemy = new Boss();

    public Battle() {

    }

    public void battleFight(){
        System.out.println("Vous tombez nez à nez contre " + bossEnemy.sbires[0].getName());
        System.out.println("Il a actuellement " + bossEnemy.sbires[0].getHp() + " points de vie");
        System.out.println(bossEnemy.sbires[0].getQuestion(0));
        System.out.println("Réponse 1 : " + bossEnemy.sbires[0].getReponse(0)[0]);
        System.out.println("Réponse 2 : " + bossEnemy.sbires[0].getReponse(0)[1]);
        System.out.println("Réponse 3 : " + bossEnemy.sbires[0].getReponse(0)[2]);
    }
}

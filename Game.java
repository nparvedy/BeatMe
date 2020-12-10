public class Game {
    public static void main(String... args){

        System.out.println("Bienvenue dans BeatMe !");
        String choice = "";

        SystemGame systemGame = new SystemGame();

        while (systemGame.start() == 0) {
                choice = "";
        }

    }
}

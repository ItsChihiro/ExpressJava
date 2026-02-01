package homework_3;

public class GameSettings {
    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    GameSettings(String gameName, int currentPlayers) {
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }

    static void setMaxPlayers(int maxPlayersValue) {
        maxPlayers = maxPlayersValue;
    }

    void addPlayer() {
        boolean b = this.currentPlayers < GameSettings.maxPlayers;
        if (b) {
            this.currentPlayers++;
        }
    }

    void printGameStatus() {
        System.out.println("Game name is " + this.gameName + ", current number of players is " + this.currentPlayers + ", max number of players is " + GameSettings.maxPlayers);
    }

    public static void main(String[] args) {
        GameSettings game1 = new GameSettings("UNO", 5);
        GameSettings game2 = new GameSettings("Monopoly", 7);
        GameSettings.setMaxPlayers(8);
        game1.addPlayer();
        game1.printGameStatus();

        game2.addPlayer();
        game2.printGameStatus();

        game2.addPlayer();
        game2.printGameStatus();
    }
}

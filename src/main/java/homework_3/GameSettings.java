package homework_3;

public class GameSettings {
    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    public GameSettings(String gameName, int currentPlayers) {
        this.gameName = gameName;

        if (currentPlayers < 0) {
            this.currentPlayers = 0;
        } else {
            this.currentPlayers = Math.min(currentPlayers, maxPlayers);
        }
    }

    static void setMaxPlayers(int maxPlayersValue) {
        if (maxPlayersValue < 0) {
            maxPlayers = 0;
        } else {
            maxPlayers = maxPlayersValue;
        }
    }

    public void addPlayer() {
        if (currentPlayers < maxPlayers) {
            currentPlayers++;
        } else {
            System.out.println("Cannot add more players to " + gameName);
        }
    }

    void printGameStatus() {
        System.out.println("Game name is " + this.gameName + ", current number of players is " + this.currentPlayers + ", max number of players is " + GameSettings.maxPlayers);
    }

    public static void main(String[] args) {
        GameSettings.setMaxPlayers(5);

        GameSettings game1 = new GameSettings("UNO", 7);
        GameSettings game2 = new GameSettings("Monopoly", 5);

        game1.printGameStatus();
        game2.printGameStatus();

        GameSettings.setMaxPlayers(6);

        game1.addPlayer();
        game1.printGameStatus();

        game2.addPlayer();
        game2.printGameStatus();

        game2.addPlayer();
        game2.printGameStatus();
    }
}

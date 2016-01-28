package Player;

public class PlayerChoice {
    protected String playerChoise;

   public PlayerChoice () {
       playerChoise = "0";
    }

    public String getPlayerChoise() {
        return playerChoise;
    }

    public void setPlayerChoise(String playerChoise) {
        this.playerChoise = playerChoise;
    }
}

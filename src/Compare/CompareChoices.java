package Compare;

import Computer.ComputerChoice;
import Player.PlayerChoice;

public class CompareChoices {
   protected String pChioce;
   protected String cChoice;
   protected String winner;
    ComputerChoice computerChoice = new ComputerChoice();
    PlayerChoice playerChoice  = new PlayerChoice();
//??????????????????????
    protected void obtainWinner (String a, String b) {
        String winn = "-5";
        System.out.println("Выбор игрока сравнение " + playerChoice.getPlayerChoise());
        System.out.println("Выбор компьютера сравнение " + computerChoice.getComputerChoce());
        a = playerChoice.getPlayerChoise();
        b = computerChoice.getComputerChoce();
        if (a.equals(b)) winner = "0";
        switch (a) {
            case "Rock":
                winner = (b.equals("Scissors") ?  "1" : "-1");
                break;
                //return  winner;
            case "Paper":
                winner = (b.equals("Rock") ? "1" : "-1");
                break;
                //return winner;
            case "Scissors":
                winner = (b.equals("Paper") ? "1" : "-1");
                break;
                //return winner;
            default:
                winner = "Error";
                System.out.println(winner);
        }
    }

    public String getWinner() {
        return winner;
    }
}

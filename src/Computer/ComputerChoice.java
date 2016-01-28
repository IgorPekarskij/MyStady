package Computer;

import java.util.Random;

public class ComputerChoice {
    protected String computerChoce; //В переменной сохраняется значение выбранное компьютером
    protected final String[] value = {"Rock", "Paper", "Scissors"};

    public ComputerChoice() {
        Random r = new Random();
        int val = r.nextInt(3);
        computerChoce = value[val];
    }
    public String getComputerChoce() {
        return computerChoce;
    }
}
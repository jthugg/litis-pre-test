package view;

import model.Result;
import model.ScoreCounter;

import java.util.Arrays;

public class InfoPrinter {

    private final int[] selectionRange = {0, 2};
    private final ScoreCounter scoreCounter;

    public InfoPrinter(ScoreCounter scoreCounter) {
        this.scoreCounter = scoreCounter;
    }

    public void greet() {
        System.out.println("\nHello Baseball!");
    }

    public int[] printSelections() {
        System.out.print("\nSELECT\n0.ROCK 1.SCISSORS 2.PAPER\nUser Input: ");
        return selectionRange;
    }

    public void currentState(Result result) {
        System.out.printf(
                "\nresult: %s\n%s strike\n%s out\nscore: %s\nbase status: %s\n",
                result,
                scoreCounter.getStrike(),
                scoreCounter.getOut(),
                scoreCounter.getScore(),
                Arrays.toString(scoreCounter.getBases())
        );
    }

    public void gameOver() {
        System.out.println("\nGame Over!");
    }

}

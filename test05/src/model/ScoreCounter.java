package model;

import util.ApplicationException;

public class ScoreCounter {

    private int score;
    private int strike;
    private int out;
    private final int[] bases;

    public ScoreCounter() {
        this.score = 0;
        this.strike = 0;
        this.out = 0;
        this.bases = new int[3];
    }

    public void strike() {
        strike++;
        if (strike == 2) {
            out();
            strike = 0;
        }
    }

    private void out() {
        out++;
        if (out == 3) {
            throw ApplicationException.GAME_OVER.getException();
        }
    }

    public int[] onBase() {
        if (bases[2] == 1) {
            score++;
            bases[2]--;
        }
        if (bases[1] == 1) {
            bases[2]++;
            bases[1]--;
        }
        if (bases[0] == 1) {
            bases[1]++;
            bases[0]--;
        }
        bases[0]++;
        return bases;
    }

    public int getScore() {
        return score;
    }

    public int getStrike() {
        return strike;
    }

    public int getOut() {
        return out;
    }

    public int[] getBases() {
        return bases;
    }

}

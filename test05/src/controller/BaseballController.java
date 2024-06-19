package controller;

import model.Computer;
import model.Hand;
import model.Result;
import model.ScoreCounter;

public class BaseballController {

    private final ScoreCounter scoreCounter;
    private final Computer computer;

    public BaseballController(ScoreCounter scoreCounter) {
        this.scoreCounter = scoreCounter;
        this.computer = new Computer();
    }

    public Result compare(int selection) {
        Hand userHand = Hand.values()[selection];
        Result result = computer.calculate(userHand);
        switch (result) {
            case WIN -> scoreCounter.onBase();
            case LOSE -> scoreCounter.strike();
        }
        return result;
    }

}

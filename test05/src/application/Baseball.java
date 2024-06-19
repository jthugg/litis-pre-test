package application;

import controller.BaseballController;
import model.GameOverException;
import model.Result;
import model.ScoreCounter;
import util.UserInputException;
import view.InfoPrinter;
import view.InputAdapter;

public class Baseball {

    private final BaseballController baseballController;
    private final InfoPrinter infoPrinter;
    private final InputAdapter inputAdapter;
    private boolean flag;

    public Baseball() {
        flag = true;
        ScoreCounter scoreCounter = new ScoreCounter();
        baseballController = new BaseballController(scoreCounter);
        infoPrinter = new InfoPrinter(scoreCounter);
        inputAdapter = new InputAdapter();
    }

    public void start() {
        infoPrinter.greet();

        while (flag) {
            flag = run();
        }

        infoPrinter.gameOver();
    }

    private boolean run() {
        try {
            int[] selectionRange = infoPrinter.printSelections();
            int selection = inputAdapter.asInt(selectionRange[0], selectionRange[1]);
            Result result = baseballController.compare(selection);
            infoPrinter.currentState(result);
            return true;
        } catch (UserInputException exception) {
            // ignore...
            return true;
        } catch (GameOverException exception) {
            inputAdapter.close();
            return false;
        }
    }

}

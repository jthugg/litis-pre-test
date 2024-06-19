package util;

import model.GameOverException;

public enum ApplicationException {

    GAME_OVER(new GameOverException()),
    INPUT_ERROR(new UserInputException()),
    ;

    private final BaseballException exception;

    ApplicationException(BaseballException exception) {
        this.exception = exception;
    }

    public BaseballException getException() {
        return exception;
    }

}

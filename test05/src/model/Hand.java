package model;

public enum Hand {

    ROCK,
    SCISSORS,
    PAPER,
    ;

    public Result compare(Hand hand) {
        return switch (this) {
            case ROCK -> whenRock(hand);
            case SCISSORS -> whenScissors(hand);
            case PAPER -> whenPaper(hand);
        };
    }

    private Result whenRock(Hand hand) {
        return switch (hand) {
            case SCISSORS -> Result.WIN;
            case PAPER -> Result.LOSE;
            case ROCK -> Result.DRAW;
        };
    }

    private Result whenScissors(Hand hand) {
        return switch (hand) {
            case PAPER -> Result.WIN;
            case ROCK -> Result.LOSE;
            case SCISSORS -> Result.DRAW;
        };
    }

    private Result whenPaper(Hand hand) {
        return switch (hand) {
            case ROCK -> Result.WIN;
            case SCISSORS -> Result.LOSE;
            case PAPER -> Result.DRAW;
        };
    }

}

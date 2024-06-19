package model;

public class Computer {

    public Result calculate(Hand userHand) {
        Hand computerHand = Hand.values()[(int) (Math.random() * 10) % 3];
        return userHand.compare(computerHand);
    }

}

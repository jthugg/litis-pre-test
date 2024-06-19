package view;

import util.ApplicationException;
import util.UserInputException;

import java.io.Closeable;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputAdapter implements Closeable {

    private final Scanner scanner;

    public InputAdapter() {
        scanner = new Scanner(System.in);
    }

    public int asInt(int begin, int end) throws UserInputException {
        try {
            int value = scanner.nextInt();
            if (value > end || value < begin) {
                throw ApplicationException.INPUT_ERROR.getException();
            }
            return value;
        } catch (InputMismatchException exception) {
            scanner.nextLine();
            throw ApplicationException.INPUT_ERROR.getException();
        }
    }

    @Override
    public void close() {
        scanner.close();
    }

}

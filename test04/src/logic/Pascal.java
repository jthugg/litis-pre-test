package logic;

public class Pascal {

    private final int[][] triangle;

    public Pascal(int setupNumber) {
        triangle = new int[setupNumber][];

        for (int i = 0; i < setupNumber; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1;
            triangle[i][i] = 1;
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }
    }

    public void printTriangle() {
        StringBuilder builder = new StringBuilder();

        for (int[] numbers : triangle) {
            for (int number : numbers) {
                builder.append(number).append(" ");
            }
            builder.append("\n");
        }

        System.out.println(builder);
    }

}

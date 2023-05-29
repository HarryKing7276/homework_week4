package homework_programs_week_4;

// Display left angle triangle of using * using nested for loops.

/**
 *      15. Display left angle triangle of * using nested for loops
 *        *
 *        * *
 *        * * *
 *        * * * *
 *        * * * * *
 */
public class LeftAngleTriangle_15 {
    public static void main(String args[]) {
        triangle();

    }
    public static void  triangle() {

        int row, column, numberOfRows = 6;
        for (row = 0; row < numberOfRows; row++) {
            for (column = 2 * (numberOfRows - row); column > 2; column--) {
                System.out.print(" ");
            }
            for (column = 0; column <= row; column++) {
                System.out.print("* ");
            }
            //To move cursor to new line for each row
            System.out.println();
        }
    }

}

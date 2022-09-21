/*
Given a 2D array A, your task is to convert all the rows to columns and columns to rows
(basically Transpose).
 */
import java.util.Random;
public class Ferrell_Problem5 {
    public static void main(String[] args){
        Random rand = new Random();

        //Determines a random size for the array.
        int x1 = rand.nextInt(2, 6);
        int y1 = rand.nextInt(2, 6);

        //Initializes the array with the previously determined random size.
        int[][] array = new int[x1][y1];
        //Initializes an array with the size of rows and columns swapped.
        int[][] array1 = new int[y1][x1];


        System.out.print("This program will convert a randomly generated array A into\n" +
                         "another array, but row 1 will be converted to column 1, and\n" +
                         "row 2 will be converted to column 2, et cetera.\n");

        System.out.print("Array A is a " + x1 + " by " + y1 + " array. Therefore Array B is a " + y1 + " by " + x1 + " array.\n\n\n");

/*
        //Prints and fills the array with formatting.
        for (int i = 0; i < y1; i++) {
            System.out.print("-----");
        }
        System.out.print("\n");
        for (int i = 0; i < x1; i++) {
            for (int j = 0; j < y1; j++) {
                array[i][j] = rand.nextInt(1, 10);
                System.out.print("| " + array[i][j] + " |");
            }
            System.out.print("\n");
            for (int j = 0; j < y1; j++) {
                System.out.print("-----");
            }
            System.out.print("\n");
        }
 */

        //fills array1 with swapped rows and columns from array
        for (int i = 0; i < x1; i++) {
            for (int j = 0; j < y1; j++) {
                array[i][j] = rand.nextInt(1, 10);
                array1[j][i] = array[i][j];
            }
        }

        //prints array
        for (int i = 0; i < x1; i++) {
            for (int j = 0; j < y1; j++) {
                System.out.print("| " + array[i][j] + " |");
            }
            System.out.print("\n");
        }

        System.out.println("\n");

        //prints array1
        for (int i = 0; i < y1; i++) {
            for (int j = 0; j < x1; j++) {
                System.out.print("| " + array1[i][j] + " |");
            }
            System.out.print("\n");
        }

    }
}

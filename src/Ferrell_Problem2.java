
import java.util.Random;
import java.util.Scanner;
/*
Write a Java program to perform Matrix subtraction.

You can hardcode/declare your matrix in the program itself. Hint: Remember a Matrix
can be considered to be a 2 dimensional matrix. Matrix subtraction should be done
between matrices of same size. Matrix subtraction is simply the difference of the elements
in the same position in the two matrices.
 */
public class Ferrell_Problem2 {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        //Generates a random size for the matrices
        int x1 = rand.nextInt(2, 6);
        int y1 = rand.nextInt(2, 6);
        int[][] matrix1 = new int[x1][y1];
        int[][] matrix2 = new int[x1][y1];
        int[][] matrix3 = new int[x1][y1];

        int[][] hardmatrix1 = {
                {-5, 4, 9, 2},
                {5, -9, 5, 0},
                {6, 2, 3, -1},
                {7, -2, 7, 2},
        };
        int[][] hardmatrix2 = {
                {-5, 4, 9, 2},
                {5, -9, 5, 0},
                {6, 2, 3, -1},
                {7, -2, 7, 2},
        };
        int[][] emptymatrix = new int[hardmatrix1.length][hardmatrix1[0].length];

        int input = 0;
        boolean going = true;
        while (going) {
            try {
                System.out.println("Would you like to use random Matrices or Hard-Coded Matrices: \n" +
                                   "(1 for random, 2 for hard coded)");
                input = scan.nextInt();
                going = false;
            } catch (Exception e) {
                scan.nextLine();
                if (e.toString() == "java.util.InputMismatchException") {
                    System.out.println("You entered something other than an Integer\nTry again");
                } else {
                    e.printStackTrace();
                }
            }
        }

        if(input != 1){
            matrix1 = hardmatrix1;
            matrix2 = hardmatrix2;
            matrix3 = emptymatrix;
            x1 = matrix1.length - 1;
            y1 = matrix1[0].length - 1;
        }




        System.out.println("Matrix one and two are each a " + matrix1.length + " by " + matrix1[0].length + " array.");
        System.out.println("Matrix one minus Matrix two equals Matrix three.");



        //Fill matrices with random ints between -5 and 5
        for(int i = 0; i < x1; i++){
            for(int j = 0; j < y1; j++){
                matrix1[i][j] = rand.nextInt(-5,5);
            }
        }
        for(int i = 0; i < x1; i++){
            for(int j = 0; j < y1; j++){
                matrix2[i][j] = rand.nextInt(-5,5);
            }
        }

        if(input != 1){
            matrix1 = hardmatrix1;
            matrix2 = hardmatrix2;
            matrix3 = emptymatrix;
            x1 = matrix1.length;
            y1 = matrix1[0].length;
        }

        //actually does the subtraction
        for(int i = 0; i < x1; i++){
            for(int j = 0; j < y1; j++){
                matrix3[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }


        //prints top lines above the matrices
        for(int u = 0; u < x1; u++){
            System.out.print("----");
        }
        System.out.print("-          ");
        for(int u1 = 0; u1 < x1; u1++){
            System.out.print("----");
        }
        System.out.print("-          ");
        for(int u2 = 0; u2 < x1; u2++){
            System.out.print("----");
        }
        System.out.print("-");
        System.out.print("\n");


        for(int i = 0; i < y1; i++){

            //prints each line of matrix1
            for(int j = 0; j < x1; j++){
                if(j == 0) {
                    if(matrix1[j][i] < 0){
                        System.out.print("|" + matrix1[j][i] + " |");
                    } else {
                        System.out.print("| " + matrix1[j][i] + " |");
                    }
                }else{
                    if(matrix1[j][i] < 0){
                        System.out.print("" + matrix1[j][i] + " |");
                    } else {
                        System.out.print(" " + matrix1[j][i] + " |");
                    }
                }
            }

            //prints the space between each line of the matrices
            System.out.print("          ");

            //prints each line of matrix2
            for(int j = 0; j < x1; j++){
                if(j == 0) {
                    if(matrix2[j][i] < 0){
                        System.out.print("|" + matrix2[j][i] + " |");
                    } else {
                        System.out.print("| " + matrix2[j][i] + " |");
                    }
                }else{
                    if(matrix2[j][i] < 0){
                        System.out.print("" + matrix2[j][i] + " |");
                    } else {
                        System.out.print(" " + matrix2[j][i] + " |");
                    }
                }
            }

            System.out.print("          ");

            //prints each line of matrix3
            for(int j = 0; j < x1; j++){
                if(j == 0) {
                    if(matrix3[j][i] < 0){
                        System.out.print("|" + matrix3[j][i] + " |");
                    } else {
                        System.out.print("| " + matrix3[j][i] + " |");
                    }
                }else{
                    if(matrix3[j][i] < 0){
                        System.out.print("" + matrix3[j][i] + " |");
                    } else {
                        System.out.print(" " + matrix3[j][i] + " |");
                    }
                }
            }

            //prints the lines after each line of matrix values.
            System.out.print("\n");
            for(int k = 0; k < x1; k++){
                System.out.print("----");
            }
            System.out.print("-");
            System.out.print("          ");
            for(int k1 = 0; k1 < x1; k1++){
                System.out.print("----");
            }
            System.out.print("-");
            System.out.print("          ");
            for(int k2 = 0; k2 < x1; k2++){
                System.out.print("----");
            }
            System.out.print("-");
            System.out.print("\n");


            
        }
    }
}

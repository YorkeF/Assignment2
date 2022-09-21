import java.util.*;
/*
Write a Java program to find the second largest and smallest element in an array. You
should be able to handle both single and multidimensional arrays.
 */
public class Ferrell_Problem4 {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int length = rand.nextInt(4, 10);
        int x1 = rand.nextInt(2, 5);
        int y1 = rand.nextInt(2, 5);
        int x2 = rand.nextInt(2, 5);
        int y2 = rand.nextInt(2, 5);
        int z2 = rand.nextInt(2, 5);

        //makes a random single dimensional array
        int[] singlearr = new int[length];
        for (int i = 0; i < length; i++) {
            singlearr[i] = rand.nextInt(-100, 1000);
        }

        //makes a random 2 dimensional array.
        int[][] doublearr = new int[x1][y1];
        for (int i = 0; i < x1; i++) {
            for (int j = 0; j < y1; j++) {
                doublearr[i][j] = rand.nextInt(-100, 1000);
            }
        }

        //makes a random 3 dimensional array.
        int[][][] triplearr = new int[x2][y2][z2];
        for (int i = 0; i < x2; i++) {
            for (int j = 0; j < y2; j++) {
                for (int k = 0; k < z2; k++) {
                    triplearr[i][j][k] = rand.nextInt(-100, 1000);
                }
            }
        }

        int input = 0;

        while(input < 1 || input > 3) {
            try {
                System.out.println("What dimension array do you want to test?(1 - 3): ");
                input = scan.nextInt();
            } catch (Exception e) {
                System.out.println("Error " + e + "\nRestart Program.");
                System.exit(9);
            }

            List<Integer> list = new ArrayList<Integer>();

            switch (input) {
                case 1:
                    System.out.println("1D array chosen\nThis is your array: \n");
                    for (int i = 0; i < length; i++){
                        System.out.print("| " + singlearr[i] + " |");
                    }
                    System.out.print("\n");
                    list = smoosh(singlearr);
                    System.out.println("Your second biggest digit is " + list.get(list.size()-2));
                    System.out.println("Your second smallest digit is " + list.get(1));
                    System.out.println("Your smallest digit is " + list.get(0));
                    break;
                case 2:
                    System.out.println("2D array chosen\nThis is your array: \n");
                    for (int i = 0; i < x1; i++) {
                        for (int j = 0; j < y1; j++) {
                            System.out.print("| " + doublearr[i][j] + " |");
                        }
                        System.out.print("\n");
                    }
                    list = smoosh(doublearr);
                    System.out.println("Your second biggest digit is " + list.get(list.size()-2));
                    System.out.println("Your second smallest digit is " + list.get(1));
                    System.out.println("Your smallest digit is " + list.get(0));
                    break;
                case 3:
                    System.out.println("3D array chosen\nThis is your array: \n");
                    for (int i = 0; i < x2; i++) {
                        for (int j = 0; j < y2; j++) {
                            for (int k = 0; k < z2; k++) {
                                System.out.print("| " + triplearr[i][j][k] + " |");
                            }
                            System.out.print("\n");
                        }
                        System.out.print("\n");
                    }
                    list = smoosh(triplearr);
                    System.out.println("Your second biggest digit is " + list.get(list.size()-2));
                    System.out.println("Your second smallest digit is " + list.get(1));
                    System.out.println("Your smallest digit is " + list.get(0));
                    break;
                default:
                    System.out.println("Enter either 1, 2, or 3");
                    break;
            }
        }

    }

    public static List<Integer> smoosh(int[] array){
        int x = array.length;
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < x; i++) {
            list.add(array[i]);
        }
        //System.out.println("\nThis is your array after being SMOOSHED:\n");
        //System.out.println(list);
        return sort(list);
    }

    public static List<Integer> smoosh(int[][] array){
        int x = array.length;
        int y = array[0].length;
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                list.add(array[i][j]);
            }
        }
        //System.out.println("\nThis is your array after being SMOOSHED:\n");
        //System.out.println(list);
        return sort(list);
    }

    public static List<Integer> smoosh(int[][][] array){
        int x = array.length;
        int y = array[0].length;
        int z = array[0][0].length;
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    list.add(array[i][j][k]);
                }
            }
        }
        //System.out.println("\nThis is your array after being SMOOSHED:\n");
        //System.out.println(list);
        return sort(list);
    }

    public static List<Integer> sort(List<Integer> list){
        Collections.sort(list);
        //System.out.println("\nThis is your array after being SORTED:\n");
        //System.out.println(list);
        return list;
    }

}

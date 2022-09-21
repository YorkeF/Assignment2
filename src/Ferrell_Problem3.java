import java.util.Random;
/*
Write a program so that the numbers in the array appear in reversed order without
creating a new array.  You will need to use a temporary variable to do this.
 */
public class Ferrell_Problem3 {
    public static void main(String[] args){
        int temp;

        //making the array
        Random rand = new Random();
        int[] array = new int[rand.nextInt(5, 25)];
        for(int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(-100, 101);
        }
        System.out.println("This is array 1");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.print("\n");

        //swippity swappity
        for(int i = 0; i < (array.length / 2); i++){
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        System.out.println("This is array after swap");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}

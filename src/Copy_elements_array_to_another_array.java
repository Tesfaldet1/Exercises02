import java.sql.Array;

public class Copy_elements_array_to_another_array {
    public static void main(String[] args) {
            int [] numbers = {1,15,20};
            System.out.println("Expected output:" );
            int [] copyArray = new int[numbers.length];
            for(int i=0; i<numbers.length; i++){
                copyArray[i] = numbers[i];
            }
            copyArray[1] = 25;
            System.out.println("\n Elements from first array");
            for(int i=0; i< numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }
            // to print out memory address of a variable
            System.out.println(numbers[0] + " = " + System.identityHashCode(numbers[0]));
        System.out.println(numbers[1] + " = " + System.identityHashCode(numbers[1]));
        System.out.println(numbers[2] + " = " + System.identityHashCode(numbers[2]));
        System.out.println(copyArray[0] + " = " + System.identityHashCode(copyArray[0]));
        System.out.println(copyArray[1] + " = " + System.identityHashCode(copyArray[1]));
        System.out.println(copyArray[2] + " = " + System.identityHashCode(copyArray[2]));
            System.out.print("\n copy array below \n");
            for(int i=0; i< copyArray.length; i++) {
                System.out.print(copyArray[i] + " ");
            }
            System.out.println( );
        }

    }

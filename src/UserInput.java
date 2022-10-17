import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {


        int i;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Size of Array: ");
        int _userInput = scan.nextInt();
        int[] arr = new int[_userInput];

        System.out.print("Enter " + _userInput + " Elements for the Array: ");
        for (i = 0; i < _userInput; i++)
            arr[i] = scan.nextInt();

        System.out.println("\nReverse of Given Array is: ");
        for (i = (_userInput - 1); i >= 0; i--)
            System.out.print(arr[i] + " ");
    }
}



/*
11.Write a program that ask the user for an integer and repeat that
question until user give you a specific value that user already has been
told about as a message in your program. Store these values in an array
and print that array. After that reverse the array elements so that the
first element becomes the last element, the second element becomes
the second to last element, etc. Do not just reverse the order in which
they are printed. You need to change the way they are stored in the
array.
 */

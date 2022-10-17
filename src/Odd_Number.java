public class Odd_Number {
    public static void main(String[] args) {
        int[] _numbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Array:" );
        for (int num: _numbers){
            System.out.print(num +"\t");
        }
        System.out.println("\n Odd Array: ");
        for (int i = 1; i <= _numbers.length; i++) {
            if (i%2!=0){
                System.out.print(i + "\t");
            }
        }
    }
}
/*
7. Write a program which will set up an array to hold 10 numbers and print
out only the uneven numbers.
Expected output: Array: 1 2 4 7 9 12
Odd Array: 1 7 9
 */
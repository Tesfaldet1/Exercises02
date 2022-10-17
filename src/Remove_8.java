import java.util.Arrays;

public class Remove_8 {
    public static int  _removeDuplicateNumbers(int[] arr, int size){
        // if(array size if 0 or 1 array is already sorted)
        if (size == 0 || size == 1) {
            return size;
        }

        int j = 0;

        // check if the ith element is not equal to
        // the (i+1)th element, then add that element
        // at the jth index in the same array
        // which indicates that te particular element
        // will only be added once in the array
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }

        arr[j++] = arr[size - 1];

        return j;
    }

    public static void main(String[] args) {
        int numbers[] = { 20, 20, 40, 20, 30, 40, 50, 60, 50 };

        int size = numbers.length;
        System.out.print("The original array is: [");
        for(int num: numbers) {
            System.out.print(num + " ");
        }
        System.out.print("]");
        System.out.println();
        Arrays.sort(numbers);
        int result = _removeDuplicateNumbers(numbers, size);
        for(int i=0; i<result; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}

/*8. Write a program which will remove the duplicate elements of a given
        array [20, 20, 40, 20, 30, 40, 50, 60, 50].
        Expected output: Array: 20 20 40 20 30 40 50 60 50
        Array without duplicate values: 20 40 30 50 60

 */


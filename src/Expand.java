public class Expand {
    public static void extendedArray()
    {

        // initializing integers to array int
        int[] num = new int[] { 1, 2, 3, 4, 5, 6 };

        // allocating space for 10 integers
        int[] extendnum = new int[10];

        // adding new integers
        // at index 6,7,8,9
        extendnum[6] = 7;
        extendnum[7] = 8;
        extendnum[8] = 9;
        extendnum[9] = 10;

        // copying old array to new array
        System.arraycopy(num, 0, extendnum, 0, num.length);
        // print the elements of
        // extended array using for-each
        for (int str : extendnum)
            System.out.println(str);
    }

        public static void main(String[] args) {
            // create an instance
            Expand exarr = new Expand ();

            // extend an array and print them
            exarr.extendedArray();

    }
}
/*
9. Write a method which will add elements in an array.
        Remember that arrays are fixed in size so you need to come up with a
        solution to “expand” the array.

 */

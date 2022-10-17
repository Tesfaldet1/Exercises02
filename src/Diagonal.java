public class Diagonal {

    public static void main(String[] args) {
        int colon = 3;
        int row = 3;
        int[][] vec = new int[3][3];
        int start = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colon; j++) {
                vec[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colon; j++) {
                System.out.print(vec[i][j] + "\t ");
               /*
                if(vec[i][j] == 56){
                    System.out.println("\r");
                }
                */
            }
            System.out.println();
        }
    }
}
/*
12.Write a program which will print the diagonal elements of twodimensional array.
Expected output: 1 4 9
 */
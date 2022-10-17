public class MultiplicationTable {
    public static void main(String[] args) {
        int col = 10;
        int row = 10;
        int [][] vec = new int[10][10];
        int start = 0;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                vec[i][j] = (i+1) * (j+1);
            }
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
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

public class Vector {
    public static void main(String[] args) {
        //String [][] _values = {{"France", "Paris"}, {"Sweden", "Stockholm"}, {"England", "London"}};


        String[][] _values = new String[5][2];
        _values[0][0] = "France";
        _values[0][1] = "Paris";
        _values[1][0] = "Sweden";
        _values[1][1] = "Stockholm";
        _values[2][0] = "England";
        _values[2][1] = "London";

        for (int i = 0; i < _values.length; i++) {
            for (int j = 0; j < _values[0].length; j++) {
                System.out.print(_values[i][j] + " ");
            }
            System.out.println();


        }
    }
}
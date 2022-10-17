import java.util.Arrays;

public class Exercies02 {
    public static void main(String[] args) {
        /*
        int [] numbers = {11,23,39};
        System.out.println("Expected output:" );
        for(int i=0; i<numbers.length; i++){
            //System.out.print(numbers[i] + " ");
        }
            System.out.println( );

        sortingString();
        */
        String text = "Ok this is not as long!";
        System.out.println(trimmingString(text));
    }

    public static String trimmingString(String s){
        String newString = new String();
        newString = s.substring(11, 22);

        return newString;
    }


    public static String [] sortingString(){
        String [] array =  {"Paris", "London", "New York", "Stockholm"};
        for(String city: array){
            System.out.print(city + " ");
        }
        Arrays.sort(array);
        System.out.print(" \n The sorted cities are \n");
        for(String city: array){
            System.out.print(city + " ");
        }
        return array;
    }
}

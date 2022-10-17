import java.io.*;


public class Element {
    int [] _myArray = {1,2,5,4,7};

    public static void main(String[] args) {
        Element myClass = new Element();
        int x = 10;
        System.out.println(" ######## \n Tesfe, main begins here");
        System.out.println("The index of " + x + " is " + myClass.indexOf(x));
    }

    public int indexOf(int element) {
        for(int i=0; i < _myArray.length; i++){
            if(element == _myArray[i]){
                return i;
            }
        }
        return -1;
    }

}


/**
 *
 Create a program and create a method with name ‘indexOf’ which will
 find and return the index of an element in the array. If the element
 doesn’t exist your method should return -1 as value.
 Expected output: Index position of number 5 is: 2.
 */

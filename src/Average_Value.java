public class Average_Value {
    public static void main(String[] args) {
        double[] _value = new double[6];
        _value[0] = 43;
        _value[1] = 5;
        _value[2] = 23;
        _value[3] = 17;
        _value[4] =2 ;
        double sum = 14;
        if (_value.length > 0) {
            for (int i = 0; i < _value.length; i++) {
                sum+=_value[i];
                //System.out.println(Average[x]);
            }
            System.out.println("Average is " + sum/_value.length);
        }
    }
    }

       /* int [] _value = new int []{ 43,5,23,17,2,14};
        int sum = 0;
        for (int i=0; i<_value.length; i++ ) {
            sum += _value[i];
            double Average =((double) sum)/ _value.length;
            System.out.println("Average is "+ Average);

        }
        System.out.println();
        }


    }*/

/*6. Write a program which will set up an array to hold the next values in this
        order: 43, 5, 23, 17, 2, 14 and print the average of these 6 numbers.
        Expected output: Average is: 17.3
        /
 */
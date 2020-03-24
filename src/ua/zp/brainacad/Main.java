package ua.zp.brainacad;

import java.util.Arrays;

/**
 * This is prototype for Lab 4.
 */
class Lab4Test {

    public static void main(String[] args) {

        // PART 1
        // 1.1)
        float[] firstArray = new float[4]; // TODO init it's array by new with size 4.
        firstArray [0] = 1.2F;
        firstArray [3] = 7.56F;
        // TODO insert some value to start of array and to end of array.

        int[] intArray = {1, 2, 5, 9, 8, 3, 4, 2, 1}; // TODO init and fill it's array with any values. Use {} syntax.

        // 1.2)
        int[] intArrayCopy; // TODO copy "intArray". Use copyOf...
        intArrayCopy = Arrays.copyOf(intArray,8);

        // 1.3)
        // TODO sort "intArrayCopy", use Arrays sort.
        Arrays.sort(intArrayCopy);

        // 1.4)
        // TODO print "intArrayCopy", use Arrays toString.
        System.out.println(Arrays.toString(intArrayCopy));


        // 1.5)
        // TODO compare "intArray"  and "intArrayCopy", use Arrays equals. Print "Arrays equals" or "Arrays not equals".
        boolean compare = Arrays.equals(intArray,intArrayCopy);
        if (compare == true) {
            System.out.println("Arrays equals");
        } else {
            System.out.println("Arrays not equals");
        }


        // PART 2
        //int[] testArray = {1, 3, 5, 7, 8, 6, 4, 2, 0};

        // Print array values in cycle.
        //for (int value: testArray) {
           // System.out.print(value + " ");
       // }

        // 2.1)
        // TODO calc sum of all array elements and print result.
        int[] testArray = {1, 3, 5, 7, 8, 6, 4, 2, 0};
        int s=0;
        for (int i: testArray) {s=s+i;
        }
        System.out.println("сумма всех чисел массива=" +s);
        // 2.2)
        // TODO calc sum of all numbers with odd indexes and print result.
        int sn=0;
        for (int i: testArray) {
            if (i % 2 != 0) {
                sn = sn + i;
            }
        }
        System.out.println("сумма всех чисел массива c нечетными индексами =" +sn);

        // 2.3)
        // TODO find max value in array.
        int max =0;
        for (int i : testArray) {
            if (testArray[i] > max) {max=testArray[i];
            }continue;
        }
        System.out.println("Максимальное значение массива=" +max);

        // PART 3

        //3.1
        // TODO create two-dimensional array with size [3][4]
        int[][]twoArray = new int[3][4];

        //3.2
        // TODO fill array with any numbers in cycles.
        twoArray[0][0]=1;
        twoArray[0][1]=2;
        twoArray[0][2]=3;
        twoArray[0][3]=4;
        twoArray[1][0]=1;
        twoArray[2][0]=2;
        //3.3
        // TODO calc sum of all array elements and print result.

        // PART 4*

        long[][] matrix = new long[9][9];

        int ratio = 0;
        for (long[] row: matrix ) {
            Arrays.fill(row, ++ratio);
        }

        int sum = 0;
        // TODO* calc sum only max and min values of matrix by expression: 2 < i <= 5 and only every third j value.
        System.out.println(sum);

    }


}
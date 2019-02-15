package exercise3algorithms;

import java.util.Random;

public class Exercise3Algorithms {

    public static void main(String[] args) {
        // Beacuse of the chosen Sentinel the array
        // should contain values smaller than Integer.MAX_VALUE .
        Double size1 = Math.pow(10, 1);
        Double size2 = Math.pow(10, 3);
        Double size3 = Math.pow(10, 5);
        Double size4 = Math.pow(10, 7);

        System.out.println(size1);

        BottomUpMergeSort m = new BottomUpMergeSort();
        Exercise3Algorithms e = new Exercise3Algorithms();
        QuickSort q = new QuickSort();

        int[] array1 = new int[size1.intValue()];
        int[] array2 = new int[size2.intValue()];
        int[] array3 = new int[size3.intValue()];
        int[] array4 = new int[size4.intValue()];
        //int[] rndArray1 = e.getRandomArray(array1.length, array1);
        //int[] rndArray2 = e.getRandomArray(array2.length, array2);
        //int[] rndArray3 = e.getRandomArray(array3.length, array3);
        int[] rndArray2 = e.getRandomArray(array2.length, array2);

        /*for (int i = 0; i < rndArray2.length; i++) {
            System.out.println(rndArray2[i]);
        }*/
        q.sort(rndArray2, 0 , rndArray2.length-1);
        for (int i = 0; i < rndArray2.length; i++) {
            System.out.println(rndArray2[i]);
        }

 /*q.sort(array, 0, array.length-1);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }*/
    }

    public int[] getRandomArray(int length, int[] arr) {
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            int rnd = rand.nextInt(length) + 1;
            boolean isDuplicate = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == rnd) {
                    isDuplicate = true;
                }
            }
            if (isDuplicate == true) {
                i--;
            }
            if (isDuplicate == false) {
                //System.out.println("no duplicates!");
                //System.out.println("rnd is: " + rnd);
                arr[i] = rnd;
            }
        }
        return arr;
    }

}

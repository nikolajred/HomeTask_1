package com.nix;

public class SortedArray {
    static int[] bubbles = {18, 6, 36, 99, -11, 0, 5, 6, 78};

    public int[] sortBubbles(int[] array) {
        int someNumber = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] <= array[j]) {
                    someNumber = array[i];
                    array[i] = array[j];
                    array[j] = someNumber;
                }

            }

        }
        for (int i : array) {
            System.out.print(i + ", ");

        }
        return array;
    }

    public static void main(String[] args) throws Exception{
        SortedArray sortedArray = new SortedArray();
        sortedArray.sortBubbles(bubbles);
    }
}

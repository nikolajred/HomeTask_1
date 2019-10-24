package com.nix;

public class MinMaxOfArray {
     public static int [] numbers = {2, 5, 9, 15, 3, 14, -6, 0, 8, 11};

    public  int searchMin(int[]array){
        int min = array[0];
        for (int i = 1; i <array.length ; i++) {
            if(min>=array[i]){
                min = array[i];
            }
        }
        System.out.println("Min member of array equals: " + min);
        return min;
    }
    public  int searchMax(int[]array){
        int max = array[0];
        for (int i = 1; i <array.length ; i++) {
            if(max<=array[i]){
                max = array[i];
            }
        }
        System.out.println("Max member of array equals: " + max);
        return max;
    }

    public static void main(String[] args) throws Exception{
        MinMaxOfArray minMaxOfArray = new MinMaxOfArray();
        minMaxOfArray.searchMin(numbers);
        minMaxOfArray.searchMax(numbers);

    }


}

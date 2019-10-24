package com.nix;

public class MultipleArray {
    static int[] someArray = {5, 6, 12, 24, 50, 22, 28, 3, 45};
    static int[] modifiedArray;


    public int[] searchMultiplicityMembersOfArray(int[] array,int numberOfMultiplicityK ) {

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % numberOfMultiplicityK == 0) {
                count++;
            }
            modifiedArray = new int[count];
            int k = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] % numberOfMultiplicityK == 0 && k < modifiedArray.length) {
                    modifiedArray[k] = array[j];
                    k++;
                }
            }

        }
        System.out.println("The number of array elements that is a multiple of the input number equals: " + count);
        System.out.print("The array elements are the following: ");
        for (int i = 0; i < modifiedArray.length; i++) {
            System.out.print(modifiedArray[i]+ ", ");
        }
        return modifiedArray;

    }

    public static void main(String[] args) throws Exception{
        MultipleArray multipleArray = new MultipleArray();
        multipleArray.searchMultiplicityMembersOfArray(someArray, 5);
    }

}

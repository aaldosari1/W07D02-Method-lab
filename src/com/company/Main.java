package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Integer [] NumArr={20,100,10,80,70,1,0,-1,2,10,15,300,7,6,2,18,19,21,9,0}; //https://stackoverflow.com/questions/18296766/explicitly-setting-null-value-to-an-array-element

        System.out.print("Orignal array: ");
        for (int i = 0; i < NumArr.length; i++) {

            System.out.print(NumArr[i]+", ");
        }
        System.out.println();
        removeDuplicates(NumArr);
    }

    public static void removeDuplicates(Integer[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    for (int k = j; k < arr.length; k++) { 
                       if (k<arr.length-1 )
                        arr[k] = arr[k + 1];
                        if (k==arr.length-1 )
                            arr[k] = null;
                   }
                }

            }
        }
        System.out.print("After removing duplicates: ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                System.out.print(arr[i]+", ");
            }

        }
    }
}

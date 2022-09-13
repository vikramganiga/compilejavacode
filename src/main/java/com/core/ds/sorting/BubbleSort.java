package com.core.ds.sorting;

/**
 * Bubble sort is pick up the element and compare with next element based on result sort it 
 * 
 * It is stable sort algorithms
 * 
 * It is quadratic - O(n^2)
 * 
 */
public class BubbleSort {
    
    public static void main(String[] args) {
        int array[] = {10,31,11,-1,23,45};

        System.out.println("before bubble sort");
       
        for(int i=0; i < array.length; i++){
            System.out.println(" "+array[i]);
        }

        for(int i = array.length-1; i >= 0; i--){
            for(int j=0; j < i; j++){

                if(array[i] < array[j]){
                    int temp= array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        System.out.println("after bubble sort");
        for(int i=0; i < array.length;i++){
            System.out.println(" "+array[i]);
        }   
     }
}

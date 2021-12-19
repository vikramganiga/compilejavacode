package com.perfview.techservice.ds.sorting;

/**
 * Sorting start from left to right, by placing comparing one by one, replacing sorted one.
 * stable sort
 * O(n^2) time complexity - quadratic 
 */

public class insertionsort {
    public static void main(String args[]){
               
        int array[] = {10,-2,2,34,31,-1,55};
        
        System.out.println("before insertion sort");
       
        for(int i=0; i < array.length; i++){
            System.out.println(" "+array[i]);
        }

        for(int i = 1; i < array.length;i++){
            int cmp = array[i];
            int j;
            for(j=i; j > 0 &&  array[j-1] > cmp ;j--){
                    array[j]=array[j-1];                
            }  
            array[j] = cmp;

        }

        System.out.println("after insertion sort");
       
        for(int i=0; i < array.length; i++){
            System.out.println(" "+array[i]);
        }
    }
}
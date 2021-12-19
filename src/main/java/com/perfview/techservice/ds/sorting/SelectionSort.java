package com.perfview.techservice.ds.sorting;

/**
 * selection sort is pick up the element and compare with all elements once based on result sort it 
 * 
 * It is stable sort algorithms
 * 
 * It is quadratic - O(n^2)
 * 
 */
public class SelectionSort {
    
    public static void main(String args[]){
        int array[] = {23,42,21,33,11,22};

        System.out.println(" before sort ");
        for(int i=0;i < array.length;i++){
            System.out.print(" "+array[i]);
        }

        for(int i = array.length-1; i >=0; i--){
            int j=i;
            for (int p=0; p < i ; p++){
                if(array[j] < array[p]){
                    j=p;
                }
            }
            if(j != i){
                int temp = array[j];
                array[j]= array[i];
                array[i]=temp;
            }
        }

        System.out.println("\n after sort ");
        for(int i=0;i < array.length;i++){
            System.out.print(" "+array[i]);
        }

    }
}

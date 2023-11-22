package com.core.ds.javaprime;

public class DistanctArray {
    public static void main(String[] args) {
        int arr[] = {2,10,20, 2, 30,4,0,1};
        boolean flag=true;

        for(int i =0;i < arr.length; i++)
            for( int j=0;  j < arr.length; j++)
                {
                    if( i == j)
                        continue;

                    if(arr[i] ==  arr[j]){
                        flag=false;
                        break;
                    }
                }
        System.out.println("is distanct array"+flag);
    }
}

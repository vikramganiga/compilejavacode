package com.core.ds.javaprime;

public class CloneInt {
    
    int A[] = {10,12,23,34};
    int B[] = A;

    public static void main(String[] args) {
        CloneInt cloneInt = new CloneInt();
        System.out.println(" "+ cloneInt.B[3]);
        System.out.println(" "+cloneInt.A[0]);
    }
}

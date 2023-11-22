package com.core.ds.javaprime;

import java.util.Collections;
import java.util.Random;

public class ShuffleArray {

    public void shuffle() {

        int intList[] = { 1, 2, 3, 4, 5 };
        Random random = new Random();

        for (int i =  intList.length-1; i >= 0; i--) {

            int index = random.nextInt(i+1);
            System.out.println(" index "+ i + " "+index);
            int temp = intList[index];
            intList[index] = intList[i];
            intList[i] = temp;
        }

        for (int i =0; i < intList.length; i++) {
            System.out.println(intList[i]);
        }

        //Collections.shuffle(null);
    }

    public static void main(String[] args) {
        ShuffleArray shuffleArray = new ShuffleArray();
        shuffleArray.shuffle();
    }

}

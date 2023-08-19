package com.core.hackerank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDiff(List<List<Integer>> arr) {
        // Write your code here
        int leftRightDiagonalResult = 0;
        int rightLeftDiagonalResult = 0;

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                // left to right diagonal
                if (i == j) {
                    System.out.println(" " + arr.get(i).get(j));
                    leftRightDiagonalResult += arr.get(i).get(j);
                }

            }
        }
        System.out.println("Left to Right Diagonal " + leftRightDiagonalResult);

        for (int i = 0, j = arr.get(i).size() - 1; i < arr.size() && j >= 0; j--, i++) {
            // left to right diagonal

            System.out.println(" " + arr.get(i).get(j));
            rightLeftDiagonalResult += arr.get(i).get(j);

        }

        System.out.println("Right to Left Diagonal " + rightLeftDiagonalResult);
        return leftRightDiagonalResult - rightLeftDiagonalResult;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        int result = diagonalDiff(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

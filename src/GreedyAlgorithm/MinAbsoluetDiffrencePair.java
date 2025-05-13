package GreedyAlgorithm;

import java.util.Arrays;

public class MinAbsoluetDiffrencePair {
    public static void main(String[] args) {
        int[] A = {1,4,7};
        int[] B = {2,3,1};

        //1) Sort both the arrays
        Arrays.sort(A);
        Arrays.sort(B);

        //2) Take the abs diff of each indices

        int minDiff = 0;
        for(int i = 0; i< A.length; i++){
            int res = Math.abs(A[i]- B[i]);
            minDiff += res;
        }
        System.out.println("The min Absolute diffrence is : "+minDiff);
    }
}

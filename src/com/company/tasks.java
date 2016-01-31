package com.company;

import org.junit.Assert;
import org.junit.Test;

public class tasks {

    public static void main(String[] args) {
          int[] B = {1, 2, 3, 5};
        //int[] B = {3, 1, 2, 4, 3};
        //int[] B = {-1000, 1000};
        //System.out.print(solutionDifference(B));
        System.out.print(solutionFrog(10, 200, 30));
        //System.out.print(solutionMissing(B));



        //int[] A = {1, 1, 4, 5, 3, 2};
        //int[] A = {1,2,5,2,3,1,3,4};
        int[] A = {1, 4, 2, 5, 3};
        //int[] A = {1, 1};
        int X = 5;
        //System.out.print(solutionFrogRiver(A, X));
        System.out.print(solutionPermutation(A));
    }

    public static int solutionDifference(int[] B) {
        int sum1 = B[0];
        int sum2 = 0;

        for (int i = 1; i < B.length; i++) {
            sum2 = sum2+B[i];
        }

        int minDif = Math.abs(B[0] - sum2);

        for (int j = 1; j < B.length - 1; j++) {
            sum1 = sum1 + B[j];
            sum2 = sum2 - B[j];
            int dif = Math.abs(sum1 - sum2);
            minDif = (dif < minDif) ? dif : minDif;
        }
        return minDif;
    }

    public static int solutionFrog(int x, int y, int d) {
        return (int)Math.ceil(((double)y - x)/d);
    }

    public static int solutionMissing(int[] A) {
        long sumaElementiv = 0;
        for (int i = 0; i < A.length; i++) {
            sumaElementiv = sumaElementiv + A[i];
        }
        long aLast = A.length + 1;
        long sumaProgresii = aLast*(1+aLast)/2;
        return (int)sumaProgresii - (int)sumaElementiv;
    }


    public static int solutionFrogRiver(int[] A, int X) {
        int[] B = new int[X];

        for (int s = 0; s < X; s++) {
            B[s] = -1;
        }

        int j = 0;
        int i;
        for ( i = 0; i < A.length; i++) {
            if (B[A[i] - 1] == -1) {
                j++;
                B[A[i] - 1] = i;
                if (j == B.length) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static int solutionPermutation(int[] A) {
        int[] B = new int[A.length];
        for (int s = 0; s < A.length; s++) {
            B[s] = -1;
        }

        int j = 0;
        int i;

        for (i = 0; i < A.length; i++) {
            if (B[A[i] - 1] == -1) {
                j++;
                B[A[i] - 1] = A[i];
                if (j == B.length) {
                    return 1;
                }
            }
        }
        return 0;
    }
}



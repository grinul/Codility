package com.company;

import org.junit.Assert;

public class tasks {
	public static void main(String[] args) {

		int X = 1;
		int[] A = {3, 2, 4, 6, 8};
		int[] result = solutionCyclicRotation(A, X);
		int[] ex = {8, 3, 2, 4, 6};
		Assert.assertArrayEquals(result, ex);
		for(int x : result){
			System.out.print(x + ", ");
		}

	}
	public static int[] solutionCyclicRotation(int[] A, int K) {
		int[] B = new int[A.length];
		for (int i = 0; i <= A.length-1; i++) {
			B[(K+i)%A.length] = A[i];
		}
		return B;
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
	public static int solutionFrogJump(int x, int y, int d) {
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
	public static int[] solutionCyclicRotation2(int[] A, int K) {
		if (A.length == 0) {
			return A;
		} else
		for (int i = 0; i <= K-1; i++) {
			int last = A[A.length - 1];
			for (int j = A.length-1; j >= 1; j--) {
				A[j] = A[j-1];
			}
			A[0] = last;
		}
		return A;
	}
}




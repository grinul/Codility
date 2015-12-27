package com.company;

public class Lesson2 {
	public static void main(String[] args) {
		//int[] A = {1, 1, 4, 5, 3, 2};
		//int[] A = {1,2,5,2,3,1,3,4};
		int[] A = {1, 4, 2, 5, 3};
		//int[] A = {1, 1};
		int X = 5;
		//System.out.print(solutionFrogRiver(A, X));
		System.out.print(solutionPermutation(A));

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


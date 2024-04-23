package com.bank.leetcode.array2;
/*  Given an image represented by an NxN matrix, where each pixel in the image is 4
bytes, write a method to rotate the image by 90 degrees. Can you do this in place?

  SOLUTION
  Because we're rotating the matrix by 90 degrees,
  the easiest way to do this is to implement the rotation in layers.
  We perform a circular rotation on each layer,
  moving the top edge to the right edge,
  the right edge to the bottom edge,
  the bottom edge to the left edge,
  and the left edge to the top edge*/
public class RotateMatrix {

    // This algorithm is O (N2),
    // which is the best we can do
    // since any algorithm must touch all N 2 elements.
    boolean rotate(int[][] matrix){
        if (matrix.length == 0 || matrix.length != matrix.length) return false;
        int n = matrix.length;
        for (int layer = 0; layer < n / 2; layer++){
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; i++){
                int offset = i - first;
                // to save top
                int top = matrix[first][i];

                // to left -> top
                matrix[first][i] = matrix[last - offset][first];

                // to bottom -> left
                matrix[last - offset][first] = matrix[last][last - offset];

                // right -> bottom
                matrix[last][last - offset] = matrix[i][last];

                // top -> right
                matrix[i][last] = top; // right<- saved top
            }
        }
        return true;
    }
}

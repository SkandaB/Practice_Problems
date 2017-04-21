/*
https://www.hackerrank.com/challenges/2d-array
Context 
Given a 6X6  2D Array, A:

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
We define an hourglass in A to be a subset of values with indices falling in this pattern in A's graphical representation:

a b c
  d
e f g

There are 16 hourglasses in A, and an hourglass sum is the sum of an hourglass' values.

Input Format

There are 6 lines of input, where each line contains 6 space-separated integers describing 2D Array A; every value in A will be in the inclusive range of -9 to 9.

Sample Input

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
Sample Output

19
Explanation

A contains the following hourglasses:

1 1 1   1 1 0   1 0 0   0 0 0
  1       0       0       0
1 1 1   1 1 0   1 0 0   0 0 0

0 1 0   1 0 0   0 0 0   0 0 0
  1       1       0       0
0 0 2   0 2 4   2 4 4   4 4 0

1 1 1   1 1 0   1 0 0   0 0 0
  0       2       4       4
0 0 0   0 0 2   0 2 0   2 0 0

0 0 2   0 2 4   2 4 4   4 4 0
  0       0       2       0
0 0 1   0 1 2   1 2 4   2 4 0
The hourglass with the maximum sum (19) is:

2 4 4
  2
1 2 4

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Array_hourGlass_MaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        
        int max_sum=Integer.MIN_VALUE;                              // Final result will be in this variable
        for(int arr_i=0; arr_i <= 3; arr_i++) {
            for(int arr_j=0; arr_j <=3; arr_j++) {
                int curr_sum = hour_sum(arr,arr_i,arr_j);           // Get sum of current hour_glass
                max_sum = (curr_sum>max_sum) ? curr_sum : max_sum;  // Update max_sum if this new sum is larger
            }
        }
        System.out.println(max_sum);                                // Output the final result
    }
    
    // Funtion will calculate the sum for hourglass for a 3x3 2D array
    private static int hour_sum(int array2d[][],int row_i, int col_j) {
        int sum=0;
        for(int row=row_i; row<=row_i+2; row++) {
            for(int col=col_j;col<=col_j+2;col++) {
            if(row==(row_i + row_i +2)/2 && col!=col_j+1)   continue;   // Skip the outer-elements in 2nd row
            else sum+= array2d[row][col];
            }
        }
        return sum;    
    }
}

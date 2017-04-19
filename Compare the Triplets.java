/*
Compare the Triplets 
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int Alice[] = {a0, a1, a2};
        int Bob[] = {b0, b1, b2};
        int Score[] = {0,0};

        for(int i=0; i<3; i++){
            if(Alice[i] == Bob[i])
                continue;
           int dummy = Alice[i]>Bob[i] ? Score[0]++ : Score[1]++;
        }

        System.out.println(Score[0]+" "+Score[1]);
    }
}
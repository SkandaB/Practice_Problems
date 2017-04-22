import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayRotateLeft {
    
    private static void rotateLeft(int[] input_array) {
        int first = input_array[0];
        for(int i=1;i<input_array.length; i ++) input_array[i-1] = input_array[i];
        input_array[input_array.length-1] = first;
        //System.out.println(Arrays.toString(input_array));
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int numOfIntegers = sc.nextInt();
        int rotations = sc.nextInt();
        
        int[] entered_array = new int[numOfIntegers];
        for(int i=0; i < numOfIntegers; i ++)
            entered_array[i] = sc.nextInt();
        
        while(rotations!=0) {
            rotateLeft(entered_array);
            rotations--;
        }
        System.out.println(Arrays.toString(entered_array).replaceAll("[\\[,\\],\\,]",""));
    }
}

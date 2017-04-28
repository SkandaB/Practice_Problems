import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AlgorithmicCrush {

    public static void main(String[] args) {
                                                            // The idea is to realize that straight-forward
        Scanner sc = new Scanner(System.in);                // algorithm will run in O(m*n) time
        int array_size = sc.nextInt();                      // This will be 10^7 * 10^5 time in worst case
        if(array_size <3 || array_size > Math.pow(10,7))
            System.exit(0);
        
        int[] array_n = new int[array_size+2];              // Here we will use pre-fix sum, difference arrays
        int m_counter = sc.nextInt();                       // This will help us achieve a program with 
        if(m_counter > Math.pow(2*10,5))                    // O(m+n) runtime. i.e. O(10^7) in worst case
            System.exit(0);
        
        while(m_counter>0) {                                // For each of the  queries, check a,b,k constraints
            int a,b,k;                                      // Do not update all a-b indexes with k
            a = sc.nextInt();                               // Instead make only two changes in the difference array
            b = sc.nextInt();                               // This ensures we record only the ascend and descend of
            k = sc.nextInt();                               // k within the a-b range
            if(a>array_size || b>array_size) continue;
            if(k>Math.pow(10,9)) continue;
            array_n[a]+=k;                                  // Add 'k' to DifferenceArray[a] to denote ascend
            array_n[b+1]-=k;                                // Substract 'k' from DiffArray[b+1] to denote descend
            m_counter--;                                    // Max number of operations here O(M)
        }
        
        long max_number = Integer.MIN_VALUE;
        long curr_counter = 0;
        for(int curr_elem:array_n) {                        // Traverse thru the difference array only once
            curr_counter+=curr_elem;                        // Keep a running counter and add/substract the k value
            if(curr_counter>max_number)                     // Compare max value to current value, and update 
                max_number = curr_counter;                  // Max number of operations here O(N)
        }
        
        System.out.println(max_number);
    }
}

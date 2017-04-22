import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DynamicArray_HackerRank {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int num_of_seq = sc.nextInt();
        int queries = sc.nextInt();
        int lastAns = 0;
        
        List<List> seqList = new ArrayList<>(num_of_seq);
        for(int i=0; i<num_of_seq; i++) seqList.add(new ArrayList<Integer>());
        
        while(queries!=0) {
            int q = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            List<Integer> sequence = seqList.get((x^lastAns)%num_of_seq);
            
            switch(q) {
                case(1):
                    sequence.add(y);
                    break;
                case(2):
                    lastAns = sequence.get(y%sequence.size());
                    System.out.println(lastAns);
                break;
            }
            queries--;
        }
        
    }     
}

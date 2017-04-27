import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SparseArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_strings = sc.nextInt();
        HashMap<String,Integer> str_count = new HashMap<>();
        sc.nextLine();
        while(num_of_strings>0) {
            String curr = sc.nextLine().trim();
            if(str_count.containsKey(curr)) {
                str_count.put(curr, str_count.get(curr) + 1);
            }
            else
               str_count.put(curr,1);
            num_of_strings--;
        }
        
        int queries = sc.nextInt();
        sc.nextLine();
        while(queries>0) {
            String search_str = sc.nextLine().trim();
            if(str_count.containsKey(search_str))
                System.out.println(str_count.get(search_str));
            else
                System.out.println("0");
            queries--;
        }
    }
}

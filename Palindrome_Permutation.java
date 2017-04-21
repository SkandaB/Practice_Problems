/* https://www.hackerearth.com/problem/algorithm/palindrome-check-2-1/
Q: A String is called Palindrome if it reads the same backwards as well as forwards. For example, the String aba can be read the same backwards as well as forwards. 
Now, a Permutation of a String S is some String K where S and K contain the same set of characters, however, these characters need not necessarily have the same positions. 

Now, given a String  S consisting of lowercase English alphabets, you need to find out whether any permutation of this given String is a Palindrome. If yes, print "YES" (Without quotes) else, print "NO" without quotes.

Input Format:
The first and only line of input contains the String S.

Output Format:
Print the required answer on a single line
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
 
//import for Scanner and other utility  classes
import java.util.*;
 
 
class TestClass {
    public static void main(String args[] ) throws Exception {

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        
        char[] chars = line.toCharArray();
        HashSet char_set = new HashSet();
        
        for(char current_char: chars) {
            if(char_set.contains(current_char))
                char_set.remove(current_char);
            else char_set.add(current_char);
        }
        
        if(char_set.size()<=1) System.out.println("YES");
        else System.out.println("NO");
    }
}

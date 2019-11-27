/*
Given a string that contains a single pair of parenthesis,
compute recursively a new string made of only of the parenthesis and their contents, 
so "xyz(abc)123" yields "(abc)".


parenBit("xyz(abc)123") → "(abc)"
parenBit("x(hello)") → "(hello)"
parenBit("(xy)1") → "(xy)"

*/

public String parenBit(String str) {

        // Base Case
        // Check for "(" at the start, and ")" at the end
        // If so, EVERYTHING inside this is required, so return it
        if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')')
            return str;

        // Recursive case (it calls itself, duh!)
        // If start is "(", but end is NOT ")"
        // then chop off last character, and repeat
        if (str.charAt(0) == '(')
            return parenBit(str.substring(0, str.length() - 1));

        // Recursive case (it calls itself, duh!)
        // If end is ")", but start is NOT "("
        // then chop off first character, and repeat
        if (str.charAt(str.length() - 1) == ')')
            return parenBit(str.substring(1));

        // Recursive case (it calls itself, duh!)
        // If start is NOT "(", and end is NOT ")"
        // then chop off both, first and last character, and repeat
        return parenBit(str.substring(1, str.length() - 1));
    }


/*
Solution from quetion website
public String parenBit(String str) {
  if (str.charAt(0) != '(') {
    return parenBit(str.substring(1));
  }
  if (str.charAt(str.length()-1) != ')') {
    return parenBit(str.substring(0, str.length()-1));
  }
  return str;
  
  // Solution notes: this is tricky. Is the first char a '('?
  // If not, recur, removing one char from the left of the string.
  // Eventually this gets us to '(' at the start of the string.
  // If the first char is '(', then recur similarly, removing one char from
  // the end of the string, until it is ')'.
  // Now the first and last chars are ( .. ) and you're done.
}
*/

public class Atoi_String_to_Integer {
    public int myAtoi(String str) {
        if(str.length()==0) return 0;
        long result = 0;
        int curr_char = 0;
        int sign = 1;
        str = str.trim();
        if(str.charAt(curr_char)=='+') curr_char++;
        else if(str.charAt(curr_char)=='-') {
            sign = -1;
            curr_char++;
        }
        while(curr_char < str.length()) {
            int digit = str.charAt(curr_char)-'0';
            if(digit < 0 || digit > 9)
                break;
            if(sign==1) {
                result = result*10 + digit;
            }
            else if(sign==-1) 
                result = result*10 - digit;
            
            if(result > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            else if(result < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
                
            curr_char++;
        }
        return (int)result;
    }
}

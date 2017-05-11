public class ReverseInteger {
    public int reverse(int x) {
        return (x<0) ? -(reverse_helper(Math.abs(x))) : reverse_helper(x);
    }
    
    private static int reverse_helper(int num) {
        long result = 0;
        while(num!=0) {
            result = result*10 + num%10;
            num = num/10;
            if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
                return 0;
        }
        return (int)result;
    }
}

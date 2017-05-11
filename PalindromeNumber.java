public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        
		if(x<0) return false;
        if(x<9) return true;
        
        return ((reverse(x))==x);
    }
    
    private static int reverse(int num){
        int result=0;
        while(num!=0){
            result = result*10 + num%10;
            num = num/10;
        }
        return result;
    }
}

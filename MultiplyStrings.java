public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        
        if(num1.equals(""+0) || num2.equals(""+0)) return "0";
        
        // The number of digits in product of 2 integers = sum of digits in both
        int[] product_result = new int[num1.length()+num2.length()]; 
        
        // Emulate classic multiplication method
        for(int outer=num1.length()-1; outer>=0 ;outer--) {
            for(int inner=num2.length()-1;inner>=0;inner--) {
                int temp = (num1.charAt(outer)-'0') * (num2.charAt(inner)-'0');
                carrySum(product_result, 1+outer+inner,temp%10);
                carrySum(product_result,outer+inner,temp/10);
            }
        }
        
        // Convert int array to output string
        StringBuilder res_sb = new StringBuilder();
        for(int build : product_result){
            res_sb.append(build);
        }
        if(product_result[0]==0) res_sb.deleteCharAt(0);
        return res_sb.toString();
        
    }
    
    // Method to perform sum with carry
    private static void carrySum(int[] temp_arr, int seed, int sum_this) {
        int temp_sum = temp_arr[seed] + sum_this;
        if(temp_sum<=9) {
            temp_arr[seed] = temp_sum;
            return;
        }
        else{
            temp_arr[seed] = temp_sum%10;
            carrySum(temp_arr, seed-1, temp_sum/10);
        }
    }
}

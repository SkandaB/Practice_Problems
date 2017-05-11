public class TwoSum_II {
    public int[] twoSum(int[] numbers, int sum) {
        int left = 0, right = numbers.length-1;
        while(left < right) {
            if(numbers[left] + numbers[right] == sum)
                return (new int[] {left+1,right+1});
            else if(numbers[left] + numbers[right] < sum)
                left++;
            else
                right--;
        }
        return new int[] {-1,-1};
    }
}

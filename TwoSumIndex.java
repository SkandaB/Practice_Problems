public class TwoSumIndex {
    public int[] twoSum(int[] nums, int sum) {
        Map<Integer,Integer> hs_map = new HashMap<Integer,Integer>();
        for(int nums_i = 0; nums_i < nums.length; nums_i++) {
            if(hs_map.containsKey(nums[nums_i]))
                return (new int[] {hs_map.get(nums[nums_i]),nums_i} );
            else {
                hs_map.put(sum-nums[nums_i],nums_i);
            }
        }
        return (new int[] {-1,-1} );
    }
}

/*
  Without Additional Space
  O(N^2) Time Complexity
*/

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result_list = new ArrayList<>();             
        Arrays.sort(nums);                                          
        for(int current=0; current<nums.length-2; current++) {
            if (current>0 && nums[current]==nums[current-1]) continue;
            for(int left=current+1, right=nums.length-1;left<right;) {
                if (nums[left]+nums[right]==-nums[current]) {
                    result_list.add(Arrays.asList(nums[current],nums[left],nums[right]));
		            left++; right--;
		            while (left<right && nums[left]==nums[left-1]) left++;
		            while (left<right && nums[right]==nums[right+1]) right--;
                    } else 
                    if (nums[left] + nums[right]> -nums[current])
                            right--;
                    else 
                        left++;
                    }
            }
            return result_list;
        }
    }

public class Solution {
    // Works on the idea of overwriting the repeated number with the next number in array
    public int removeDuplicates(int[] nums) {
    if (nums.length==0) return 0;           // If array length is 0, return 0;
    int j=0;                                // Initialize second pointer, j is always less than i
    for (int i=0; i<nums.length; i++)       // Iterate i thru the length of the loop
        if (nums[i]!=nums[j])               // If two numbers are same, then move to next position
            nums[++j]=nums[i];              // Else, overwrite the current duplicate number with next different number   
    return ++j;                             // Return the position where original numbers conclude after shifting
    }
}

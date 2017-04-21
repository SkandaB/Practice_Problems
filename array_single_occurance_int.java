/*
https://codelab.interviewbit.com/problems/single/
Given an array of integers, every element appears twice except for one. Find that single one.

Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
*/

public class Solution {
	// DO NOT MODIFY THE LIST
	public int singleNumber(final List<Integer> a) {
	    int result = 0;
	    for(Integer int_elem : a) {
	        result ^= int_elem;
	    }
	    return result;
	}
}

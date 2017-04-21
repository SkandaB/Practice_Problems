/*
https://codelab.interviewbit.com/problems/gcd/
Given 2 non negative integers m and n, find gcd(m, n)

GCD of 2 integers m and n is defined as the greatest integer g such that g is a divisor of both m and n.
Both m and n fit in a 32 bit signed integer.
*/
public class Solution {
	public int gcd(int a, int b) {
	   // System.out.println(a+ " " +b);
	  /*  
	   if(a < b) {
	      // System.out.println("Swapping two numbers");
	       int temp = a;
	       a = b;
	       b = temp;
	   }
	   */
	    while(b > 0) {
	        //System.out.println("a is now: "+a +"b is now:"+ b);
	        int temp = b;
	        b = a % b;
	        a = temp;
	    }
	    return a;
	    }
	}
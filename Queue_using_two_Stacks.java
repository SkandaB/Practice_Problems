/*
Queue using Two Stacks

A basic queue has the following operations:

Enqueue: add a new element to the end of the queue.
Dequeue: remove the element from the front of the queue and return it.
In this challenge, you must first implement a queue using two stacks. Then process  queries, where each query is one of the following  types:

1 x: Enqueue element  into the end of the queue.
2: Dequeue the element at the front of the queue.
3: Print the element at the front of the queue.
Input Format

The first line contains a single integer, , denoting the number of queries. 
Each line  of the  subsequent lines contains a single query in the form described in the problem statement above. All three queries start with an integer denoting the query , but only query  is followed by an additional space-separated value, , denoting the value to be enqueued.

Constraints

It is guaranteed that a valid answer always exists for each query of type .
Output Format

For each query of type , print the value of the element at the front of the queue on a new line.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   My_Queue que;
   public Solution(int q_size) {
       this.que = new My_Queue(q_size);
   }
    private class Stack {
        int size, top;
        int[] stack_data;
        
        public Stack(int size) {
            top = 0;
            this.size = size;
            this.stack_data = new int[size];
        }
        
        void push(int element) {
            try {
                if(top==size-1) 
                    throw new Exception("stack_full");
                else
                    stack_data[top++] = element;
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
        
        boolean is_Empty() {
            return top==0;
        }
        
        int pop() {
            try {
                if(is_Empty())
                    throw new Exception("Stack_empty");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            int data = stack_data[top-1];
            top--;
            return data;
        }
    }
    
    private class My_Queue {
        Stack s1, s2;
        public My_Queue(int size) {
            s1 = new Stack(size);
            s2 = new Stack(size);
        }       
      
    void Enque(int element) {
            s1.push(element);
        }
        
        int Deque() {
            if(!(s2.is_Empty())) return s2.pop();
            else {
                while(!(s1.is_Empty())) s2.push(s1.pop());
            }
            return s2.pop();
        }
        int getFront(){
            if(!(s2.is_Empty())) return s2.stack_data[s2.top-1];
            else {
                while(!(s1.is_Empty())) s2.push(s1.pop());
            }
            return s2.stack_data[s2.top-1];
        }
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner read_input = new Scanner(System.in);
        int q = read_input.nextInt();
        Solution s = new Solution(q);
        
        String next_input;
        read_input.nextLine();
        while(read_input.hasNext()){
            next_input = read_input.nextLine();
            String[] tokens = next_input.split(" ");
            if(tokens.length==1){
                if(Integer.parseInt(next_input) == 2) s.que.Deque();
            else if(Integer.parseInt(next_input) == 3) System.out.println(s.que.getFront());
            }
            
            
            else {
                if(Integer.parseInt(tokens[0]) == 1) {
                    s.que.Enque(Integer.parseInt(tokens[1]));
                }
            }
        }
        
    }
}
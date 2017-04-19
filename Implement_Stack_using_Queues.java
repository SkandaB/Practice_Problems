/*
Implement the following operations of a stack using queues.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
empty() -- Return whether the stack is empty.
*/
public class MyStack {
    Queue<Integer> queue1 = new LinkedList();
    Queue<Integer> queue2 = new LinkedList();
    /** Initialize your data structure here. */
    public MyStack() {
        
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        // 1. Enqueue a to q2
        // 2. Dequeue everything from q1 into q2
        // 3. Swap q1 and q2 names
        
        queue2.add(x);
        while(!(queue1.isEmpty())) queue2.add(queue1.poll());
        Queue<Integer> swap;
        swap = queue2;
        queue2 = queue1;
        queue1 = swap;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        // return first element from q1
        return queue1.poll();
    }
    
    /** Get the top element. */
    public int top() {
       return queue1.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
       return queue1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
public class MinStack {
    Stack<Integer> stack1, stack2;
    int min;
    /** initialize your data structure here. */
    public MinStack() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        stack1.push(x);
        min = Math.min(x,min);
        stack2.push(min);
    }
    
    public void pop() {
        if (stack1.isEmpty()) return;
        int pop = stack1.pop();
        stack2.pop();
        if (stack2.isEmpty()) min = Integer.MAX_VALUE;
        else min = stack2.peek();
        
        
        
    }
    
    public int top() {
        return stack1.peek();
    }
    
    public int getMin() {
        return stack2.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
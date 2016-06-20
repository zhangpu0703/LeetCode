public class MinStack {
    Stack<Integer> stack;
    Stack<Integer> curmin;
    /** initialize your data structure here. */
    public MinStack() {
        stack= new Stack<Integer>();
        curmin = new Stack<Integer>();
    }
    
    public void push(int x) {
        if (curmin.isEmpty() || x<= curmin.peek()) curmin.push(x);
        stack.push(x);
    }
    
    public void pop() {
        if (curmin.peek().equals(stack.peek())) curmin.pop();
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return curmin.peek();
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
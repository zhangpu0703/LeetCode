public class MinStack {
    Stack<Integer> myStack;
    Stack<Integer> curMin;
    int min; 

    /** initialize your data structure here. */
    public MinStack() {
        min= Integer.MAX_VALUE;
        myStack = new Stack<Integer>();
        curMin = new Stack<Integer>();
    }
    
    public void push(int x) {
        if (x<=min) min=x;
        myStack.push(x);
        curMin.push(min);
    }
    
    public void pop() {
        int a = myStack.pop();
        
        curMin.pop();
        if (curMin.isEmpty()) min = Integer.MAX_VALUE;
        if (a==min) min=curMin.peek();
    }
    
    public int top() {
        return myStack.peek();
    }
    
    public int getMin() {
        return curMin.peek();
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
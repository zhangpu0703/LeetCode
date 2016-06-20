class MinStack {
    private Stack<Integer> minstack = new Stack<Integer>();
    private Stack<Integer> Min = new Stack<Integer>();
    private int curmin= Integer.MAX_VALUE;
    public void push(int x) {
        minstack.push(x);
        if (Min.isEmpty() || x <= Min.peek()) Min.push(x);
    }

    public void pop() {
        if (Min.peek().equals(minstack.peek())) Min.pop();
        minstack.pop();
    }

    public int top() {
        return minstack.peek();
    }

    public int getMin() {
        return Min.peek();
        
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
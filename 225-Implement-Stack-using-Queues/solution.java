class MyStack {
    // Push element x onto stack.
    Queue<Integer> stack = new LinkedList<Integer>();
    public void push(int x) {
        Queue<Integer> reverse = new LinkedList<Integer>();
        while (!stack.isEmpty()){
            reverse.offer(stack.poll());
        }
        stack.offer(x);
        while (!reverse.isEmpty()){
            stack.offer(reverse.poll());
        }
    }

    // Removes the element on top of the stack.
    public void pop() {
        stack.poll();
    }

    // Get the top element.
    public int top() {
        return stack.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return stack.isEmpty();
    }
}
class MyStack {
    private Queue<Integer> myStack = new LinkedList<>();
    // Push element x onto stack.
    public void push(int x) {
        Queue<Integer> reverse = new LinkedList<>();
        while (!myStack.isEmpty()){
            reverse.offer(myStack.remove());
        }
        myStack.offer(x);
        while(! reverse.isEmpty()){
            myStack.offer(reverse.remove());
        }
    }

    // Removes the element on top of the stack.
    public void pop() {
        myStack.poll();
    }

    // Get the top element.
    public int top() {
        return myStack.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return myStack.isEmpty();
    }
}
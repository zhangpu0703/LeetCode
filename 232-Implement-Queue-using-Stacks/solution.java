class MyQueue {
    Stack<Integer> queue;
    
    public MyQueue(){
        queue = new Stack<Integer>();
    }
    // Push element x to the back of queue.
    public void push(int x) {
        Stack<Integer> reverse = new Stack<Integer>();
        while (!queue.isEmpty()){
            reverse.push(queue.pop());
        }
        queue.push(x);
        while (!reverse.isEmpty()){
            queue.push(reverse.pop());
        }
    }

    // Removes the element from in front of queue.
    public void pop() {
        queue.pop();
    }

    // Get the front element.
    public int peek() {
        return queue.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return queue.isEmpty();
    }
}
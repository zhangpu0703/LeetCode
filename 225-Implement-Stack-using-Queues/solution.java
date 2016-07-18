class MyStack {
    // Push element x onto stack.
    Queue<Integer> q1;
    Queue<Integer> q2;
    public MyStack(){
        q1=new LinkedList<Integer>();
        q2=new LinkedList<Integer>();
    }
    public void push(int x) {
        while (!q1.isEmpty()){
            q2.offer(q1.poll());
        }
        q1.offer(x);
        while (!q2.isEmpty()){
            q1.offer(q2.poll());
        }
    }

    // Removes the element on top of the stack.
    public void pop() {
        q1.poll();
    }

    // Get the top element.
    public int top() {
        return q1.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return q1.isEmpty();
    }
}
class MyStack {
    Queue<Integer> A = new LinkedList<>();
    Queue <Integer> B = new LinkedList<>();

    
    /** Push element x onto stack. */
    public void push(int x) {
        A.offer(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while (A.size()>1){
            Integer ret = A.poll();
            B.offer(ret);
        }
        Integer ret = A.poll();
        changeAB();
        return ret;
    }
    
    /** Get the top element. */
    public int top() {
        while (A.size()>1){
            Integer ret = A.poll();
            B.offer(ret);
        }
        Integer ret = A.poll();
        B.offer(ret);
        changeAB();
        return ret;
    }

    public void changeAB(){
        Queue <Integer> tem = A;
        A = B;
        B = tem;
    }
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return A.isEmpty();
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
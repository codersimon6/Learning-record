import java.util.Stack;

//leetcode submit region begin(Prohibit modification and deletion)
class MyQueue {
    Stack <Integer> A = new Stack<>();
    Stack <Integer> B = new Stack<>();

    /** Push element x to the back of queue. */
    public void push(int x) {
        A.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while (A.size() >= 1){
            B.push(A.pop());
        }
        Integer tem = B.pop();
        change();
        return tem;
    }
    
    /** Get the front element. */
    public int peek() {
        while (A.size() >= 1){
            B.push(A.pop());
        }
        Integer tem = B.peek();
        change();
        return tem;
    }

    public void change(){
            while (B.size() >= 1){
            A.push(B.pop());
        } 
    }
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return A.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
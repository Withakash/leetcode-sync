class MyQueue {

    Stack<Integer> in;
    Stack<Integer> out;
    public MyQueue() {
        in = new Stack<>();
        out = new Stack<>();
    }
    
    public void push(int x) {
        in.push(x);
    }
    
    public int pop() {
        shiftfvd();
        int val = out.pop();
        shiftbck();
        return val;
    }
    
    public int peek() {
        shiftfvd();
        int val = out.peek();
        shiftbck();
        return val;
        
    }
    
    public boolean empty() {
        return in.isEmpty();
        
    }
    public void shiftfvd() {
        while(!in.isEmpty())
        {
            out.push(in.pop());
        }
    }
        public void shiftbck() {
        while(!out.isEmpty())
        {
            in.push(out.pop());
        }
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

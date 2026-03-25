class MyQueue {
 
    Stack<Integer> in;
    Stack<Integer> out;
    public MyQueue() {
        in = new Stack<>();
        out= new Stack<>();
    }
    
    public void push(int x) {
        in.push(x);
    }
    
    public int pop() {
        shift_in_to_out();
        int temp = out.pop();
        shift_out_to_in();

        return temp;
    }
    
    public int peek() {
        shift_in_to_out();
        int temp = out.peek();
        shift_out_to_in();

        return temp;
    }
    
    public boolean empty() {
        return in.isEmpty();
    }
    
    public void shift_in_to_out(){
        while(!in.isEmpty()){
            out.push(in.pop());
        }
    }

    public void shift_out_to_in(){
        while(!out.isEmpty()){
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

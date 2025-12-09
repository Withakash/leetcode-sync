class MinStack {

    Stack<Integer> mainst;
    Stack<Integer> minst;

    public MinStack() {
        mainst = new Stack<>();
        minst = new Stack<>();
    }
    
    public void push(int val) {
        mainst.push(val);
        if(minst.isEmpty() || minst.peek() >= val)
        {
            minst.push(val);
        }
    }
    
    public void pop() {
       if(mainst.isEmpty()) return;

       int tem = mainst.pop();
       if(minst.peek() == tem) 
       {
        minst.pop();
       }   
    }
    
    public int top() {

        if(mainst.isEmpty())  return -1;
        return mainst.peek();
        
    }
    
    public int getMin() {

        if(minst.isEmpty()) return -1;
        return minst.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

class MyCircularDeque {

    int capacity;
    int[] arr;
    int size;
    int front;
    int rear;

    public MyCircularDeque(int k) {
        capacity = k;
        arr = new int[capacity];
        size = 0;
        front = 0;
        rear = -1;
    }

    public boolean insertFront(int value) {
      if(size == capacity) return false;
      
      if(isEmpty()) 
        front = rear = 0;
       else
      front = ( front - 1 + capacity) % capacity;

      arr[front] = value;
      size++;
      return true;

    }

    public boolean insertLast(int value) { 
        if(size == capacity) return false;
        if(isEmpty())
         front  = rear = 0;
        else 
        rear = (rear + 1) % capacity;
        arr[rear] = value;
        size++;
        return true;
    }

    public boolean deleteFront() {
       if(size == 0) return  false;

       front = (front + 1) % capacity; 
       size--;

       if(size == 0){
        front = 0;
        rear = -1;
       }
       return true;
    }

    public boolean deleteLast() {
       if(size == 0) return false;

       rear = (rear - 1 + capacity) % capacity;
       size--;

       if(size == 0) {
        front = 0;
        rear = -1;
       }
       return true;
    }

    public int getFront() {
       if(size == 0) return -1;
       return arr[front];
    }

    public int getRear() {
       if(size == 0 || rear == -1) return -1;
       return arr[rear];
    }

    public boolean isEmpty() {
       return size == 0;
    }

    public boolean isFull() {
       return size == capacity;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */

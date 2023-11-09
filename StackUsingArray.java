class Stack {
    int[] stack;
    int pointer;
    int maxSize;
    public Stack(int maxSize) {
        stack= new int[maxSize];
        this.maxSize= maxSize;
        pointer=-1;
    }
    
    public void push(int x) {
        if(pointer < maxSize-1){
             stack[++pointer]= x;
        }
    }
    
    public int pop() {
         
        if (pointer> -1)
        {   
            return stack[pointer--];
        }
        else return -1;
    }
        
}
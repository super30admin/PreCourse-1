class Exercise_1 { 
	    static final int MAX = 1000; 
	    int top; 
	    int a[] = new int[MAX];
	  
	    boolean isEmpty() 
	    {
	    	if (top<0){
	    		return true;
	    	}
			return false; 
	    } 

	    Exercise_1() 
	    { 
	        top=-1;
	    } 
	  
	    boolean push(int x) 
	    { 
	        if (top>=MAX){
	        	System.out.println("Stack overflow");
	        	return false;
	        }
	        top=top+1;
	        a[top]=x;
			return true;     
	        
	    } 
	  
	    int pop() 
	    { 
	    	if (top<0){
	        	System.out.println("Stack underflow");
	        	return 0;
	        }
	    	int top_element=a[top];
	    	top=top-1;
			return top_element;
	    } 
	  
	    int peek() 
	    { 
	    	if (top<0){
	        	System.out.println("Stack underflow");
	        	return 0;
	        }
	    	
	    	int top_element=a[top];
			return top_element; 
	    } 
	} 
	  
	// Driver code 
	class Main { 
	    public static void main(String args[]) 
	    { 
	    	Exercise_1 s = new Exercise_1(); 
	        s.push(10); 
	        s.push(20); 
	        s.push(30); 
	        System.out.println(s.pop() + " Popped from stack"); 
	    } 
	}


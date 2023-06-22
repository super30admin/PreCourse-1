export class StackNode { 
     _data: number; 
     _next: StackNode; 

    constructor( data:number) 
    {        
         //Constructor here 
        this._data = data;
        //this._next=next;
    } 

    public get data(): number {
        return this._data;
    }
    public set data(value: number) {
        this._data = value;
    }

    public get next(): StackNode | null {
        return this._next;
    }
    public set next(value: StackNode | null) {
        this._next = value;
    }
}

export class StackAsLinkedList { 
  
     _root: StackNode; 
	
     Constructor () {
        this._root=null;
     }

      isEmpty():Boolean { 
        //Write your code here for the condition if stack is empty. 
        return this._root===null?  true: false;
    } 
  
    //time complexity: o(1)
    public push(data: number) : void
    { 
        let newStackNode= new StackNode(data);
        if(this._root===null){
            this._root= newStackNode;
        } else{
            newStackNode.next= this._root;
            this._root=newStackNode;
        }

        //Write code to push data to the stack. 
    } 
  
    //time complexity o(1)
    pop(): number 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        if(this._root===null){
             console.log("stack Underflow");
             return 0;
        } else{
            let temp= this._root;
            this._root=temp.next;
            return temp.data;
        }
    } 
  
    //time complexity: o(1)
     peek() : number{ 
        //Write code to just return the topmost element without removing it.
        return this._root.data;
    } 
}
	//Driver code
 
        var sll: StackAsLinkedList = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        console.log(sll.pop() + " popped from stack"); 
  
        console.log("Top element is " + sll.peek()); 
 

export class Stack{

     max: number = 1000; 
     top: number;
     a: number [];
     popped: number;

    constructor() 
    { 
        //Initialize your constructor 
        this.top = -1;
        this.a= new Array(this.max);
        this.popped=0;
    } 

    isEmpty(): boolean 
    { 
        //Write your code here 
        return this.top==-1?  true: false;
    } 
  
     push( x:number): boolean { 
        //Check for stack Overflow
        //Write your code here
        if (this.top + 1 == this.max){
            return false;
        } else {
            this.top = this.top + 1;
           this.a[this.top]=x;
            return true;
        }
    } 
  
     pop():number { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here

        if (this.top == -1)
        {
            console.log("Stack Underflow");
            return 0;
        }
        else
        {
            this.popped= this.a[this.top]
            this.a[this.top]=null;
            this.top--;
        }
        return this.popped;        
    } 
  
     peek(): number{ 
        //Write your code here
         return this.a[this.top];
    } 
} 
  

     var s: Stack = new Stack(); 
     s.push(10); 
     s.push(20); 
     s.push(30); 
    console.log(s.pop() + " Popped from stack");


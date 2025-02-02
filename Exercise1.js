// Exercise_1 : Implement Stack using Array. check if isEmpty,push a value, pop a value, print the stack, peep the top most value 

class Stack{
    
    constructor(){
        this.MAX =1000;
        this.a = new Array[this.MAX];
        this.top =-1;
    }

    isEmpty(){
        return this.top === -1
    }

    push(val){
        if (this.top >= this.MAX-1){
            return false
        }
        this.a.push(val)
    }

    pop(){
        if (this.isEmpty()){
            return 0;
        }
        return [this.a[this.top]]
        
    }

    peek(){
        if(this.isEmpty()){
            console.log("Stack is Empty");
            return 0;
        }
        return [this.a[this.top]]
    }
}
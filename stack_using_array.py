class Stack:
    def __init__(self,capacity):
        self.capacity = capacity
        self.top = -1
        self.array = [None for i in range(capacity)]
    
    def push(self,val):
        if self.top==self.capacity-1:
            print("The stack is full")
        else:
            self.top+=1
            self.array[self.top] = val

    def pop(self):
        if self.top==-1:
            return None
        else:
            retVal = self.array[self.top]
            self.top-=1
            return retVal
    
    def print(self):
        if self.top==-1:
            print("Stack is empty")
        else:
           print(self.array[:self.top+1])
    

if __name__=="__main__":
    stack = Stack(3)

    stack.push(2)
    stack.push(8)
    stack.push(10)
    stack.push(16)
    stack.print()
    print("Popped element",stack.pop())
    stack.print()

class myStack:
     def __init__(self):
         self.arr=[]
     def isEmpty(self):
        if(len(self.arr)==0):
            return True
        else:
            return False
     def push(self, item):
        self.arr.append(item)
     def pop(self):
        if(not(self.isEmpty())):
            removed=self.arr[-1]
            del self.arr[-1]
            return("Removed",removed)
        else:
            return "Stack is Empty"
        
     def peek(self):
        if(not(self.isEmpty())):
            return(self.arr[-1])
        else:
            return("Stack is Empty")
        
     def size(self):
         return len(self.arr)
         
     def show(self):
        return self.arr;
         

s = myStack()
s.push('1')
s.push('2')
print(s.show())
print(s.pop())
print(s.pop())
print(s.pop())
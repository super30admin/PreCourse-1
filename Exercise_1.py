//time complexity: O(1)
//space complexity: O(n)

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
    
     
     
     def __init__(self):
        self.arr = []
         
     def isEmpty(self):
        return self.arr == []
    
     def push(self, item):
        self.arr.append(item)
         
     def pop(self):
        if(not self.isEmpty()):
           
            element= self.arr[-1]
            
            del(self.arr[-1])
            return element
        else:
            return "stack underflow"
        
     def peek(self):
        return self.arr[-1]
        
     def size(self):
        return len(self.arr)
         
     def show(self):
        print(self.arr) 
        
s = myStack()
s.push('1')
s.push('2')
print(s.pop())
s.show()

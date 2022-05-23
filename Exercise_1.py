# Time Complexity : O(1) for push, pop, peek
# Space Complexity : O(N) where N is the number of elements in the array.
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
        self.list = []


     def isEmpty(self):
       return len(self.list) == 0
         
     def push(self, item):
        self.list.append(item)
         
     def pop(self):
       if len(self.list) == 0:
         return "List is Empty" 
       else:
        k= self.list[-1]
        self.list = self.list[:-1]        
        return k
     def peek(self):
       if len(self.list) == 0:
         return "List is Empty" 
       else:
        return self.list[-1]
        
     def size(self):
       return len(self.list)
         
     def show(self):
         return self.list

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())

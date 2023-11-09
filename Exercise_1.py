#time Comlexity: O(1)
#space complexity: O(n)
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
         self.stack_list=[]
         self.top=-1
     def isEmpty(self):
         if self.top==-1:
            return True
     def push(self, item):
         self.stack_list.append(item)
         self.top+=1
     def pop(self):
         if self.isEmpty():
           print("stack underflow")
         else:
            self.top-=1
            return self.stack_list.pop()
        
     def peek(self):
         if self.isEmpty():
            print("stack is empty")
         else:
            return self.stack_list[self.top]
     def size(self):
         return self.top+1
         
     def show(self):
         if self.isEmpty():
            print("stack is empty")
         else:
            return self.stack_list
         

s = myStack()
s.push('1')
s.push('2')
print(f"popping :{s.pop()}")
print(f"printing stack {s.show()}")

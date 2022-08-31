#Time Complexity: O(n)
#Space Complexity: O(n) 

class myStack:
     def __init__(self):
          self.data = []
          self.limit = 100

     def push(self, item):     
          if len(self.data)>=self.limit:   
             print("Stack Overflow!")   
          else:
             self.data.append(item)   

     def pop(self):       
          if len(self.data)<=0: 
             print("Stack Underflow!")    
          else:
             element = self.data[-1]  
             self.data=self.data[:-1]   
             return "Element popped! "

     def peek(self):
          if len(self.data)<=0:    
             print("IndexError")
          else:
             return self.data[-1]   
        
     def size(self):
          return len(self.data)   

     def show(self):       
          return self.data  

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
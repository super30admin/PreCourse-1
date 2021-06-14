class myStack:
     def __init__(self):
         self.store=[0]*20
         self.maxSize=20
         self.top=0
     def isEmpty(self):
         if self.top==0:
             return True
         return False
         
     def push(self, item):
         if self.top==self.maxSize:
             return "Stack Overflow."
         else:
            self.store[self.top]=item
            self.top+=1
            return "Item Added successfully."
         
     def pop(self):
        if not self.isEmpty():
            val=self.store[self.top-1]
            self.top-=1
            return val
        return None
        
     def peek(self):
         if not self.isEmpty():
             return self.store[-1]
         return None
        
     def size(self):
         return self.top
         
     def show(self):
         print(self.store[:self.top])
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())

"""
Time complexity for push/Pop/Peek/Size-(O(1))
Time complexity for show(O(n))- n is length of stack
Space complexity- without the stack space, O(1)
"""

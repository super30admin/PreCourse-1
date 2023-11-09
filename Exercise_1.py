# Time complexity: O(1) 
# Space complexity: O(n) incase of very large MAX else O(1)
class myStack:
     def __init__(self, MAX):
        self.max_size = MAX
        self.items = []

     def isEmpty(self):
       return self.items == []
         
     def push(self, item):
       if len(self.items) > self.max_size:
         print('Stack Overflow')
         return
       self.items.append(item)
         
     def pop(self):
       if self.isEmpty():
         print('Stack Underflow')
         return 0
       return self.items.pop()
        
     def peek(self):
      if self.isEmpty():
        print('Stack empty')
        return 0
      return self.items[-1]
       
        
     def size(self):
       return len(self.items)
         
     def show(self):
       return self.items
         
s = myStack(1000)
s.push('1')
s.push('2')
print(s.pop())
print(s.show())

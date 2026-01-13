class myStack:
  #Time Complexity: push: O(1), pop: O(1), peek: O(1), isEmpty: O(1), size: O(1), show: O(n)
  #Space Complexity: O(n)

     def __init__(self):
         self.items = []
         
     def isEmpty(self):
         return len(self.items) == 0
         
     def push(self, item):
         self.items.append(item)
         
     def pop(self):
         if not self.isEmpty():
             return self.items.pop()
         
     def peek(self):
         if not self.isEmpty():
             return self.items[-1]
         
     def size(self):
         return len(self.items)
         
     def show(self):
         print(self.items)

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())

# Time Complexity | Space Complexity
# push - O(1)     | # push - O(n)
# pop - O(n)      | # pop  - O(n)   
# peek - O(1)     | # peek - O(n)
# size - (1)      | # size - O(n)
class myStack:
     def __init__(self):
         self.array = []
     def isEmpty(self):
         return len(self.array) == 0
     def push(self, item):
         self.array.append(item)
     def pop(self):
        if not self.isEmpty():
            top= self.array[-1]
            self.array = self.array[:-1] 
            return top
        else:
            print("Stack is empty")
     def peek(self):
         if not self.isEmpty():
             return self.array[-1]
         else:
             print("Stack is empty")
     def size(self):
         return len(self.array)
     def show(self):
         return self.array
         
s = myStack()
s.push('10')
s.push('20')
s.push('30')

print(s.show())
print("Peek of the stack :" , s.peek())
print("Popped element:", s.pop())   
print("Stack after pop :", s.show())
print(s.size())


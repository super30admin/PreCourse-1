# Space - O(1)
# Pop - Best,Worst: O(1)
# Push - Best: O(1), Worst: O(n)
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
        self.stack = []
        self.size  = 0
        self.top = -1
     def isEmpty(self):
         return self.top == -1
     def push(self, item):
        if self.size == self.top+1:
            self.stack.append(item)
            self.size += 1
            self.top += 1
        else:
            self.top += 1
            self.stack[top] = item
     def pop(self):
        if self.isEmpty():
            return
        top = self.stack[self.top]
        self.top -= 1
        return top
        
     def peek(self):
       return self.stack[top] 
     def size(self):
        return self.top + 1
         
     def show(self):
        return self.stack[0:self.top+1]
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())

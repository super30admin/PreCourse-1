class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
    def __init__(self):
        self.container = []
         
    def isEmpty(self):
        return len(self.container) == 0
         
    def push(self, item):
        self.container.append(item)
        
        
         
    def pop(self):
           return self.container.pop()
            
    def peek(self):
        return self.container[-1]
        
    def size(self):
        return len(self.container)
         
    def show(self):
        return self.container
         

s = myStack()
print(s.isEmpty())
s.push('1')
s.push('2')
s.push('ddef')
s.push('[[]]')
print(s.pop())
print(s.show())
print(s.peek())
print(s.isEmpty())
print(s.size())

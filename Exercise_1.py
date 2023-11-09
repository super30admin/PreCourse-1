class myStack:
  
  #this is implementing stack using an array
  #space complexity: is O(n) where n is number of elements pushed
  #time complexity: for push(),show() is O(n) and for pop(),peek(),size() is O(1)
  #passed all test cases: yes
  #difficulty faced: using append function, calling another function of same class
    def __init__(self):
        self.stack = []


    def isEmpty(self):
        return len(self.stack) == 0
         
    def push(self, item):
        self.stack.append(item)


    def pop(self):
        if self.isEmpty():
            return (-1)
        return self.stack.pop()
                
    def peek(self):
        if self.isEmpty():
            return (-1)
        return self.stack[len(self.stack) - 1]
        
    def size(self):
        return(len(self.stack))

         
    def show(self):
        return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
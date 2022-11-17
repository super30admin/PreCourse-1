class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
    def __init__(self):
        self.new_stack = []
       
    def isEmpty(self):
        if len(self.new_stack):
            return 0
        return -1
         
    def push(self, item):
         self.new_stack.append(item)
         return self.new_stack

    def pop(self):
        if (self.isEmpty()):
            return -1
        return self.new_stack.pop()

        
    def peek(self):
        return self.new_stack[len(self.new_stack)-1]
        
    def size(self):
        return len(self.new_stack) 
         
    def show(self):
       return self.new_stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())

#Time Complexity
# is Empty()  --> O(1)
# pop()  --> O(1)
# push()  --> O(1)
# peek()  --> O(1)
# size()  --> O(1)
# show()  --> O(1)
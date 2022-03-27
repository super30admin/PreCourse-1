
'''  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file'''

class myStack:
    stack=[];
    def __init__(self):
        self.stack = []
    
    def isEmpty(stack):
        return len(stack) == 0
        
    def push(self, element):
        self.stack.append(element)
        print(element + " pushed to stack ")

    def pop(self):
        if len(self.stack) == 0:
            print('Empty Stack')
        self.stack.pop();
        return(self.stack)
    def peek(self):
        if len(self.stack) == 0:
            print('Stack is Empty')
        return(self.stack[len(self.stack) - 1]) ;
        
    def size(self):
        return(self.size)

    def show(self):
        return(self.stack)
s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())

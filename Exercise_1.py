class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
    def __init__(self):
        self.st = []

    def isEmpty(self):
        if not self.st:
            return True
        else:
            return False      

    def push(self, item):
        self.st.append(item)
         
    def pop(self):
        if self.st:
            return self.st.pop()
        else:
            return "List is empty"
        
    def peek(self):
        if self.st:
            return self.st[-1]
        else:
            return "List is empty"
     
    def size(self):
        return len(self.st)
         
    def show(self):
        return self.st

         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
print(s.peek())
print(s.pop())
print(s.isEmpty())
print(s.pop())

class myStack:
    # Please read sample.java file before starting.
    # Kindly include Time and Space complexity at top of each file
    def __init__(self):
        self.st = []
        
    def isEmpty(self):
        return len(self.st) == 0
        
    def push(self, item):
        self.st.append(item)
        
    def pop(self):
        if self.isEmpty():
            return
        return self.st.pop()
        
    def peek(self):
        if self.isEmpty():
            return None
        return self.st[-1]
        
    def size(self):
        return len(self.st)
        
    def show(self):
        return self.st
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())

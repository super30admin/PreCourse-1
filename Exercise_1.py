'''
Time Complexity
    - isEmpty : O(1)
    - push : O(1)
    - pop : O(1)
    - peek : O(1)
    - size : O(1)
    - show : O(N)

Space Complexity: O(N)

'''
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file

    def __init__(self):
        self.stack = []
        
    def isEmpty(self):
        if(len(self.stack)==0):
            return True
        return False
        
    def push(self, item):
        self.stack.insert(len(self.stack), item)
        
    def pop(self):
        if(len(self.stack)==0):
            return "Empty Stack"
        top_ele = self.stack[len(self.stack)-1]
        self.stack = self.stack[:-1]
        return top_ele

    def peek(self):
        return self.stack[len(self.stack)]

    def size(self):
        return len(self.stack)
        
    def show(self):
        # I assume show() returns the stack from top to bottom
        rev_list = []
        for i in range(len(self.stack)-1, -1, -1):
            print(self.stack[i])
            rev_list.append(self.stack[i])  
        return rev_list
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())

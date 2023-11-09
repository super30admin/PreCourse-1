# Time Complexity :
#  Space Complexity :
#  Did this code successfully run on Leetcode :
#  Any problem you faced while coding this :

# implement stack using array
class myStack:
  # Please read sample.java file before starting.
  # Kindly include Time and Space complexity at top of each file
    def __init__(self):
        self.stack = []

    def isEmpty(self):
        return self.stack == []

    def push(self, item):
        self.stack.append(item)

    def pop(self):
        if (not self.isEmpty()):
            elem = self.stack[-1]
            del (self.stack[-1])
        else:
            return ("Empty Stack")
    # def peek(self):

    def size(self):
        return len(self.stack)

    def show(self):
        return self.stack


s = myStack()
s.push('1')
s.push('2')
print(s.show())
print(s.pop())
print(s.show())

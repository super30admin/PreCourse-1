# Time Complexity: O(1)
# Space Complexity: O(n)
class myStack:
    index = -1
    # Please read sample.java file before starting.
    # Kindly include Time and Space complexity at top of each file
    def __init__(self):
        self.stack=[]

    def isEmpty(self):
        return self.index==-1

    def push(self, item):
        self.stack.append(item)
        self.index+=1

    def pop(self):
        element = self.peek()
        if self.index != -1:
            self.index-=1
        return element

    def peek(self):
        if self.index == -1:
            return -1;
        return self.stack[self.index]

    def size(self):
        return self.index+1;

    def show(self):
        return self.stack[:self.index+1]


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
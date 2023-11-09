class myStack:
## Time Complexity ## 
# Push, pop: O(1)
## Time Complexity ## o(n)

    def __init__(self):
        self.stack = []

    def isEmpty(self):
        return self.stack == []

    def push(self, item):
        if item not in self.stack:
            self.stack.append(item)
        return "Already in stack"

    def pop(self):
        if not self.isEmpty():
            lastItem = self.stack[-1]
            del(self.stack[-1])
            # if we want to return item removed
            return lastItem 
        else:
            print("Stack Underflow")

    def peek(self):
        return self.stack[len(self.stack)-1]

    def size(self):
        return len(self.stack)

    def show(self):
        return self.stack


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())

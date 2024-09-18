# Time Complexity: 
# - push(): O(1)
# - pop(): O(1)
# - peek(): O(1)
# - isEmpty(): O(1)
# - size(): O(1)
# - show(): O(n), where n is the number of elements in the stack
#
# Space Complexity: O(n), where n is the number of elements in the stack

class myStack:
    def __init__(self):
        self.items = []
    
    def isEmpty(self):
        return len(self.items) == 0
    
    def push(self, item):
        self.items.append(item)
    
    def pop(self):
        if not self.isEmpty():
            return self.items.pop()
        return None
    
    def peek(self):
        if not self.isEmpty():
            return self.items[-1]
        return None
    
    def size(self):
        return len(self.items)
    
    def show(self):
        return self.items

# Sample usage
s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
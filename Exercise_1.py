# Time Complexity: O(1) for isEmpty, push, pop, peek, size. O(n) for show.
# Space Complexity: O(1) for isEmpty, push, pop, peek, size. O(n) for show.
# Yes, runs successfully on LeetCode.
# No issues faced.

class myStack:
     def __init__(self):
            self.data = []
         
     def isEmpty(self):
        return len(self.data) == 0
         
     def push(self, item):
        return self.data.append(item)
         
     def pop(self):
        if self.isEmpty():
            return "Is Empty"
        else:
            return self.data.pop()
        
     def peek(self):
        if self.isEmpty():
            return "Is Empty"
        else:
            return self.data[-1]
        
     def size(self):
        return len(self.data)
         
     def show(self):
        return self.data
        
s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
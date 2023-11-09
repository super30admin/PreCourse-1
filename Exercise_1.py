# Time Complexity : O(n) Push and Pop operations take O(n) when a new block of memory is created
# Space Complexity :O(n) As a new list is created and used
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class myStack:

    def __init__(self):
        # Created an empty list
        self.stack_List = []

    def isEmpty(self):
        # Checks the length of the list and returns true if empty else returns false
        return len(self.stack_List) == 0

    def push(self, item):
        # The item is added to list using append method
        self.stack_List.append(item)

    def pop(self):
        # Checks if the list is empty, if it is empty, -1 is returned
        # else popped value is returned
        if self.isEmpty():
            return -1
        else:
            return self.stack_List.pop()

    def peek(self):
        # Returns the last element of the list
        return self.stack_List[-1]

    def size(self):
        # Returns the size of the list using len() function
        return len(self.stack_List)

    def show(self):
        # Returns the entire list
        return self.stack_List


s = myStack()
s.push('1')
s.push('2')
print(s.show())
print(s.isEmpty())
print(s.pop())
print(s.peek())
print(s.pop())
print(s.pop())
print(s.show())
print(s.isEmpty())

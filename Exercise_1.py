# Exercise_1 : Implement Stack using Array.
# // Time Complexity : isEmpty = O(1), push = O(1), pop = O(1), peek = O(1), size = O(1), show = O(1)
# // Space Complexity : O(n), n-> number of elements in stack
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // Your code here along with comments explaining your approach
class myStack:
    # Please read sample.java file before starting.
    # Kindly include Time and Space complexity at top of each file
    def __init__(self):
        # initializing empty array
        self.stack = []
        # initializing integer count to 0 for size
        self.count = 0

    def isEmpty(self):
        # if count is 0 (array is empty) returns True
        if self.count == 0:
            return True

    def push(self, item):
        # append item into the list
        self.stack.append(item)
        # update count (for updating size)
        self.count += 1
        return self.stack

    def pop(self):
        # checking if list is empty
        if self.count > 0:
            # if not removing the last element
            self.count -= 1
            return self.stack.pop()
        return None

    def peek(self):
        # checking if list is empty
        if self.count > 0:
            # if not showing the last element
            return self.stack[-1]
        return None

    def size(self):
        # returning count which keeps tally of size
        return self.count

    def show(self):
        # returning stack to show
        return self.stack


s = myStack()
s.push('1')
s.push('2')
print(s.show())
print(s.pop())
print(s.show())

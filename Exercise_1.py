# // Time Complexity : append O(1), Pop O(n), Peek O(1), isEmpty O(1), Size O(1)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // Your code here along with comments explaining your approach
class myStack:
    # Please read sample.java file before starting.
    # Kindly include Time and Space complexity at top of each file
    def __init__(self):
      # Initializing my data structure
        self.stack = []

    def isEmpty(self):
      #if length of stack is zero return true else false
        return len(self.stack) == 0

    def push(self, item):
      #appending an item to the end of the list
        self.stack.append(item)

    def pop(self):
       #removing an item to the end of the list
        return self.stack.pop()

    def peek(self):
      #getting an item to the end of the list
        return self.stack[-1]

    def size(self):
        return len(self.stack)

    def show(self):
        return self.stack


s = myStack()
s.push("1")
s.push("2")
print(s.show())
s.peek()
print(s.pop())
print(s.show())

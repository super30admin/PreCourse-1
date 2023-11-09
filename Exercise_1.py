# Time Complexity : O(1)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : n/a
# Any problem you faced while coding this : n/a


# Your code here along with comments explaining your approach
# Press the green button in the gutter to run the script.
class myStack:
    # Please read sample.java file before starting.
    # Kindly include Time and Space complexity at top of each file
    def __init__(self):
        self.stack = []

    def isEmpty(self):
        return len(self.stack) == 0

    def push(self, item):
        self.stack.append(item)

    def pop(self):
        if self.isEmpty():
            print("Stack is empty.")
            return None
        return self.stack.pop()

    def peek(self):
        if self.isEmpty():
            return None
        return self.stack[len(self.stack) - 1]

    def size(self):
        return len(self.stack)

    def show(self):
        response = ""
        for x in range(len(self.stack)):
            response += (self.stack[x]) + " "
        return response


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
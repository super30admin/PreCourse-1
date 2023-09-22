# Exercise_1 : Implement Stack using Array.

# Time Complexity : O(1).
# Space Complexity : O(1) for all operations except show since the space required to store the list = no of elements in the list
# Did this code successfully run on Leetcode : could not find the question on Leetcode
# Any problem you faced while coding this : Struggled with time and space complexity

# Your code here along with comments explaining your approach

class myStack:
    # Please read sample.java file before starting.
    # Kindly include Time and Space complexity at top of each file
    def __init__(self):
        # initialize top of stack to -1. This means tos is not pointing to any index in the array, as the array is empty
        self.tos = -1
        self.arr = []

    def isEmpty(self):
        # if tos is -1, that means array is empty
        if self.tos == -1:
            return True
        return False

    def push(self, item):
        # increment tos by 1 and then append the element. tos will always point to the last element in the array
        self.tos += 1
        self.arr.append(item)
        print(self.show())

    def pop(self):
        # check if tos == -1, if yes array is empty. There is nothing to pop.
        if self.isEmpty():
            return "Empty Stack, nothing to pop"
        # else: decrement tos and pop the last element from the array
        self.tos -= 1
        return self.arr.pop()

    def peek(self):
        # if array is not empty, return the value at which tos points. this is the last element of the array
        if self.isEmpty():
            return "Empty Stack, nothing to show"
        return self.arr[self.tos]

    def size(self):
        # return length of the array
        return len(self.arr)

    def show(self):
        # return the array
        return self.arr


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
s.push('5')
print(s.peek())
print(s.show())
print(s.size())

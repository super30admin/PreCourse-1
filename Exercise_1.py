# Time Complexity: O(1)
# Space Complexity: O(n) where n is the number of elements inserted
# Did this code successfully run on Leetcode: I don't think this exact question is on Leetcode.
#                                             Please let me know in case it is on Leetcode
# Any problem you faced while coding this: No
# Your code here along with comments explaining your approach


class myStack:
    def __init__(self):
        self.arr = []  # Initializing the array

    def isEmpty(self):
        if self.size() > 0:  # Checking if size is zero or not. If 0, it is empty, else not
            return False
        return True

    def push(self, item):
        self.arr.append(item)  # just appending element to the last

    def pop(self):
        if self.size() > 0:  # if size is zero, it is empty, so return None. Otherwise return the last element
            return self.arr.pop()
        else:
            return None

    def peek(self):
        return self.arr[-1]  # Return the last inserted element

    def size(self):
        return len(self.arr)  # This methos returns length of the array

    def show(self):
        print(self.arr)  # to print the array


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())

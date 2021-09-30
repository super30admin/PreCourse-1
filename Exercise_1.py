# Time Complexity : mentioned in every function
# Space Complexity : mentioned in every function
# Did this code successfully run on Leetcode : Didn't tried
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach


class myStack:

    def __init__(self):
        """
        Time Complexity : O(1)
        Space Complexity : O(1)
        """
        self.data = []

    def isEmpty(self):
        """
        Time Complexity : O(1)
        Space Complexity : O(1)
        """
        return self.data == []

    def push(self, item):
        """
        Time Complexity : O(1)
        Space Complexity : O(1)
        No additional variable used hence constant space complexity.
        """
        self.data.append(item)

    def pop(self):
        """
        Time Complexity : O(1)
        Space Complexity : O(1)
        No additional variable used hence constant space complexity.
        """
        return self.data.pop()

    def peek(self):
        """
        Time Complexity : O(1)
        Space Complexity : O(1)
        """
        return self.data[-1]

    def size(self):
        """
        Time Complexity : O(1)
        Space Complexity : O(1)
        built-in len() function stores the length of any list in a separate variable. Hence returning
        value is a O(1) time complexity.
        """
        return len(self.data)

    def show(self):
        """
        Time Complexity : O(1)
        Space Complexity : O(1)
        """
        return self.data


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())

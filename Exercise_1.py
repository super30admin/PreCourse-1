# Time Complexity:
#   * isEmpty: O(1) - using bool() truthy value of the array
#   * push: O(1) - appends at end of the array
#   * pop: O(1) - removes last item in the array
#   * peek: O(1) - returns last item in the array
#   * size: O(1) - length of the array
#   * show: O(1) - return array
# Space Complexity: O(n) - for n items in the stack
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No


class myStack:
    def __init__(self):
        self.items = []

    def isEmpty(self):
        # use negated python's truthy value, which returns false if the array is empty
        # and true otherwise
        return not bool(self.items)

    def push(self, item):
        # append item at the end of the array
        self.items.append(item)

    def pop(self):
        # if the array is not empty, use python's array pop method which removes and
        # returns the last element in the array
        if self.size() > 0:
            return self.items.pop()

        # if the array is empty, return None
        return None

    def peek(self):
        # if the array is not empty, return the last element in the array
        if self.size() > 0:
            return self.items[-1]

        # if the array is empty, return None
        return None

    def size(self):
        # return length of the array
        return len(self.items)

    def show(self):
        # return array
        return self.items


s = myStack()
print(s.pop())
s.push("1")
s.push("2")
print(s.pop())
print(s.show())

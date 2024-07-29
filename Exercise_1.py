# Time Complexity:
# - __init__: O(1)
# - isEmpty: O(1)
# - push: O(1) (appending to the end of the list)
# - pop: O(1) (removing from the end of the list)
# - peek: O(1) (accessing the last element)
# - size: O(1) (getting the length of the list)
# - show: O(n) (returning a copy of the list)

# Space Complexity:
# - __init__: O(1) (excluding the space used by the list)
# - isEmpty: O(1)
# - push: O(1) (excluding the space used by the list)
# - pop: O(1) (excluding the space used by the list)
# - peek: O(1)
# - size: O(1)
# - show: O(n) (space required to return the list)

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
        return None  # Return None if the stack is empty

    def peek(self):
        if not self.isEmpty():
            return self.items[-1]
        return None  # Return None if the stack is empty

    def size(self):
        return len(self.items)

    def show(self):
        return self.items.copy()  # Return a copy of the list to avoid modifying the original list


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())

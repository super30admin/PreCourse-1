# Time Complexity : O(1)
# Space Complexity :O(1)
class Node:
   def __init__(self, data, next=None):
      self.data = data
      self.next = next
      self.prev = None
class myStack:
    # Please read sample.java file before starting.
    # Kindly include Time and Space complexity at top of each file
    def __init__(self):
        self.top = None
        self.size=0


    def isEmpty(self):
        return self.size == 0

    def push(self, item):
        self.top = Node(item, self.top)

    def pop(self):
        if self.top is None:
            return None
        data = self.top.data
        self.top = self.top.next
        return data

    def peek(self):
        if self.isEmpty():
            raise Exception("Peeking from an empty stack")
        return self.top.data

    def size(self):
        return self.size

    def show(self):
        return self.top.data





s = myStack()
s.push('1')
print("After first push, element at top of the stack", s.show())
s.push('2')
print("After second push, element at top of the stack", s.show())
print(s.pop())
print("After pop, element at top of the stack", s.show())
print(s.show())
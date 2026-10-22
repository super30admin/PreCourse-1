# Time Complexity: push O(1); pop O(1); peek - O(1); is_empty() - O(1); Space : O(n) where n is the number of values of stack; O(1) for extra operations

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class Stack:
    def __init__(self):
        self.head = None
        
    def push(self, data):
        new_node = Node(data)
        new_node.next = self.head
        self.head = new_node
        
    def pop(self):
        if self.is_empty():
            raise IndexError('stack is empty')
        value = self.head.data
        self.head = self.head.next
        return value

    def peek(self):
        if self.is_empty():
            raise IndexError('stack is empty')
        return self.head.data

    def is_empty(self):
        return self.head is None

if __name__ == "__main__":
    # --- empty stack ---
    s = Stack()
    assert s.is_empty()                          # new stack is empty

    try:
        s.pop()
        assert False, "expected IndexError"      # pop on empty must raise
    except IndexError:
        pass

    try:
        s.peek()
        assert False, "expected IndexError"      # peek on empty must raise
    except IndexError:
        pass

    # --- push / peek ---
    s.push(1)
    assert not s.is_empty()                      # not empty after a push
    assert s.peek() == 1                         # peek returns the top
    assert s.peek() == 1                         # peek does not remove it

    # --- last in, first out ---
    s.push(2)
    s.push(3)
    assert s.pop() == 3                          # most recent comes out first
    assert s.pop() == 2
    assert s.peek() == 1                         # top is correct after pops
    assert s.pop() == 1
    assert s.is_empty()                          # empty again after popping everything

    try:
        s.pop()
        assert False, "expected IndexError"      # empty again -> raises again
    except IndexError:
        pass

    # --- reuse after emptying, and mixed values ---
    s.push("a")
    s.push(None)                                 # None is a valid value to store
    assert s.pop() is None                       # returns the stored None, no error
    assert s.pop() == "a"
    assert s.is_empty()

    print("all tests passed")
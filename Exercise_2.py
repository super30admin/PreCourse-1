# The space complexity for a stack is O(n) where n is the number of elements in the stack.
# The space complexity for a node is O(1).

# The time complexity for the push operation is O(1).
# The time complexity for the pop operation is O(1).
# The time complexity for the is_empty operation is O(1).
# The time complexity for the print_stack operation is O(n) where n is the number of elements in the stack.
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
            return None
        popped_data = self.head.data
        self.head = self.head.next
        return popped_data

    def is_empty(self):
        return self.head is None

    def print_stack(self):
        curr = self.head
        while curr:
            print(curr.data, end=" -> ")
            curr = curr.next
        print("None")

a_stack = Stack()

while True:
    print('push <value>')
    print('pop')
    print('print')
    print('quit')
    do = input('What would you like to do? ').split()
    operation = do[0].strip().lower()
    if operation == 'push':
        a_stack.push(int(do[1]))
    elif operation == 'pop':
        popped = a_stack.pop()
        if popped is None:
            print('Stack is empty.')
        else:
            print('Popped value:', popped)
    elif operation == 'print':
        a_stack.print_stack()
    elif operation == 'quit':
        break

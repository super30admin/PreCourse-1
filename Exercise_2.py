# Time Complexity:
# - __init__: O(1)
# - push: O(1) (insertion at the beginning of the linked list)
# - pop: O(1) (removal from the beginning of the linked list)
# - peek: O(1) (not implemented here, but accessing the first element of the linked list is O(1))
# - size: O(1) (not implemented here)
# - show: O(n) (not implemented here, but traversing the list to show all elements is O(n))

# Space Complexity:
# - __init__: O(1) (excluding the space used by the Node objects)
# - push: O(1) (excluding the space used by the Node objects)
# - pop: O(1) (excluding the space used by the Node objects)
# - The space complexity of the entire program also depends on the number of Node objects created, which is proportional to the number of elements in the stack.

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
        if self.head is None:
            return None
        else:
            removed_data = self.head.data
            self.head = self.head.next
            return removed_data

a_stack = Stack()
while True:
    print('push <value>')
    print('pop')
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
            print('Popped value: ', int(popped))
    elif operation == 'quit':
        break
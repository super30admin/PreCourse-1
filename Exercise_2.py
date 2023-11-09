"""
    Problem Statement: Implementing a stack using a linked list.

    Time complexity:
    push(): O(1)
    pop(): O(1)

    Space complexity: O(ll), where ll is the length of the linked list.
"""


class Node:
    def __init__(self, data):
        """Initializes the node of the linked list with data passed as the argument."""
        self.data = data
        self.next = None
 
class Stack:
    def __init__(self):
        """Initializes the head of the linked list as None."""
        self.ll = None
        self.length = 0
    
    def push(self, data):
        """Append a node at the first position of the linked list."""
        if self.ll is None:
            self.ll = Node(data)
            self.length += 1
            return data
        new_node = Node(data)
        new_node.next = self.ll
        self.ll = new_node
        self.length += 1

    def pop(self):
        """Pop a node at first position of the linked list."""
        if self.ll is None:
            return None
        popped_node = self.ll
        self.ll = self.ll.next
        popped_node.next = None
        self.length -= 1
        return popped_node.data

a_stack = Stack()

while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('quit')

    do = input('What would you like to do? ').split()

    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
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
    

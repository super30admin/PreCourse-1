# Time Complexity :
#   push: O(1)
#   pop: O(1)
# Space Complexity : O(n) where n is the number of elements in the stack
# Did this code successfully run on Leetcode : Not submitted
# Any problem you faced while coding this : No

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class Stack:
    # Stack implementation using singly linked list
    def __init__(self):
        # Initialize the top of the stack (head of the linked list)
        self.head = None

    def push(self, data):
        # Create a new node and add it to the top of the stack
        new_node = Node(data)
        new_node.next = self.head
        self.head = new_node

    def pop(self):
        # Remove and return the top item of the stack
        if self.head is None:
            return None  # Stack is empty
        popped_data = self.head.data
        self.head = self.head.next
        return popped_data

a_stack = Stack()
while True:
    # Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()
    # Give input as string if getting an EOF error. Give input like "push 10" or "pop"
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

# Time Complexity: O(1)
# Space Complexity: O(n)

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        # Initializing the head of the linked list.
        self.head = Node(None)
        
    def push(self, data):
        if self.head == None:
            self.head = Node(data)      # Creates head node if it is popped already. 
        else:
            node = Node(data)           # Creates a new node
            node.next = self.head       # Points the new node to the head of the entire stack.
            self.head = node            # Make the new node as the head of the stack.

    def pop(self):
        if self.head == None:
            return None
        else:
            value = self.head.data
            self.head = self.head.next
            return value
        
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

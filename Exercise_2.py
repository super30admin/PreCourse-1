"""
1. Push
    Time complexity: O(1) - constant number of pointer updates
    regardless of stack size.
    
    Space complexity: O(1) - one new node is allocated per call;
    does not depend on the current size of the stack.

2. Pop
    Time complexity: O(1) - constant number of pointer updates
    regardless of stack size.
    
    Space complexity: O(1) - one new node is allocated per call;
    does not depend on the current size of the stack.
"""
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        self.size = 0
        
        
    def push(self, data):
        """
        Approach: Create a new node, point its `next` at the
        current head (the old top of the stack), then make the
        new node the head. This inserts at the front of the
        linked list, which is O(1) since no traversal is needed.
        """
        new_node = Node(data)
        new_node.next = self.head
        self.head = new_node
        self.size += 1

    def pop(self):
        """
        Approach: Check if the stack is empty. If not, remove the head node
        (the top of the stack) and return its data. Update the head to point
        to the next node in the list.
        """
        if self.head is None:
            return None
        data = self.head.data
        self.head = self.head.next
        self.size -= 1
        return data

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

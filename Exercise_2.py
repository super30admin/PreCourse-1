// Time Complexity :
# Both push and pop operation requires O(1) running time

// Space Complexity :
# This has a space complexity of O(n).

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None            # Initialise empty Stack
    def push(self, data):
        new_node = Node(data)
        new_node.next = self.head        # Creating a new node and updating the pointer head
        self.head = new_node
        
    def pop(self):
        if self.head is None:
            return None
        else:
            pop_value = self.head.data
            self.head = self.head.next           # Popping the element if it is not empty
            return pop_value
        
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
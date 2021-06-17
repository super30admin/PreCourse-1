class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        """
        Initialize a head node with None
        """
        self.head = None
    
    def push(self, data):
        """
        Function to perform push operation
        Takes O(1) time.
        """
        self.add_node = Node(data)
        self.add_node.next = self.head
        self.head = self.add_node
        
    def pop(self):
        """
        Function to perform pop operation
        Takes O(1) time.
        """
        if self.head:
            self.popped = self.head
            self.head = self.popped.next
            return self.popped.data
        
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

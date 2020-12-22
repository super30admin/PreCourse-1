class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        
    def push(self, data):
        # check if linked list is empty else insert new node
        if not self.head:
            self.head = Node(data)
        else:
            # new node should be placed before existing nodes to replicate stack
            newNode = Node(data)
            newNode.next = self.head
            # change head pointer to new node as the list starts from here now!
            self.head = newNode

    def pop(self):
        # check if linked list is empty, if yes return None
        if not self.head:
            return None
        else:
            # retrieve node to be popped from head pointer
            popNode = self.head
            # change head pointer to next available node or None as current head node will be popped
            self.head = self.head.next
            # disassociate popped node with our linked list
            popNode.next = None
            # return value of the popped node
            return popNode.data
        
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

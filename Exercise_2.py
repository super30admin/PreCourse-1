class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        
    def push(self, data):
        if self.head == None:
            self.head = Node(data)
        else:
            nnode = Node(data)
            nnode.next = self.head
            self.head =nnode
        
    def pop(self):
        # if stack is empty, return None
        if self.head == None:
            return None
        else: 
            # remove head and make next node the new head
            pnode = self.head
            self.head = self.head.next
            pnode.next = None
            return pnode.data
        
a_stack = Stack()
while True:
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()
 
    operation = do[0].strip().lower()
    if operation == 'push':
        a_stack.push(int(do[1]))
        print('Pushed value: ', int(do[1]))
    elif operation == 'pop':
        popped = a_stack.pop()
        if popped is None:
            print('Stack is empty.')
        else:
            print('Popped value: ', int(popped))
    elif operation == 'quit':
        break

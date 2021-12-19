class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None #Initializing top of stack to None
        
    def push(self, data): #this method adds node to the stack
        if self.head is None: #if stack is empty then add node and point the head of node to the node address
            self.head = Node(data)
        else:
            new_node = Node(data) #else add new node to the beginning
            new_node.next = self.head
            self.head = new_node
        
    def pop(self): #this method removes node from the stack
        if self.head is None: #If there are no nodes then stack is empty and retrn none
            return None
        else: #else return the value of the node that is popped
            node_popped = self.head.data
            self.head = self.head.next
            return node_popped
        
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
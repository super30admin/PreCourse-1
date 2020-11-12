class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:

 # initializing head to None
    def __init__(self):
        self.head=None

 # Insert the elements      
    def push(self, data):
        if self.head==None:   #First element insertion: if head is empty/None the element is stored
            self.head=Node(data)
        else:
            nextnode=Node(data)   #After first element for remaining head helps in pushing the elements.
            nextnode.next=self.head #The link/address field of the new node created will point to head and head will than point to Node
            self.head=nextnode

  # Retrieves the elements      
    def pop(self):
        if self.head == None: 
            return None
        else:
            nextnode=self.head   
            self.head=self.head.next
            nextnode.next=None
            return nextnode.data

        
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
            break
        else:
            print('Popped value: ', int(popped))
    elif operation == 'quit':
        break

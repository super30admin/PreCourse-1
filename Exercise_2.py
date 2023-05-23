
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top = None #Its the top node or the head of the linked list
        
    def push(self, data):
        #For pushing a new node into the stack, we have to create a new node first
        new_node = Node(data)   #Creating a new node.
        #Then we'll check if the stack is empty or not. 
        #If the stack is empty then the node we are pushing we'll be the new top; otherwise, It'll point to the top node and then we have to set it as new top
        if self.top is None:
            self.top = new_node
        else:
            new_node.next = self.top
            self.top = new_node
        
    def pop(self):
        #In pop we have to pop a value and return the value if any.
        #Checking if the stack is not empty
        if self.top is None:
            return None  #Nothing to pop if the stack is empty
        else:
            popped = self.top.data #popped will contain the popped value
            self.top = self.top.next #And the new top will be the next node
            return popped
        
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

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top= None

    def push(self, data):
        # Defining a node with the data.
        node= Node(data= data)

        # Check if this is a first node.
        if self.top== None:
            self.top= node
            return
            # If not then set new element as current top and previous element as next.
        current_top= self.top
        self.top=  node
        self.next= current_top
        #print(self.top.data)

    def pop(self):
        # If there are no nodes.
        if self.top==None:
            return
        # If there is one node.
        if self.top.next==None:
            self.top= None
            return
        print(self.top)
        second_last_ptr= self.top.next
        del self.top
        self.top= second_last_ptr
    
a_stack = Stack()
while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('peek')
    print('quit')
    do = input('\nWhat would you like to do? ').split()
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    operation = do[0].strip().lower()
    if operation == 'push':
        a_stack.push(int(do[1]))
    elif operation == 'pop':
        popped =a_stack.pop()
        if popped is None:
            print('Stack is empty.')
        else:
            print('Popped value: ', int(popped))
    elif operation == 'quit':
        break
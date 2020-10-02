class Node:
    def __init__(self, data):
       self.data = data
       self.next = None

class Stack:
    def __init__(self):
        self.top = Node(0) #initialize stack with a head node with some value 0

    def push(self, data):
        if self.top == None:
            self.top=Node(data)
        else:
            new = Node(data)
            new.next = self.top #push new node to top
            self.top=new #make the new node the top node

    def pop(self):
        if self.top==None:
            return None
        else:
            n = self.top
            self.top = self.top.next #make the popped node's next node as top
            pop_value = n.data
            del(n) # delete popped node
            return pop_value


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

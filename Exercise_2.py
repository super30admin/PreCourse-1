class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.start_node = None


    def push(self, data):
        if self.start_node == None:
            self.start_node = Node(data)
        else:
            new_head = Node(data)
            new_head.next = self.start_node
            self.start_node = new_head     #new node is now top of stack


    def pop(self):
        if(self.start_node != None and self.next != None):      #if more than one node in stack
            remove = self.start_node
            self.start_node = self.start_node.next
            remove.next = None

            remove.data
        elif(self.start_node != None and self.next == None):    #if only one node in stack
            self.start_node = None

        else:
            None
#edited

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

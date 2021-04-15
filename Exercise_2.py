class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.stack = Node(None)

    def push(self, data):
        # append at the front of the linked list
        # first create a linked  list node
        node = Node(data)
        # append the node to the existing linked list
        node.next = self.stack
        # make this new node as the head of linked list now
        self.stack = node

    def pop(self):
        if self.stack:
            # pop from the linkedlist only if the linked list is non -empty
            _node = self.stack
            self.stack = self.stack.next
            # make the next of the popped node as None
            _node.next = None
            return _node.data
        else:
            return None

        
a_stack = Stack()
while True:
    print('push <value>')
    print('pop')
    print('quit')
    # Had to change it to raw_input as I have python version 2.7 on my PyCharM IDE and the API is raw_input in lieu of input()
    do = raw_input('What would you like to do? ').split()

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
    else:
        print("unidentified input")

'''
Output - 
push <value>
pop
quit
What would you like to do? push 3
push <value>
pop
quit
What would you like to do? pop
('Popped value: ', 3)
push <value>
pop
quit
What would you like to do? pop
Stack is empty.
push <value>
pop
quit
What would you like to do? pop
Stack is empty.
push <value>
pop
quit
What would you like to do? pop
Stack is empty.
push <value>
pop
quit
What would you like to do? pop
Stack is empty.
push <value>
pop
quit


'''

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top = None     # acts as head as well as top of stack

    def push(self, data):
        if self.top is None:    # check for the linked list being empty
            self.top = Node(data)
        else:                   # otherwise just make the head as top element and connect it to the previous linked list
            curr_node = Node(data)
            curr_node.next = self.top
            self.top = curr_node

    def pop(self):
        if self.top is None:    # check for the linked list being empty
            return None
        else:                   # otherwise just shift the head or top element to the next node.
            popped_node = self.top
            self.top = self.top.next
            return popped_node.data

        
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

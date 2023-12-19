
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top = None
        
    def push(self, data):
        #adding an item to the top of the stack so it gets added to the beginning of the Linked List
        if self.top == None:
            self.top = Node(data)
        else:
            new_node = Node(data)
            new_node.next = self.top #making the new node the first node
            self.top = new_node
        
    def pop(self):
        #Removing and returning the top element from the stack
        if self.top == None:
            return None
        else:
            # remove the head node and make the preceding one the next node
            pop_item = self.top
            self.top = self.top.next
            pop_item.next = None
            return pop_item.data
        
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

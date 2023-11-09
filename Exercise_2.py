# Time Complexity : O[1]
# Space Complexity : O[1]
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        # Initialize head of the linked list
        self.head = None

    def push(self, data):
        if self.head is None:
            # Instantiate the head with a new node
            self.head = Node(data)
        else:
            # set next of new node as head 
            # set head as the new node
            node = Node(data)
            node.next = self.head
            self.head = node
        
    def pop(self):
        if self.head is None:
            # if LL is empty return none
            return self.head
        else:
            node = self.head
            self.head = self.head.next
            return node.data
        
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

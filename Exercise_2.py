class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None

    def isEmpty(self):
        '''
        Check if head is None and return 1 or 0
        '''
        if self.head is None:
            return 0
        else:
            return 1

    def push(self, data):
        '''
        Check if head is None and make node as head
        else create new node and point that to the
        current head, change head to this new Node.
        O(1) Complexity
        '''
        if self.head is None:
            self.head = Node(data)
        else:
            temp = Node(data)
            temp.next = self.head
            self.head = temp

    def pop(self):
        '''
        Check if empty, if not empty
        move head = head.next and return
        the value of the item popped.
        O(1) Complexity
        '''
        if self.isEmpty():
            data = self.head.data
            self.head = self.head.next
            return data
        else:
            return None


        
a_stack = Stack()
while True:
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()
 
    operation = do[0].strip().lower()
    if operation == 'push':
        a_stack.push(int(do[1]))
        a_stack.prints()
    elif operation == 'pop':
        popped = a_stack.pop()
        if popped is None:
            print('Stack is empty.')
        else:
            print('Popped value: ', int(popped))
    elif operation == 'quit':
        break

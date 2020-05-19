class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None

    #O(1) Time Complexity
    def push(self, data):
        dataToAdd = Node(data)
        if self.head is None:
            self.head = dataToAdd
        else:
            dataToAdd.next = self.head
            self.head = dataToAdd
    #O(1) Time Complexity
    def pop(self):
        if self.head:
            dataToReturn = self.head.data
            if self.head.next is None:
                self.head = None
            else:
                self.head = self.head.next
            return dataToReturn
        
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

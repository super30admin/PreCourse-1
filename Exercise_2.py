""" In the push() function, we create a new node named temp and attach this to the front of the linked list.
This is done by pointing the temp.next pointer to the current head and changing the head to temp.
The time complexity for this is O(1) since traversal through the Linked List is not required.
The pop() function stores the current head's value in a temp variable.
It then sets the head as the immediate next element after the current head and returns the temp variable.
The time complexity for this is again O(1). """

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        
    def push(self, data):
        temp = Node(data)
        temp.next = self.head
        self.head = temp
        
    def pop(self):
        top = None
        if(self.head!=None):
                top = self.head.data
                self.head = self.head.next
        return top
        
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
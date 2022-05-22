'''
Time Complexity: O(1) for all operations
Space Complexity: O(n) where n is number of elements
Problems: To implement a linked list such that pushing
         and popping both takes constant time
'''

'''
Program to implement Stack 
using Linked List
'''

'''
Class node
to initialize a
node in the list
'''
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
'''
Class to implement
operations on list 
to represent a stack
'''
class Stack:
    '''
    Function to initialize
    stack
    '''
    def __init__(self):
        self.head = None
        self.size = 0
    
    '''
    Function to push
    element to the stack
    '''
    def push(self, data):
        node = Node(data)
        node.next = self.head
        self.head = node
        self.size += 1
    
    '''
    Function to pop 
    an element from
    the stack
    '''
    def pop(self):
        if self.size == 0:
            return None
        else:
            val = self.head.data
            self.head = self.head.next
            self.size -= 1
            return val
        
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

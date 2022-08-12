# Time Complexity : O(1) The time complexity for all push(), pop(), and peek() operations is O(1)
#Space Complexity : O(n) where n is the size of the stack
#Did this code successfully run on Leetcode : not present on leetcode
#Any problem you faced while coding this : No

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        
    def push(self, data):             # push the node at the starting of the stack
        if (self.head == None) :
            self.head = Node(data)
        else:
            newnode = Node(data)
            newnode.next = self.head
            self.head = newnode
        
    def pop(self):                     # returns the node at the top
        if (self.head == None):
            return None
        else:
            popnode = self.head
            self.head = self.head.next
            popnode.next = None
            return popnode.data
        
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
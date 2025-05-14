# Time Complexity: push and pop is O(1)
# Space Complexity: O(n), n is the no.of elements in the stack


# Your code here along with comments explaining your approach
"""
stack follows the LIFO principle
I have implemented the stack using linked list considering the head as top
adding or removing a head of linked list is O(1) and we don't need to store tail node also
"""

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.counter = 0
        self.head = None
        
    def push(self, data):
        new_node = Node(data)
        
        if self.head:
            new_node.next = self.head
        self.head = new_node
        
        self.counter += 1
        
        
    def pop(self):
        if self.counter:
            popped_data = self.head.data
            self.head = self.head.next
            self.counter -= 1
            return popped_data
            
        return None
        
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

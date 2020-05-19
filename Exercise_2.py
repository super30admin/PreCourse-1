"""
// Time Complexity :  O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : problem not there on Leetcode
// Any problem you faced while coding this : No
"""

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.my_stack = None #initializing my_stack as None
        
    def push(self, data):
        node = Node(data) #create new node 
        node.next = self.my_stack # attaching the node at the beginning by adding the pre-existing LL in the next variable of the new node
        self.my_stack = node #setting head of my_stack to point at the new node
        
    def pop(self):
        #if self.my_stack==None:
        #   return None
        rem = self.my_stack.data #storing the value about to be deleted in a variable
        self.my_stack = self.my_stack.next #setting the head of my_stack to node next in sequence
        return rem
        
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

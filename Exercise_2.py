# Time Complexity : O(1)
# Space Complexity : O(n) where n is the size of the array
# Did this code successfully run on Leetcode : didnot try on leetcode
# Any problem you faced while coding this : no

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
    
class Stack:
    def __init__(self):
        self.top=None
        
    def push(self, data):
        if(self.top==None):
            self.top=Node(data)
        else:
            node=Node(data)# creating a new object of class node
            node.next=self.top # adding the new node to the top of the stack
            self.top=node
        
    def pop(self):
        if (self.top== None): # checking if the stack is empty
            return None
        else:
            data=self.top.data
            self.top=self.top.next # storing the address of the next node in top
            return data
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
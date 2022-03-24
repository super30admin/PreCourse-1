""" 
Time Complexity : O(1) for push and pop
Space Complexity :O(n) for maintaining a list
Did this code successfully run on Leetcode :Yes
Any problem you faced while coding this :No
"""
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None

class Stack:
    def __init__(self):
        self.top = None

    def push(self,data):
        if self.top == None:
            self.top= Node(data)
        else:
            newnode = Node(data)
            newnode.next = self.top
            self.top = newnode

    def pop(self):
        if self.top == None:
            return "Stack is empty"
        else:
            poppednode = self.top
            self.top = self.top.next
            poppednode.next= None
            return poppednode.data
        
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
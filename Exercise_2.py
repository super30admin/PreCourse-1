# Time Complexity: push, pop- O(1)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : -
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
"""Implmented a stack using Linkedlist"""

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = Node(None)
        self.current = None
        self.next = None
        
    def push(self, data):
        temp = self.head
        self.head = Node(data)
        self.head.next = temp
        
    def pop(self):
        temp = self.head.data
        
        if temp != None:
            self.head= self.head.next
        
        return temp

        


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


#Time Complexity : o(1)
#Space Complexity : o(1)
#Did this code successfully run on Leetcode : yes
#Any problem you faced while coding this :


#Your code here along with comments explaining your approach

from hashlib import new

#Create Class Node with varible data & next
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 #create stack with head variable
class Stack:
    def __init__(self):
        self.head = None
        
    def push(self, data):
        if self.head is None:
            self.head = Node(data)
            return
        self.head = Node(data, self.head)
            
      #pop returns data & returns None if no nodes  
    def pop(self):
        if self.head is None:
            return None
        else:
            popped = self.head.data
            self.head = self.head.next
            return popped
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

'''

Time Complexity : 
  push - O(1)
  pop - O(1)

Space Complexity : O(N) - All functions has O(1) Space Complexity

Did this code successfully run on Leetcode : Yes

Your code here along with comments explaining your approach:

Used in-built python list and its functions for purposes of stack.

'''
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top = None
        
    def push(self, data):
        if not self.top:
            self.top = Node(data)
        else:
            newtop = Node(data)
            newtop.next = self.top
            self.top = newtop
        
    def pop(self):
        if not self.top:
            return None
        temptop = self.top
        retval = temptop.data
        self.top = self.top.next
        del temptop
        return retval
        
        
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

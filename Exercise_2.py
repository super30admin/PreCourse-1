"""
#Time Complexity :
Push/Pop: O(1)

#Space Complexity :
O(n), where n is the size of the stack

#Did this code successfully run on Leetcode :

N/A


#Any problem you faced while coding this :

  added a dummy node to avoid Null-related errors
"""

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.dummyHead = Node(None)
        self.head = self.dummyHead
        
    def push(self, data):
        newNode = Node(data)
        newNode.next = self.head
        self.head = newNode
        
    def pop(self):
        if self.head == self.dummyHead:
            # print("stack underflow")
            return None
        popped_data = self.head.data
        self.head = self.head.next
        return popped_data
        
        
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

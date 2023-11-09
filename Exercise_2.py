#Time Complexity O(1)
#Space Complexity O(1)
#Did this code successfully run on Leetcode : Yes
  #Any problem you faced while coding this : No 
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head=None
        
    def push(self, data):
        if self.head is not None:
            node=Node(data)
            node.next=self.head
            self.head=node
        else:
            self.head=Node(data)
        
    def pop(self):
        if self.head is not None:
            val=self.head.data
            self.head=self.head.next
            return val
        else:
            return self.head
        
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

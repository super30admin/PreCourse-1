# Time Complexity : O(1) for both push and pop 
# Space Complexity : size of linked list
# Did this code successfully run on Leetcode : 
# Any problem you faced while coding this : N0
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        
    def push(self, data):
        if self.head == None:
            self.head=Node(data)
             
        else:
            newnode = Node(data)
            newnode.next = self.head
            self.head = newnode
    def isempty(self):
        if self.head == None:
            return True
        else:
            return False
        
    def pop(self):
        if self.isempty():
            return None
             
        else:
            poppednode = self.head
            self.head = self.head.next
            poppednode.next = None
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

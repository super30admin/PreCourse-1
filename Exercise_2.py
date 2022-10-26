
from email import header
#time complexity: push-O(1), pop-O(1)
#space complexity: O(n)
#run on leetcode successfully:yes
#No difficulties faced

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head=None
        
    def push(self, data):
        node=Node(data)
        if(self.head==None):
            self.head=node
        else:
            node.next=self.head
            self.head=node
        
    def pop(self):
        if(self.head==None):
            return self.head
        else:
            temp=self.head
            ans=self.head.data
            self.head=self.head.next
            del(temp)
            return ans
        
        
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

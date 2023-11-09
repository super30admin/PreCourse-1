#Time Complexity:O(1)
#Space Complexity:O(1)
#Did this code successfully run on Leetcode : Question not avaliable in Leetcode
#Any problem you faced while coding this : None
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.stackListHead=Node(data=None)
        
    def push(self, data):                   #time---O(1)  space--O(1)
        newNode=Node(data)                  #push-Insert at first in the linked list
        if self.stackListHead:
            newNode.next=self.stackListHead
        self.stackListHead=newNode
        
    def pop(self):                          #time---O(1)  space--O(1)
        if self.stackListHead:              #pop-Delete at first in the linked list 
            x=self.stackListHead.data
            if self.stackListHead.next==None:
                self.stackListHead=None
            else:
                self.stackListHead=self.stackListHead.next
            return x
        else:
            return None


        
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

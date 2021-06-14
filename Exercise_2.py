class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.cur=None
        
    def push(self, data):
        curNode=Node(data)
        curNode.next=self.cur
        self.cur=curNode
        
    def pop(self):
        if self.cur==None:
            return None
        val=self.cur.data
        self.cur=self.cur.next
        return val
        
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
"""
Time complexity for push/Pop-(O(1))
Space complexity- without the linkedlist space, O(1)-with linkedlist O(n)
"""


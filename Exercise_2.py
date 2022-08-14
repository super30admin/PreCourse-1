# Time Complexity : O(1)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode :
# Any problem you faced while coding this : None


# Your code here along with comments explaining your approach


class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
       
class linkedlist:
    def __init__(self):
         self.head=None
         
    def __iter__(self):
        cur = self.head
        while cur:
            yield cur
            cur = cur.next

class Stack:
    def __init__(self):
        self.stack = linkedlist()
    def isEmpty(self):
        if self.stack.head is None:
            return True
        else:
            return False
        
    def push(self, data):
        node = Node(data)
        node.next = self.stack.head
        self.stack.head = node
        
    def pop(self):
        if self.isEmpty():
            return None
        else:
            value = self.stack.head.data
            self.stack.head = self.stack.head.next
            return value
            
        
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

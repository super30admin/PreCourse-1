

# Time Complexity :
"""
Push : O(1)
Pop : O(1)
"""
# Space Complexity :
"""
Stack object memory O(n)
"""
# Did this code successfully run on Leetcode :
"""
"""
# Any problem you faced while coding this :
"""

"""

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.llist_head = None

    def push(self, data):
        if self.llist_head == None:
            new_node = Node(data)
            self.llist_head = new_node
        else:
            new_node = Node(data)
            new_node.next = self.llist_head
            self.llist_head = new_node

    def pop(self):
        if self.llist_head == None :
            return
        else:
            val = self.llist_head.data
            self.llist_head = self.llist_head.next
            return val
        
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

# Time Complexity : O(1)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : No
# Any problem you faced while coding this : No

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        # Initializes stack by creating an empty object "head" of type Node
        self.head = Node(None)
        
    def push(self, data):
        # If head is still in initialized state, then new item is directly assigned to it
        # else the new item is made the new head and rest of the stack get assigned to next pointer of it
        if self.head == None:
            self.head = Node(data)
        else:
            newNode = Node(data)
            newNode.next = self.head
            self.head = newNode

    def pop(self):
        # if head is not an empty node, head is made empty and next pointer is made the new head
        if self.head.next:
            self.poppedVal = self.head.data
            self.head = self.head.next
            return self.poppedVal
        
        
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

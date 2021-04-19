# Implement Stack using Linked List
'''

 Implement Singly Linked List.

push and pop operation
Time Complexity : O(1)
Space Complexity : O(1)
Did this code successfully run on Leetcode : could not find in leetcode
Any problem you faced while coding this : Got confused to which order to look for. FIFO OR LIFO. 
Then read that both are fine.
Your code here along with comments explaining your approach'''


class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
 
# adds node to the front of the linked list
    def push(self, data):
        if self.head is None:
            self.head = Node(data)
        else:
            new_node = Node(data)
            new_node.next =self.head
            self.head = new_node

    # returns the node from the start of the linked list  and removes that node. 
    def pop(self):
        if self.head is None:
            return None
        else:
            popped = self.head.data
            self.head = self.head.next
            return popped
        
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

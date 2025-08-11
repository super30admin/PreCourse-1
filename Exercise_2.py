# Time Complexity: O(1)
# Space Complexity: O(n) for n nodes
# Did this code successfully run on Leetcode : N/A
# Any problem you faced while coding this : No

#Your code here along with comments explaining your approach
#Use a Node class with data and next pointers to store each stack element.
#Track the top of the stack with a head pointer in the Stack class.
#Push: Create a new node, link it to the current head, then update head to the new node (O(1)).
#Pop: Return the head’s data, move head to head.next (O(1)), and handle empty case.

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top = None # top of stack
        
    def push(self, data):
        # Insert new node at head (top)
        node = Node(data)
        node.next = self.top
        self.top = node
        
    def pop(self):
        # Remove and return head (top)
        if self.top is None:
            return None
        val = self.top.data
        self.top = self.top.next
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

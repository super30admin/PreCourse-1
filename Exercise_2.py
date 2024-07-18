# Time Complexity : O(1)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode :
# Any problem you faced while coding this : Nothing

# Your code here along with comments explaining your approach
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top = None

    def push(self, data):
        """
        Add a new element to the top of the stack.
        Takes O(1) time.
        """
        new_node = Node(data)
        new_node.next = self.top
        self.top = new_node

    def pop(self):
        """
        Remove and return the top element of the stack.
        Takes O(1) time.
        """
        if self.top is None:
            return None
        popped_node = self.top
        self.top = self.top.next
        return popped_node.data

# Main block to handle user input and perform stack operations
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

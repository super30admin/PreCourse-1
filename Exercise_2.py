# Time Complexity : O(N), N being the number of executions
# Space Complexity : 0(N), N being the number of executions

# Did this code successfully run on Leetcode : Did not find a similar 
# problem on leetcode. 

# Any problem you faced while coding this : Had to be a little creative. 
# Initial attempt resulted in essentially an O(N) per execution
# because the linked list would have had to move all the way to the
# end to find the last in the stack. 


# Your code here along with comments explaining your approach
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    '''Initializes the linked list. Will used the linked list as 
    reverse array so that push and pop are done from the front of 
    the linked list. The front of the linked list is the "stack_end"
    '''
    def __init__(self):
        self.stack_end = Node(None)

    '''Creates a node and makes it the new "stack_end" node. '''    
    def push(self, data):
        new_node = Node(data)
        new_node.next = self.stack_end
        self.stack_end = new_node

    '''Takes node from the beginning of linked list and returns it. 
    New beginning of node is the next node in linked list. '''    
    def pop(self):
        temp = self.stack_end
        self.stack_end = self.stack_end.next
        return temp.data

        
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

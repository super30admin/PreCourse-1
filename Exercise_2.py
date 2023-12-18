# Time Complexity : all operations  have a time complexity of O(1)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : Ran Locally 
# Any problem you faced while coding this : No
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top = None
        #initialize our stack, we set a pointer to the top of the stack with the value of none
    def push(self, data):
        node = Node(data) # we create a node wth the input data
        node.next = self.top # we set the node to point to the current top node
        self.top = node # updating the top pointer to point to our new node
    def pop(self):
        if self.top is None:
            return self.top  # if the stack is empty we will return the top pointer which will be none
        data_pop = self.top.data # identifying the value of our top node
        self.top = self.top.next # top pointer will now point to the next node in the stack
        return data_pop
        
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

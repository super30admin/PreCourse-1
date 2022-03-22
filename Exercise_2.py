
# // Time Complexity : O(1)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :No


class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top = None #initialize the top of the stack as None
        
    def push(self, data):
        node = Node(data)
        node.next = self.top #connect the new node with the previous node
        self.top = node     #settng the top node to the new node

    def pop(self):
        if self.top == None:
            return None
        else:
            node_to_pop = self.top
            self.top = self.top.next # set the top node to the one below the previous top
            return node_to_pop.data     #returning the data of the popped node
        
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

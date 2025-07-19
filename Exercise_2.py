#Time Complexity :O(1)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : did not find this on leetcode
#Any problem you faced while coding this : syntax issues
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top=None  # top of the list is still not pointing to anything
        
    def push(self, data):
        created_node=Node(data)  #create a new node 
        created_node.next=self.top  #link the new node created to the top of the exisiting list
        self.top=created_node  #top is pointing to the newly created node 
        
    def pop(self):
        if self.top is None: # if the list is empty pop nothing
            return None
        val=self.top.data # extract the value
        self.top=self.top.next #point top to the next value
        return val #  return this value
        
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

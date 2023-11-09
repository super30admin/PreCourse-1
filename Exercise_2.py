# Time Complexity : O(1) for all functions
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : N/A
# Any problem you faced while coding this : No

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.stack = list()
      
    def push(self, data): 
        # Creating new node and appending it the stack
        new_node = Node(data)
        if(len(self.stack)==0):
            # if stack empty then appending directly
            self.stack.append(new_node)
        else:
            # if stack not empty then pointing current top to new node and then appending new node
            self.stack[-1].next = new_node
            self.stack.append(new_node)   
        
    def pop(self):
        if(len(self.stack)==0):
            # if empty them returning null
            return None
        elif(len(self.stack)>1):
            # if length of stack>1 then pointing second last element to null and then poping last element
            self.stack[-2].next = None
            return self.stack.pop().data
        else:
            # directly poping last element
            return self.stack.pop().data

            

        
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

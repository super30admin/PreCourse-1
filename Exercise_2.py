# Time Complexity : O(1) for both push and pop
# Space Complexity : O(1) for both push and pop
# Did this code successfully run on Leetcode : Code ran successfully. Did not check for any such problem in leetcode but in general the code ran well for all functions.
# Any problem you faced while coding this : No problems

# Your code here along with comments explaining your approach
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None # Initializing head to None
         
    def push(self, data):
        if self.head == None:
            self.head = Node(data) # If the linked list is empty then we create a new node and assign it to head
        else:
            curr_node = Node(data) # Creating a new node curr_node with value data as given in the parameter
            curr_node.next = self.head # Assigning the head as the next value of curr_node. We do this because the current new node should be at top of the stack
            self.head = curr_node # Assigning the current new node as head i.e making the new node as element at the top of the stack
        return
    def pop(self):
        if self.head == None:
            return None # If linked list is emtpy return none for stack underflow case
        else:
            prev_node = self.head # Assigning current head i.e top of the stack to a node named prev_node. We aim to pop this node
            self.head = self.head.next #Assigning the next element as head
            prev_node.next = None # Making the next element of prev node None, so virtually we are removing prev_node from the linked list
            return prev_node.data 

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

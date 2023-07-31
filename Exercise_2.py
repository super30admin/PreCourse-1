# Time Complexity : O(1) for all operations
# Space Complexity: O(1) since it uses a constant amount of extra space regardless of the number of elements in the stack.
# Any problem you faced while coding this : No

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        
    def push(self, data):
        newnode = Node(data) #Initializing the new node
        newnode.next = self.head #Pointing the new node to the previous head
        self.head = newnode #Assigning the new node as a new head
        
    def pop(self):
        if self.head is None:
            return None #If stack is empty, return None
        else: 
            popval = self.head.data #Storing the head value into a variable
            self.head = self.head.next #Assigning the next value as the new head
            return popval #Return the popped value
        
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

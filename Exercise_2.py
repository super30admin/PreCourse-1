#Time complexity: O(1)
#Space complexity: O(n)

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    
    def __init__(self): # inititalise the head of the linked list
        self.head = None

    def push(self, data): # if the head is empty initialise it with the new data
        if not self.head:
            self.head = Node(data)
        
        else: # else make a new node of the data and make it the top element of the list and thats the new head
            newNode = Node(data)
            newNode.next = self.head
            self.head = newNode
            
    def pop(self):
        if self.head: # store the head in a variable and the new head is the next of head. 
            element = self.head
            self.head = self.head.next
            return element.data # return the popped element

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

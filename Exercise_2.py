
# PreCourse_1: Exercise_2 : Implement Stack using Linked List.

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        
    def push(self, data):               
        if self.head == None:
            self.head = Node(data)
        else:                           #Newly Inserted data node becomes the head
            temp = Node(data)
            temp.next = self.head
            self.head = temp      

    def pop(self):                      #returns the value of the head node
        if self.head == None:
            return None
        else:
            popped_val = self.head
            self.head = self.head.next
            popped_val.next = None
            return popped_val.data

a_stack = Stack()

while True:
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()         #split() converts a string into a list splitting at the space
 
    operation = do[0].strip().lower()                         #strip() removes empty spaces in the string                

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

#Space Complexity: O(n) where n is the number of elements
#Time Complexity: O(1)
#The code did run successfully for all the functions


class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        
    def push(self, data):
        if self.head:                               #checking if the stack exists
            new_node = Node(data)                   #creating new element at the top
            new_node.next = self.head               #adding new element at the top by shifting the head node to be present after the new node
            self.head = new_node
        else:
            self.head = Node(data)

    def pop(self):
        if self.head:                               #checking if the stack exists
            popped_node = self.head.data            #removing topmost element
            self.head = self.head.next              #changing the head node to be its next node
            return popped_node
        else:
            return None
        
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

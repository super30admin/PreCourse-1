
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top = None # this is the top node
    def push(self, data): # O(1) time  and O(1) space
        new_node = Node(data) # create a new node
        new_node.next = self.top # move the top to the new_node next 
        self.top = new_node # new node becomes a new top

    def pop(self): # O(1) time and space
        if self.top is None:
            raise IndexError("Empty stack")
        value_pop = self.top.data # get the value  
        self.top = self.top.next # move to the next node 
        return value_pop

        
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

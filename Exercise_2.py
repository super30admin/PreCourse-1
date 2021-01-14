class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
      # head is null when the node is intialized
        self.head = None

    def push(self, data):
      # check if the stack is empty
      if self.head == None:
        # create a new node and assign it to the head of list
        self.head = Node(data)
      # if the stack is not empty
      else:
        # create a new node
        new_n = Node(data)
        # add the new node at the beginning of the list
        new_n.next = self.head
        # replace the previous head of list with the new node
        self.head = new_n
        
    def pop(self):
      # check if stack is empty
      if self.head == None:
        return None
      # if the satck is not empty
      else:
        # pop the element at the beginning of the list(LIFO)
        # as the new element is being pushed into at the beginning of the list
        # assign head of the list to a new node
        node_p = self.head
        # assign the next element to the head as the head node
        self.head = self.head.next
        # remove the node from the list by pointing it to null
        node_p.next = None
        # return the value of the node to be popped
        return node_p.data

a_stack = Stack()
while True:
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()
 
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
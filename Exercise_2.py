class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
      self.head = None
      self.tail = None
      self.length = 0

    def push(self, data):
      new_node = Node(data)
      if self.tail == None:
        self.tail = new_node
        self.head = self.tail
        self.length = 1
      else:
        self.head.next = new_node
        self.head = self.head.next
        self.length += 1  

    def pop(self):
      i = 1
      curr_node = self.tail
      while i != self.length-1:
        curr_node = curr_node.next
        i +=1
      popped_value = curr_node.next
      curr_node.next = None
      self.head = curr_node
      self.length -= 1
      return popped_value.data 

        
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

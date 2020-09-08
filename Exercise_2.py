class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
      self.head = None
    
    def isEmpty(self):
      return True if self.head is None else False

    def push(self, data):
      newnode = Node(data)
      newnode.next = self.head
      self.head = newnode
      print("data pushed")
        
    def pop(self):
      
      if (self.isEmpty()):
        return float("-inf")
      temp = self.head
      self.head = self.head.next
      popped = temp.data
      return popped
        
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
            print('Popped value: ', float(popped))
    elif operation == 'quit':
        break

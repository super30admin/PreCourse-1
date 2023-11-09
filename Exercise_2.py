
class Node:
  
  def __init__(self,data):
    self.data = data
    self.next = None

class Stack:

  def __init__(self):
    self.head = None

  def push(self, data):

    new_node = Node(data)
    new_node.next = self.head
    self.head = new_node

  def pop(self):
    if self.is_empty():
      return None

    temp = self.head
    self.head = temp.next
    temp.next = None
    return temp.data

  def peek(self):
    if self.is_empty():
      return None
    else:
      return self.head.data

  def is_empty(self):
    if self.head == None:
      return True
    return False

  def __str__(self):
    if self.is_empty():
      return None

    temp = self.head
    temp_list = ""
    while temp is not None:
      temp_list += str(temp.data) + " "
      temp = temp.next
    return temp_list

        
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

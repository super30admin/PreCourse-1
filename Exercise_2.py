'''
Time and space complexity:
initialization: Time -> O(1); Space -> O(1)
push(): Time -> O(1); Space -> O(1)
pop(): Time -> O(1); Space -> O(1)
'''

class Node:
  def __init__(self, data):
    self.data = data
    self.next = None

class Stack:
  def __init__(self):
    self.__head = None
    self.__size = 0

  def push(self, data):
    newNode = Node(data)
    newNode.next = self.__head
    self.__head = newNode
    self.__size += 1

  def pop(self):
    if self.__size == 0:
      return None
    popedNode = self.__head
    self.__head = popedNode.next
    self.__size -= 1
    return popedNode.data

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

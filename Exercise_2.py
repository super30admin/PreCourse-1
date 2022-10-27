'''

Time Complexity:
O(1) for push and pop operations


Space Complexity:
O(1)


'''
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.__head = None
        self.size= 0
        
    def push(self, data):
        newNode = Node(data)
        newNode.next = self.__head
        self.__head = newNode
        self.size = self.size+1
  
         
    def pop(self):
        if self.size > 0:
            popped_element = self.__head
            self.__head = self.__head.next
            self.size = self.size-1
            return (popped_element.data)
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

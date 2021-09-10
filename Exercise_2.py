class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        
class Stack:
    def __init__(self):
        self.__head = None
        self.__count = 0
        
    def push(self, data):
        new_node = Node(data)
        new_node.next = self.__head
        self.__head = new_node
        self.__count += 1
        return
        
    def pop(self):
        if self.__head == None:
            print("Empty List!")
            return
        
        popped = self.__head.data
        self.__head = self.__head.next
        self.__count -= 1
        return popped
        
        
        
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
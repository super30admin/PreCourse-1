class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = Node(None)

    def push(self, data):
        """
        Create a new node with data as data
        Set the next of the new node as head
        Point the head to the new node
        1<-2<-3
        head ->3
        new node = 4
        1<-2<-3<-4
        head -> 4
        """
        self.node = Node(data)
        self.node.next = self.head
        self.head = self.node

        
    def pop(self):
        """
        Check whether head is empty, if yes, return None
        Else point temp to head, change head to head.next and return temp.data
        """
        if self.head.data == None:
            return None
        temp = self.head
        self.head = self.head.next
        return temp.data
        
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

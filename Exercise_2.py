class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        
    def push(self, data):
        if self.head :
            current = self.head
            while current.next != None:  #insert at last
                current = current.next
            current.next = Node(data)
        else:
            self.head = Node(data)  #if stack is empty insert element at head position
            return

    def pop(self):
        if self.head:
            current = self.head
            prev = self.head
            if current.next is None:  # if only 1 element is present 
                pop_value = current.data
                self.head = None   #make head Null
                return pop_value
            while current.next!= None: # else traverse till last  and maintain 2 pointers for prev and current
                prev = current
                current = current.next
            prev.next = None   # delink current pointer from list by assinging none to prev.next
            return current.data
        else:
            print("Empty List")
            return 

        
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

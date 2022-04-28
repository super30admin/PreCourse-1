class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class Stack:
    def __init__(self):
        self.head = None
        
    def push(self, data):
        #constarint = adding/deleting element at begining of linkedlist is O(1) 
        # adding/deleting element at end of linkedlist is O(N)
        #So in this stack element is added and deleted from beggining of linked list
        
        temp = self.head
        
        new_node = Node(data)
        
    
        if self.head is None:
            self.head = new_node
            self.next = None
        else:
            self.head = new_node
            new_node.next = temp
            
            
        
    def pop(self):
        temp = self.head
        
        if self.head is None:
            print("Empty Linkedlist")
        else:
            self.head = temp.next
            return temp.data
            temp = None
        pass
    
    #display output
    def display(self):
        temp = self.head
        
        if self.head is None:
            print("Empty Linkedlist")
        else:
            while temp:
                print(temp.data,"->",end=' ')
                temp = temp.next
            print()
        
a_stack = Stack()
while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('display')
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
    elif operation == 'display':
        a_stack.display()
    elif operation == 'quit':
        break

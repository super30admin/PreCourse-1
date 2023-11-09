#Time Complexity for inserting an element into linkedlist: O(1)
#Time complexity to pop an element from beggining of linkedlist:O(1)
#Time complexity to pop an element from the end of linkedlist: O(n)
#Space complexity of linkedlist: O(1)
class Node:
    def __init__(self, data): #initializing a node of linkedlist
       self.data = data # data field of the node containing data
       self.next = None  #next field of the node containing the address of the next node
 
class Stack:
    def __init__(self):
        self.head=None # initializing head of linkedlist

    def push(self, data):
        if self.head==None: #checking if linkedlist is empty
            self.head=Node(data) # adding the node as head 
        else:
            newnode=Node(data) #initializing a new node
            newnode.next=self.head #inserting the newnode at the beginning of the linked list
            self.head=newnode 

    def pop(self):
        if self.head==None: # checking if the linkedlist is not empty
            return "No elements to pop"
        else:
            deleted=self.head.data #popping the 1st node of linked list
            self.head=self.head.next 
            return deleted
        
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

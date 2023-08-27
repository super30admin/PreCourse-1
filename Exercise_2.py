#Time Complexity:- O(1)
#Space Complexity:- O(n)
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        #Initiality No element is assigned to head
        self.head=None
        
    def push(self, data):
        #This will check if head is empty or not
        # If the head is empty newly created node will point to head Node
        if self.head is empty:
            self.head=Node(data)
        else:
            new_node=Node(data)                      
            new_node.next=self.head  #Here, address of the new node will be head Nodes address
            self.head=new_node #Here, new_node will now become head element
                   
    def pop(self):
        if self.head is None: #Check if head is None then return None
           return None
        else:
            temp=self.head.data  #Store head.data to temp
            self.head=self.temp.next #Address of temp.next will point to head
            return temp #Thus, the temp Node will be deleted by returning it
        
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

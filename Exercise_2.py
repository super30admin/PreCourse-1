
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        

    def push(self, data):
        '''This takes Time Complexity of O(1), Space Complexity of O(1)'''
        temp=Node(data)
        if(self.head==None):
            #Here we have an empty linked list
            self.head=temp
        else:
            #Here we dont have an empty linked list
            temp.next=self.head
            self.head=temp
                
    def pop(self):
        '''This takes Time Complexity of O(1), Space Complexity of O(1)'''
        if(self.head==None):
            #Here we have an empty linked list
            return None
        else:
            #Here we don't have an empty linked list
            temp=self.head
            val=temp.data
            self.head=self.head.next
            del temp
            return val
    
    #This is just additional method
    def display(self):
        print("--top--")
        temp=self.head
        while(temp!=None):
            print(temp.data)
            temp=temp.next
        print("--bottom--")

            
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
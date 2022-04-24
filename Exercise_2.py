
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head=None
        self.tail=self.head
        
        
    def push(self, data):
        ''' O(n) time complexity'''

        #case-1 if stack is empty
        newnode=Node(data)
        if self.head==None:
            self.head=newnode
            self.tail=self.head
        #case-2 if stack is not empty
        else:
            self.tail.next=newnode
            self.tail=newnode
        
        
            
        
    def pop(self):
        ''' O(n) time complexity'''
        
        #case-1 if stack is empty
        if self.head==None:
            #print('stack is empty')
            return

        #case-2 if only one element in stack
        elif self.head.next==None:
            popped_item=self.head
            self.head=None
            self.tail=self.head
            return popped_item.data

        #case-2 if stack has more than one element 
        else:
            popped_item=self.tail #store the last node in a variable (the tail of linkedlist)
            currentnode=self.head
            while currentnode.next.next!=None:
                #loop until the last but one node 
                currentnode=currentnode.next
            currentnode.next=None
            self.tail=currentnode
            return popped_item.data




        
        
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

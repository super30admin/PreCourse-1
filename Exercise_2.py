
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.start=None
        self.current=None
    
    

    def push(self, data):
        if(self.start==None):
            self.start=Node(data)
            self.current=Node(data)
        else:
            temp=Node(data)
            if(self.start.next== None): self.start.next=temp
            self.current.next=temp
            self.current=self.current.next
       

        
    def pop(self):
        if(self.start==None):
            return None
        else:
            travnode=self.start
            if travnode.next== None:
                self.start=None
                return travnode.data
            else:
                while travnode.next is not None:
                    prevnode=travnode
                    travnode=travnode.next
                    
                prevnode.next=None
                return(travnode.data)
            
        
    # def show(self):
    #     travnode=self.start
    #     while travnode.next is not None:
    #         print(travnode.data)
    #         travnode=travnode.next


        




        
        
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

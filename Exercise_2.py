#O(1) for all
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head=None
    def push(self, data):
    #insert newnode at start
        if not self.head:
            #if very first value in list, make it as head
            newNode=Node(data)
            self.head=newNode
        else:
            
            #push by making newnode's next point to original head
            # make newnode as your head
            newNode=Node(data)
            newNode.next=self.head
            self.head=newNode

    def pop(self):
    #remove node from start
        #if head is present>pop it and make head as next node in list
        if self.head:
            pop=self.head
            self.head=self.head.next
            pop.next=None
        return pop.data
   
               
        
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

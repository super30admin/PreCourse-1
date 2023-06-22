
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head=None
        n=self.head

    #Time Complexity : O(N)
    #Space Complexity : O(N)
    def push(self, data):
        newNode=Node(data)
        if self.head is None:
            self.head=newNode
        else:
            n=self.head
            while n.next is not None:
                n=n.next
            n.next=newNode

    #Time Complexity : O(N)
    #Space Complexity : O(N)   
    def pop(self):
       popped=None
       if self.head is None:
            print("List is Empty")
            popped = self.head.data
            self.head = None
            return None
       else:
            n = self.head
            while n.next is not None:
                if n.next.next is None:
                    popped = n.next.data
                    n.next = None
                else:
                    n = n.next
            return popped
            
    #Time Complexity : O(N)
    #Space Complexity : O(N)
    def show(self):
        if self.head is None:
            print("List is Empty")
        else:
            n=self.head
            while n is not None:
                print("Stack",n.data)
                n=n.next

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
        print(a_stack.show())
    elif operation == 'pop':
        popped = a_stack.pop()
        if popped is None:  
            print('Stack is empty.')
        else:
            print('Popped value: ', int(popped))
            print('Updated Stack values :',a_stack.show())
    elif operation == 'quit':
        break

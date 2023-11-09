
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):  

        self.head = None
        
    def push(self, data): 

        #time complexity: O(1)
        #space complexity: O(n) 

        if self.head == None:
            self.head=Node(data)
             
        else:
            new_node = Node(data)
            new_node.next = self.head
            self.head = new_node

        
    def pop(self):  

        #time complexity: O(1) 
        #space complexity: O(1) 

        if self.head is None:
                return None             
        else:
            popped_node = self.head
            self.head = self.head.next
            return popped_node.data

        
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

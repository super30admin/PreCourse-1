
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.node = Node(None)
        self.previous = None
    def find_last(self):
        '''
        This method is to find the last but one link in the linked list
        '''
        self.previous = None
        temp  = self.node
        while temp.next != None:
            self.previous = temp
            temp = temp.next

    def push(self, data):
        temp = Node(data)
        if self.previous ==None:
            self.node.next = temp # adding a new node to list
            self.previous = self.node # Assigning the previous to root node
        else:
            self.previous.next.next = temp
            self.previous = self.previous.next
    def pop(self):
        popped_value = None # stack is empty default value
        self.find_last() # Since every time we push the previous updates but poping will not update the previous,
        if self.previous != None :
            popped_value = self.previous.next.data
            self.previous.next=None
        return popped_value

    def print(self):
        temp = self.node
        while temp.next!=None:
            print(temp.data)
            temp= temp.next
        print(temp.data)
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


## complexity
# Time for pop- O(n)
# Time for push - O(1)
# Space for pop - O(1)
# space for Push - O(1)

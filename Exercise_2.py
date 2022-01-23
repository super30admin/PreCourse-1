#Time Complexity : O(n)
#Space Complexity : O(1)
#This code is running perfectly as desired
#I had to look again for the Linked List concepts

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None #initializing the head of the list
        
    def push(self, item):
        data = Node(item)
        temp = self.head
        if temp is None:  # checking whether LinkedList has any elements in it or not, Is No, assigning data to it
            self.head = data
        else:
            while temp.next is not None:  # traversing to the end of linkedlist
                temp = temp.next
            temp.next = data  # linking the data to the lst node
        
    def pop(self):
        temp = self.head
        while temp.next is not None: #traversing the linked list till the end
            prev = temp
            temp = temp.next
        prev.next = None #assigning the 2nd last as the last node of the list
        return temp.data

        
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

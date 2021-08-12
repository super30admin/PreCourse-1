"""
Using LinkedList to implement Stack LIFO
"""

class Node:
    def __init__(self, data, nextNode=None):
       """
       Initializing the Class Node
       Where NextNode pointer is None
       And Data is the value
       """
       self.data = data
       self.nextNode = nextNode
 
class Stack:
    def __init__(self):
       """
       The init method to initialize
       head of the Linkedlist to None
       size of the linkedlist to 0
       :return: None
       """
       self.head=None
       self.size=0

    def push(self, data):
        """
        Pushing the element to the head of the node initially empty
        and assigning the nextnode as the head
        :param data:
        :return: None
        """
        self.head=Node(data, self.head)
        # self.nextNode=self.head
        self.size+=1
        
    def pop(self):
        """
        To avoid any exception we first check if the size of the list is >0 and in only that condition we could pop
        We pop the element on the head size and assign the head to the next node after the element we popped
        :return: None or Popped Element
        """
        if self.size==0:
            return None
        else:
            poppedelement=self.head.data
            self.head=self.head.nextNode
            self.size-=1
            return poppedelement
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

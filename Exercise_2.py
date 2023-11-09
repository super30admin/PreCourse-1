"""
Using LinkedList to implement Stack LIFO
Time Complexity-Initialization of node - O(1)
Initialization of stack - O(1)
Pushing an element to the end of singly linked list should take O(n) since we have to traverse all the array
Popping an element from the end of array should also take O(n) since we have to traverse the last of array

Space Complexity-
Initilization node and stack O(1) since initialy the node and stack is empty. But i have a doubt about it could you please clear
Pushing should take space complexity O(n) since the list size linearly increase with elements
Popping space complexity should be O(1) since space is already declared.

Explanation is mentioned in the functions below

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

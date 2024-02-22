# Time Complexity : O(1)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode :
# Any problem you faced while coding this : Yes, it took some time for implementing all the functions.

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    #In this function, we initialize the head. it signifies an empty linkedlist
    def __init__(self):
        self.head = None

    '''This function is used for inserting an element in the beginning of the linkedlist.
        Time complexity of this function is O(1).
        Inserting an element at the end of the linkedlist would have made the time complexity O(n).
        In stack, the time complexity of pushing the element is O(1).
    '''
    def push(self, data):

        item = Node(data)
        #Checks if linkedlist is empty or not
        if self.head is None:
            self.head = item
            return 
        
        item.next = self.head
        self.head = item
    '''
    This function is used for removing the element in the beginning of the linkedlist.
    As explained above, the time complexity of this function would have become O(n),if
    the element was removed from the end of the linkedlist.
    In stack, the time complexity of popping the element is O(1).
    '''
    def pop(self):
        #It checks if the linkedlist is empty or not
        if self.head is None:
            return None
        '''
        stores the original head in a node for returning the popped element. and then changes the head
        to point to next element.'''
        item = self.head
        self.head = self.head.next
        return item.data

        
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

"""
Stack is a type of LIFO (Last in First Out) data structure meaning last added element is processed first.
 There are multiple operations that can be performed on the stack.
(1) push element to stack (2) pop element from stack (3) peek element from stack (4) get size of stack and more.
This program implement stack using Linked List and perform push and pop operations.
"""


class Node:
    def __init__(self, data):
        """
        Constructor for Node class, where object of  node class consists of two attributes: data and next.
        Data represent the value and next is the pointer to next node.
        Takes O(1) time.
        """
        self.data = data
        self.next = None


class Stack:
    def __init__(self):
        """
        Constructor for stack class, that creates dummy head node when object of stack is instantiated.
        Takes O(1) time.
        """
        self.dummyHead = Node(0)
        self.size = 0

    def push(self, data):
        """
        This is method to push an element into stack.
        Parameters:
            data: element to be pushed into stack
        Returns:
            None
        Example:
            stack = MyStack()
            stack.push()
        TC: O(1) since elements are added at the head if linked list only.

        """
        newNode = Node(data)
        newNode.next = self.dummyHead.next
        self.dummyHead.next = newNode

    def pop(self):
        """
        This is method to pop an element from stack.
        Parameters:
            None
        Returns:
            the popped element from stack
        Example:
            stack = MyStack()
            stack.pop()
        TC: O(1) since elements are popped from the head of linked list.

        """
        if self.dummyHead.next:
            popedEle = self.dummyHead.next.data
            self.dummyHead.next = self.dummyHead.next.next
            return popedEle

        return


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

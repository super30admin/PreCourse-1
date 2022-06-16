'''
# Exercise_2 : Implement Stack using Linked List.

# Author: Neha Doiphode
# Date  : 06-15-2022

# Approach:

    Stack is Last In First Out(LIFO) type of data structure.

    Approach 1: (Implemented below)
                All operations of the stack usually happen at the top. So it is important for us to maintain the top pointer.
                In order to perform operations in constant time, approach used below always makes sure that,
                top points to the head of the linked list.
                So, the single linked list is created in reversed order where, as we keep on adding new element to the list,
                we store address of the new node in the current head.next. And make new node - head of the list.

                10 <- 20 <- 30(current head) ,  New node = 40
                10 <- 20 <- 30.next <- 40 and 40 = current head.

                As for pop operation, we need to first move the head to its next node(new head) and then delete the current head.

    Approach 2: (Not implemented below)
                Create single linked list where push operation can traverse the list until it reaches the last node.
                When last node in the existing list is reached, new node can be stored in the next pointer of the last node.

                As for pop operation, We need 2 pointers:
                * Previous pointer which points to the previous node of the current node.
                * Temp pointer which traverses to the end of the list until we reach to the last node.
                  Once temp reaches last node and previous pointer points to the second last node, we can delete the temp(last) node
                  and assign None to previous.next to terminate the list.

                With this approach, both operations, push and pop require us to traverse the whole list, hence we can say that,
                time complexity of this approach is O(n) for both push and pop operations.

# Time Complexity                            : Please check method doc-strings below.
# Space Complexity                           : O(n) where n = number of elements present onto the stack.
# Did this code successfully run on Leetcode : Did not try to run on Leetcode.
# Any problem you faced while coding this    : Started with approach 2 which is straight forward.
                                               While thinking about complexities, thought of checking if we can solve the problem
                                               in constant time and hence finalized on approach 1.

'''

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None

class Stack:
    def __init__(self):
        self._head = None

    def push(self, data):
        '''
        Time complexity: O(1)
        '''
        if self._head:
            new_node = Node(data)
            new_node.next = self._head
            self._head = new_node
        else:
            self._head = Node(data)

    def pop(self):
        '''
        Time complexity: O(1)
        '''
        if self._head:
            temp = self._head
            self._head = temp.next
            temp.next = None
            return temp.data
        return None

    def display(self):
        '''
        Not part of the boilerplate. Added by Neha.
        '''
        if self._head:
            temp = self._head
            while temp.next:
                print(f'{temp.data}->', end = '')
                temp = temp.next
            print(f'{temp.data}', end = '')
        else:
            print('Stack is empty')
        print()
        print()

a_stack = Stack()
while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('display')
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
    elif operation == 'display':
        a_stack.display()

# Time Complexity : O(n)
# Space Complexity : O(n)
# Any problem you faced while coding this : No
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class Stack:
    def __init__(self):
        self.head = None

    #To implement a push operation in linked list, first the Node object is created with given data and temp pointer first points to head if list.
    #If the head is None which means stack is empty, then the new Node is the head.
    #If not, then append the new Node at the end of linked List which is done by iterating the temp pointer to the last element in list and then appending the Nodee to it.
    def push(self, data):
        newNode = Node(data)
        if self.head is None:
            head = newNode
        else:
            temp = head
            while temp.next is not None:
                temp = temp.next
            temp.next = newNode
            print("Successfully added element to stack!")
        
    #To simulate the pop operation, all that needs to be done is remove and return the last element in the non-empty linked List.
    #The temp pointer is assiged to head and iterated till last element is found and then last node from linked list is reemoved and returned to user.
    def pop(self):
        if self.head is None:
            print("Cannot pop element from empty list!")
            return None
        else:
            temp = self.head
            while temp.next.next is not None:
                temp = temp.next
            popNode = temp.next
            temp.next = None
            return popNode
        
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

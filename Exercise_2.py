# Time complexity : push operation -> O(1), pop operation -> O(n) since we need to traverse to the end 
# Space complexity : O(n) where n is the number of elements in the stack

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        self.tail = None
        
    def push(self, data):
        newNode = Node(data)
        # If we are adding element for the first time, both tail and head will point to the newly created node
        if self.head == None:
            self.head = newNode
            self.tail = newNode
        else:
            # If there are elements in the linked list, append the new node at the end and update the tail pointer
            self.tail.next = newNode
            self.tail = self.tail.next
        
    def pop(self):
        # Traverse to the last but one element and update the pointer
        temp = self.head
        if self.head == None:
            print('Empty stack, cannot pop elements.')
            return None
        # If there is single element, update head and tail pointers to None
        elif self.head.next == None:
            popped_element = self.head.data
            self.head = None; self.tail = None
            return popped_element
        else:
            while temp.next.next:
                temp = temp.next
            # temp points to last but one element in the linked list
            popped_element = temp.next.data
            temp.next = None
            return popped_element
        
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

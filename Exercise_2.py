#Exercise 2 : Implement a stack using LinkedList

#Time Complexity : O(1)
#The time complexity in this case to push or pop an element is O(1), as all we are doing for creating a new node is changing the last node pointer to the new node,
#and it is added to the stack, and in the case of pop, removing the pointer of the current head node and making it point to the next node, effectively popping(or removing)
#the element


#Space Complexity : O(N)
#The time complexity is O(N) as we would require space as it scales up, and this space is proportional to the length of the stack.


class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        
    def push(self, data):
        if self.head is None:
            self.head = Node(data)
        else:
            new_node = Node(data)
            new_node.next = self.head
            self.head = new_node
        
    def pop(self):
        if self.head is None:
            return None
        else:
            popped = self.head.data
            self.head = self.head.next
            return popped
        
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

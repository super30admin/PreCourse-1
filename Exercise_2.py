# Time Complexity

# push: In the case of push operation using a LinkedList, we add a new node at the end of the list. Hence the Time Complexity will be O(n).
# pop: In the case of pop operation, we delete the last node in LinkedList. We traverse the entire all the nodes and then delete the last node. Therefore the Time Complexity will be O(n).

# Space Complexity

# The space complexity of a LinkedList is O(n).



class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = Node(0) # Create a Null Node as Head.
    
    def push(self, data):
        # Add an element at the top of the stack. Since this is a LinkedList implementation, we insert a node at the end of the LinkedList.
        ptr = self.head
        while ptr.next!=None: # Continue till we reach the end of the LinkedList
            ptr = ptr.next # Move the pointer to the next node
        newNode = Node(data) # Create a new Node with data.
        newNode.next = None # Last node of a LinkedList point to NULL
        ptr.next = newNode # The current last node points to the new last Node 
        
    def pop(self):
        # Take out the last top element from the stack. In the case of LinkedList implementation, we delete the last node of the LinkedList.
        if self.head.next is None: #Check if the LinkedList is empty
            return None
        else:
            ptr = self.head
            while ptr.next.next != None: # Continue till we reach the second last node
                ptr = ptr.next
            ptr2 = ptr.next # Create a pointer that points to the last node
            ptr.next = None # Make second last node point to Null to break link to last node
            ptr2_dat = ptr2.data
            del ptr2 # Delete the last node
            return ptr2_dat # return the data of the last node
        
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

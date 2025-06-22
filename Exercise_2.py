'''
Implement Stack using Linked List.
'''

# Time Complexity : O(1) for push and pop operations. O(n) for searching an element if needed.
# Space Complexity : O(n) for storing n elements in the stack.
# Did this code successfully run on Leetcode : NA
# Any problem you faced while coding this : Yes, challenging part was to implement the pop method correctly while maintaining the linked list structure.


class Node: # humne Node class banaya hai jo linked list ka ek node represent karega aur woh linked list stack ko represent karega. (we have created a Node class that will represent a node in the linked list and this linked list will represent the stack.)
    def __init__(self, data): # humne Node class ka constructor banaya hai jo data ko initialize karega aur next pointer ko None set karega. (We have created a constructor for the Node class that initializes the data and sets the next pointer to None.)
        self.data = data # yeh data ko initialize karega jo stack mein store hoga. (This will initialize the data that will be stored in the stack.)
        self.next = None # yeh next pointer ko None set karega jo stack ke next node ko point karega. (This will set the next pointer to None which will point to the next node in the stack.)

class Stack: # humne Stack class banaya hai jo linked list ka use karke stack ko implement karega. (We have created a Stack class that will implement the stack using a linked list.)
    def __init__(self): # humne Stack class ka constructor banaya hai jo head ko None set karega. (We have created a constructor for the Stack class that initializes the head to None.)
        self.head = None # yeh head pointer ko None set karega jo stack ke top node ko point karega. (This will set the head pointer to None which will point to the top node of the stack.)
        
    def push(self, data): # humne push method banaya hai jo stack mein ek naya element add karega. (We have created a push method that will add a new element to the stack.)
        """
        Push an element onto the stack.
        Takes O(1) time.
        """
        new_node = Node(data) # yeh naya node banayega jo data ko store karega. (This will create a new node that will store the data.)
        new_node.next = self.head # yeh naya node ka next pointer ko current head pointer se point karega. (This will set the next pointer of the new node to the current head pointer.)
        self.head = new_node # jab naye node ka next pointer head ki taraf point karega, tab hum head ko naye node se update karenge aur head will now point to the new node. (When the next pointer of the new node points to the head, we will update the head to point to the new node and now the head will point to the new node.)

    def pop(self): # humne pop method banaya hai jo stack se ek element remove karega. (We have created a pop method that will remove an element from the stack.)
        if self.head is None: # agar stack khali hai, toh hum None return karenge. (If the stack is empty, we will return None.)
            return None # yeh stack khali hai, toh hum None return karenge. (This means the stack is empty, so we will return None.)
        # agar stack mein elements hain, toh hum head se data ko pop karenge aur head ko next node se update karenge. (If there are elements in the stack, we will pop the data from the head and update the head to the next node.)
        popped_data = self.head.data # yeh head se data ko pop karega aur usko popped_data mein store karega. (This will pop the data from the head and store it in popped_data.)
        self.head = self.head.next # yeh head ko head ke next node se update karega. (This will update the head to the next node of the head.)
        return popped_data # yeh popped_data ko return karega. (This will return the popped_data.)
    
# Main code to test the Stack implementation 
a_stack = Stack() # humne Stack ka ek instance banaya hai. (We have created an instance of the Stack class.)

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

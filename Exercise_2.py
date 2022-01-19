# time complexity for each operation(push/pop) is O(1) so overall 
# time complexity :O(1)
# space complexity:O(n),where n is the number of nodes

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        #set the head of the list to None initially
       self.head=None
        
    def push(self, data):
        if self.head is None:
            #if head is None assign the node value to head
            self.head=Node(data)
        else:
            #assign node value to current and 
            #replace next of current to head
            #and head to current
            current=Node(data)
            current.next=self.head
            self.head=current

    def pop(self):
        if not self.head:
            return None
        else:
         #replace head by it's next
            current=self.head.data
            self.head=self.head.next
            return current
            
        
a_stack = Stack()
while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print("push <value>")
    print("pop")
    print("quit")
    do = input("What would you like to do? ").split()
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    operation = do[0].strip().lower()
    if operation == "push":
        a_stack.push(int(do[1]))
    elif operation == "pop":
        popped = a_stack.pop()
        if popped is None:
            print("Stack is empty.")
        else:
            print("Popped value: ", int(popped))
    elif operation == "quit":
        break

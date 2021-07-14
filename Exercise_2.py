class Node:
    def __init__(self, key):
        self.key = key
        self.next = None
 
 
class Stack:
 
    def __init__(self):
        self.top = None 

    def push(self, values):        
 

        node = Node(values) 
       
        print("Inserting", values) 

        node.data = values 
      
        node.next = self.top 

        self.top = node
 

    def isEmpty(self):
        return self.top is None  
        
        
    def peek(self):


        if not self.isEmpty():
            print ("The stack is not empty")
            return self.top.data
        else:
            print("The stack is empty")

 

    def pop(self):           
 

        if self.top is None:
            return
 
        print("Removing", self.peek())
 

        self.top = self.top.next
        
        
        
    def printList(self):
        temp = self.top
        while (temp):
            print (temp.key)
            temp = temp.next
 
 
if __name__ == '__main__':
 
    stack = Stack()
 
    stack.push(1345435)
    stack.push(2536464)
    stack.push(99990000)
    stack.pop()
    stack.push(376575675)

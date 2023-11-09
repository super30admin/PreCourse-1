class Node:
    def __init__(self,data=None,next=None):
        self.data=data              #Any var which user is going to pass will come in init(arguments)
        self.next=None              #Any new variable not passed by user can be declared here

class Stack:
    def __init__(self):
        self.head=None

    def push(self,data):
        if self.head==None:
            self.head=Node(data)

        else:
            newNode=Node(data)
            newNode.next=self.head
            self.head=newNode

    def display(self):
        # dispNode=Node()       
        dispNode=self.head      #Self.head vraible is created as an instance for LinkedList so 
                                #can access dispNode.data from the list created and dispNode 
                                #value as well; 
        if dispNode==None:
            print("No Items to Display, Stack Underflow")

        else:
            while dispNode!=None:
                print(dispNode.data)
                dispNode=dispNode.next


    def peak(self):
        if self.head!=None:
            print(self.head.data)
        else:
            print("No Data to be shown on the Top")

    def pop(self):
        tempNode=self.head
        if(tempNode==None):
            return("No Elements to POP from")
        else:
            tempNode=self.head
            self.head=tempNode.next
            # tempNode.next=None
            return tempNode.data

    def isEmpty(self):
        if self.head==None:
            return False
        else:
            return True


num1=Stack()
num1.push(2)
num1.push(3)
num1.push(4)

num1.display()
# num1.peak()

print("Message Returned or Popped Item is:",num1.pop())
print("Message Returned or Popped Item is:",num1.pop())
print("Message Returned or Popped Item is:",num1.pop())
print("Message Returned or Popped Item is:",num1.pop())


# print("Node Data being Popped is:",num1.pop())

num1.display()     
num1.peak()


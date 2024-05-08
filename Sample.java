------------------------------------------------------------------------------------------------------------
Exercise 1

Implement Stack using Array.

Time Complexity :  

 Push : O(1)
 Pop  : O(1)


Space Complexity :  O(1)


Any problem you faced while coding this : No


Your code here along with comments explaining your approach: 

Code :

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  
  
  def __init__(self):
    
    # initialized top = -1 and arr to have None and size as 10 
    self.length=10
    self.arr=[None]*self.length
    self.top=-1

         
  def isEmpty(self):

  # if top is at -1, then stack is empty
    if self.top == -1:
      return True
    else:
      return False

         
  def push(self, item): 
 
    # increment top and add the new element at the top index


    if self.top == self.length-1:
      return "Stack Overflow"
    else:
      self.top=self.top+1
      self.arr[self.top]=item
         
  def pop(self):

    #decrement top, remove the top element return the element at (top) index
    if self.isEmpty() == True:
      return "Stack Underflow"
    else:
      popItem=self.arr[self.top]
      self.top=self.top-1
      return popItem

        
  def peek(self):


    if self.isEmpty() == True:
      return "Stack Underflow"

    # return the top element
    return self.arr[self.top]
        
  
  def size(self):

    # size will be equal to top+1
    if self.isEmpty() == True:
      return "Stack Underflow"
    
    return self.top+1
         
  def show(self):

    # return the complete array
    stack_arr= [ element for element in self.arr if element is not None]
    count =0
    curr_stack=[]
    while count<=self.top:
      curr_stack.append(stack_arr[count])
      count=count+1
    return curr_stack
             

s = myStack()
s.push('1')
s.push('2')
s.push('3')
print(s.pop())
print(s.show())

print(s.peek())
print(s.size())
print(s.isEmpty())
print(s.pop())
print(s.isEmpty())

Approach :

Init function contains top initialsed to -1, and have defined a size of 10 for the array
Push : it will first check if there is stack overflow, else will increment top and then add element in array
Pop  : it will first check if there is stack undeflow, else will store the element to pop, and then decrement top by 1 and return popped element
Size : it will check for stack underflow, else will return top+1 as the size
isEmpty : it will check if top =-1, if so, will return True, else false
Peek : it will check for stack underflow, else will return element at top index

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


Exercise 2

Implement Stack using Linked List.

Time Complexity :  

 Push : O(1)
 Pop  : O(1)


Space Complexity :  O(n)


Any problem you faced while coding this : No


Your code here along with comments explaining your approach: 

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head=None
        
    def push(self, data):

        if self.head == None:
            self.head=Node(data)
        else:
            tempNode = Node(data)
            tempNode.next=self.head
            self.head=tempNode        

    def pop(self):

        if self.head == None:
            return None
        
        else:
            popNode = self.head
            self.head=self.head.next
            popNode.next=None
            return popNode.data

        
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

Approach :

Init function contains head which is initialised to None
Push : it will first check if head is None, if so, the first Node will be assigned to head, else, tempNode.next will point to head, head will be assigned to the tempNode
Pop  : it will first check if there is stack undeflow, else will store the element to pop, head will be assigned to the next element in the list, and previous head.next will be made None

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


Exercise 3

Implement Singly Linked List.

Time Complexity :  

 Append : O(n)
 Find  : O(n)
 Remove: O(n)


Space Complexity :  O(n)

Any problem you faced while coding this : No


Your code here along with comments explaining your approach: 


Code:

class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data=data
        self.next=next
    
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        if self.head==None:
            self.head=ListNode(data)
         
        else:
            moverNode=self.head
            tempNode= ListNode(data)
            while(moverNode!=None):
                if(moverNode.next == None):
                    moverNode.next=tempNode
                    return
                moverNode=moverNode.next

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head == None:
            return "The linkedList is Empty"
        else:
            moverNode=self.head
            while(moverNode!=None):
                if(moverNode.data==key):
                    return "Element found :" +str(moverNode.data)
                moverNode=moverNode.next            
            return "Element Not Found : " + str(key)
    
    # for testing, printing the linkedlist
    def show(self):
        moverNode = self.head
        print("The current linked list :")
        while ( moverNode!=None ):
            print(str(moverNode.data) + " - >",end=" ")
            moverNode=moverNode.next 
        print("NULL",end=" ")
                       
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head == None:
            return "Empty List"
        
        else:
            flag=0
            removeNode=self.head
            
            # if first element contains the key
            if(self.head.data == key):
                self.head= self.head.next
                removeNode.next=None
            
            else:
                while(removeNode!=None):   
                    # remove the link when key is found
                    if(removeNode.next.data == key):
                        removeNode.next=removeNode.next.next
                        if removeNode.next != None:
                            removeNode.next.next=None
                        flag=1
                        break
                    else:
                        removeNode=removeNode.next

                if(flag==0):
                    return "Element not found"


a_stack = SinglyLinkedList()

# Appending 3 elements
a_stack.append(23)
a_stack.append(46)
a_stack.append(23)
a_stack.append(46)
a_stack.append(69)

# for testing, printing the linked list 
a_stack.show()

# Found elements
print()
print(a_stack.find(23))
print(a_stack.find(46))
print(a_stack.find(69))

# # Not found elements
print(a_stack.find(25))


a_stack.remove(23)
a_stack.show()
print()
a_stack.remove(69)
a_stack.show()
a_stack.remove(46)
print()
a_stack.show()



Approach :

Init function contains head which is initialised to None
Append : it will first check if head is None, if so, the first Node will be assigned to head, else, traverse the linkedList till the it reaches a node where the next pointer is None and insert the new node there.
Find  : it will first check if there is stack undeflow, else will compare the data field of each node till the last node, if found will return from the function, if not found will return None
Remove : it will first check if there is stack undeflow, else will check if the first occurence occurs at the head position or later, if not found at the head, it keeps traversing the list till the first oocurence is found, also a flag is kept, incase a element is not found, the flag remains unchanged and Element not found is returned

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
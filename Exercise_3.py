#  Time Complexity
#  Append : O(n)
#  Find  : O(n)
#  Remove: O(n)


# Space Complexity :  O(n)


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

# Appending 5 elements
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






          





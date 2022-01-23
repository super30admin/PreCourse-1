from ast import Not

#creating the node for LinkedList.
class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data= data # for storing the data of the node
        self.next= next# to point to its next location.
    
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
        
        temp = self.head
        node = ListNode(data)  # creating the node for insertion
        if temp is None: 
            self.head = node # Insertion if the LinkedList 
        else:
            
            while temp.next is not None:
                temp = temp.next
              
            temp.next= node # insertion at the end of the list.
    def find(self, key): #Here, we will find the element if it is present or not
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp = self.head
        while (temp.next is not None ):
            if temp.data == key:#Element is present
                return temp
                break
            temp = temp.next # jumping into the next element

        return 0 #Element is not present
        
    def remove(self, key): # Function to remove a particular element in this list.
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp = self.head
        if temp.data == key: #if the element is in the 1st position
            self.head = temp.next
            return
        else:
            while (temp.next is not None):#if the element is after the 1st position.
                if temp.data == key:
                    break
                prev = temp # storing the previous node.
                temp= temp.next
                
        prev.next= temp.next # Linking the previous node to the next node , thereby removing the correct node.

                
    def print(self):        #Displaying the LinkedList 
        if self.head is None:
            print('Linked List is empty')
            return
        itr = self.head
        llstr = []
        while itr:
            llstr.append(itr.data)
            itr = itr.next

        print(llstr)
        
#creating an object .          
s =  SinglyLinkedList()
# append 4 nodes in a LinkedList
s.append(5)
s.append(6)
s.append(7)
s.append(8)
#Remove an element
s.remove(5)
# Display the list
s.print()

# Time Complexity: As there is a while loop used for traversing into the series once, the time complexity is O(n)
# Space Complexity: Space complexity is O(1) .

# This code is checked and verifies by the python editor.
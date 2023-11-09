#Exercise_3 : Implement Singly Linked List.
  
  #Time Complexity : O(n) for append() remmove() find(), O(1) for create
  #Space Complexity : O(n)
  #Did this code successfully run on VSCode : yes
  #Any problem you faced while coding this : None

class ListNode:                                 #Node class for linkedlist
    """ 
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):           #initialize node
        self.data = data
        self.next = None
    
class SinglyLinkedList:                             
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None

    def append(self, data):                             #Append new node at the end of linked list       
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node = ListNode(data)                       #add data in teh new node

        if self.head is None:                           #if linked list is empty, new node becomes 'head'
            self.head = new_node
            return
        else:                                           #else check till last node and then append
            last_node = self.head
            while (last_node.next):
                last_node = last_node.next

        last_node.next = new_node                       #last node 'next' becomes the new node appended

    def find(self, key):                                        #find element and return the element itself if found. Else None.
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head                                     # initialize current to 'head'

        while current != None:                                  #as long as current is not empty, compare data and return when found
            if current.data == key:
                return current.data
        
            current = current.next                              #Once data is found, make current 'next'

        return None                                             #if current is empty, return None

    def remove(self, key):                                              
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp = self.head                                            #initialize a temp to store 'head'

        if(temp is not None):                                       #if 'head' itself is the key value to be removed, remove, change 'head' and return
            if(temp.data == key):
                self.head = temp.next
                temp = None
                return

        while(temp is not None):                                    #traverse list to find the key. If found break. Use prev to store previous node (to use later)
            if(temp.data == key):
                break
            prev = temp
            temp = temp.next


        if(temp == None):                                           #if value is not there in linkedlist, do nothing and return
            return

        prev.next = temp.next                                       #once key is found and removed, unlink node
        temp = None

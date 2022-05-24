class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next
    
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
         # 1. Create a new node
        # 2. Put in the data
        # 3. Set next as None
        new_node = ListNode(data)
 
        # 4. If the Linked List is empty, then make the
        #    new node as head
        if self.head is None:
            self.head = new_node
            return
 
        # 5. Else traverse till the last node
        last = self.head
        while (last.next):
            last = last.next
 
        # 6. Change the next of last node
        last.next = new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head

        index_val = 0
        while curr:
         if curr.data == key:
            return index_val
         curr = curr.next
         index_val = index_val + 1
        return -1
         
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        # Store head node
        temp = self.head
 
        # If head node itself holds the key to be deleted
        if (temp is not None):
            if (temp.data == key):
                self.head = temp.next
                temp = None
                return
 
        # Search for the key to be deleted, keep track of the
        # previous node as we need to change 'prev.next'
        while(temp is not None):
            if temp.data == key:
                break
            prev = temp
            temp = temp.next
 
        # if key was not present in linked list
        if(temp == None):
            return
        # Unlink the node from linked list
        prev.next = temp.next
 
        temp = None

    # Utility function to print the linked LinkedList
    def printList(self):
        temp = self.head
        while(temp):
            print (" %d" %(temp.data)),
            temp = temp.next

Llist = SinglyLinkedList()

Llist.append(9)
Llist.append(3)
Llist.append(1)
Llist.append(7)

print ("Linked List: ")
Llist.printList()
Llist.append(8)
Llist.remove(1)
print ("\nLinked List after Deletion of 1:")
Llist.printList()
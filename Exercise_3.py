class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = None

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
        new_node = ListNode(data)
        if self.head is None:
            self.head = new_node
            return
        last = self.head
        while(last.next):
            last = last.next
        last.next = new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        #Initializing current to head
        current = self.head
        
        #Searching current equal to data or else return None 
        if(current.data == key):
            return current.data
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        #current head value in temp
        temp = self.head
        prev = None

        #looping the current value to 
        while(temp):
            if(temp.data == key):
                if prev:
                    prev.next = temp.next
                else:
                    self.head = temp.next
                return True
            
            prev = temp
            temp = temp.next
        
        return False

    # Utility function to print the linked LinkedList
    def printList(self):
        temp = self.head
        while(temp):
            print(" %d " %(temp.data)),
            temp = temp.next
 

#Creating Linked list object

llist = SinglyLinkedList()
llist.append(7)
llist.append(1)
llist.append(3)
llist.append(2)
llist.append(8)
 

print("Created Linked List: ")
#printing the created list
llist.printList()

#finding if 4 is the head in the linked list
print("\n Finding the head to be 4 or not")
print(llist.find(4))

#finding if 7 is the head in the linked list
print("\n Finding the head to be 7 or not")
print(llist.find(7))

#Removing 7 from the linked list
llist.remove(7)
print("\nLinked List after Deleting 7: ")
llist.printList()



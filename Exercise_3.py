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
        newNode = ListNode(data)
        if self.head is None:
            self.head = newNode
            return
 
        last = self.head
        while (last.next):
            last = last.next
 
        last.next =  newNode
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp = self.head
        while (temp):
            if temp.data == key:
                print(key)
                return key
            temp = temp.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp = self.head

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

    def printList(self):
        current = self.head
        while(current is not None):
            print(current.data, end = " ")
            current = current.next
        print("\n")


if __name__=='__main__':
  
    llist = SinglyLinkedList()
    llist.append(1)
    llist.append(2)
    llist.append(3)
    llist.append(4)
    llist.printList()
    llist.remove(3)
    llist.printList()
    llist.find(3)
    llist.find(2)
  

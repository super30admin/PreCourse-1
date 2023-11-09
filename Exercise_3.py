#Space Complexity : O(n)

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
        #create a new node
        n = ListNode(data, None)
        #if LL is empty make it the first node
        if self.head == None:
            self.head = n
        #if LL is not empty then find the last node and point it to new node
        else:
            tail = self.head
            while tail.next != None:
                tail = tail.next
            tail.next = n
        
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp = self.head
        #find the node with key and return it
        while(temp != None):
            if temp.data == key:
                return temp
            else:
                temp = temp.next
        return None
            
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        #see if the next node has the key value point the current node to its next and remove the one in middle
        temp = self.head
        if temp.data == key:
            self.head = temp.next
            temp.next = None
        else:
            while(temp.next != None):
                temp_next = temp.next
                if temp_next.data == key:
                    temp.next = temp_next.next
                    temp_next.next = None
                    break
                else:
                    temp = temp.next

    
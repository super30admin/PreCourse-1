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

        node_data = ListNode(data)

        if self.head is None:
            self.head = node_data
        else:

            node_temp = self.head
            while node_temp.next:
                node_temp = node_temp.next
            node_temp.next = node_data


        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head:
            node_temp = self.head
            
            while node_temp:
                print(node_temp.data)
                if node_temp.data == key:
                    return node_temp.data
                node_temp = node_temp.next
                
        else:
            print("Empty linked list")


        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """

        if self.head and self.head.data == key:
            print ("here")
            self.head = self.head.next
            
        elif self.head:
            node_temp = self.head
            while node_temp:
                prev = node_temp    
                node_temp = node_temp.next

                if node_temp and node_temp.data == key:
                    temp = node_temp.next
                    prev.next = temp

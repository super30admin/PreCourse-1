class ListNode:
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next
        """
        A node in a singly-linked list.
        """
           
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
        else:
            current = self.head
            while current.next:
                current = current.next
            current.next = new_node
                    
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        while current:
            if current.data == key:
                return current
            current = current.next
        return None
                   
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current = self.head
        previous = None
        while current:
            if current.data == key:
                if previous is None:
                    #removing the node by adjusting the pointer of the head
                    self.head = current.next
                else:
                    #removing the node from the linked list by adjusting the pointer of the previous node
                    previous.next = current.next
                #return the key found and exit the function
                return  current
            previous  = current
            current = current.next
        return "Key not found"

         
List = SinglyLinkedList()
List.append(1)
List.append(2)
List.append(3)

print(List.find(2))

print(List.remove(2))
     

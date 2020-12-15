# Code ran with driver code below
# No issues coming up with this solution
# Complexities given inline functions

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

    
    # Condition 1 - if LL is empty, new node to append is the head of LL
    # Condition 2 - Otherwise append to LL
    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node = ListNode(data)
        if self.head:
            current = self.head
            while current.next:
                current = current.next
            current.next = new_node
            
        else:
            # empty linked list since head pointing to NULL, add the new_node as the head
            self.head = new_node
        
    
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        while current is not None:
            if current.data == key:
                return key
                break
            else:
                current = current.next
        return None
        
    
    # Condition 1 - if LL is empty, cannot remove any element, return None
    # Condition 2 - if LL exists check if removing head node, if so re asssign head
    # Condition 3 - if LL exists and removing node in between, update pointers accordingly
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """

        if not self.head:
            print("Cannot remove from empty LL")
            return None
        
        else:

            prev = None
            current = self.head
            
            while current:
                if current.data == key:
                    if prev is None:
                        print("Node to remove is the head of linked list")
                        self.head = current.next
                        
                    else:
                        print("Node to remove is not the head of the linked list")
                        prev.next = current.next
                        
                prev = current
                current = current.next


LL = SinglyLinkedList()
LL.head = ListNode(3)
print(LL.append(5))
print(LL.head.data)
print(LL.find(5))
print(LL.remove(5))
print(LL.head.data)
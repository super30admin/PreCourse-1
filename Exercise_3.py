"""
    Problem Statement: Implementing a singly linked list.

    Time complexity:
    append(): O(n)
    find(): O(n)
    remove(): O(n)
    display(): O(n)

    Space complexity: O(ll), where ll is the length of the linked list.
"""


class ListNode:
    """A node in a singly-linked list."""
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
        if not self.head:
            self.head = ListNode(data)
            return data

        temp = self.head
        
        while temp.next:
            temp = temp.next
        temp.next = ListNode(data)
    
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp = self.head
        while temp:
            if temp.data == key:
                return temp.data
            temp = temp.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp = self.head
        while temp:
            if temp.next:
                if temp.next.data == key:
                    deleted_node = temp.next
                    temp.next = deleted_node.next
            temp = temp.next

    def display(self):
        """Display the singly linked list"""
        temp = self.head

        while temp:
            print(f"{temp.data} -> ", end="") if temp.next else print(temp.data)
            temp = temp.next
            

if __name__ == "__main__":
    sll = SinglyLinkedList()
    sll.append(1)
    sll.append(2)
    sll.append(3)
    sll.append(4)
    sll.display()
    
    print(sll.find(4))
    print(sll.find(8))

    sll.remove(3)
    sll.display()

    sll.append(4)
    sll.display()
#TC = O(n)
#SC = O(n)

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
        if not self.head:
            self.head = newNode
            return
        curr = self.head
        while curr.next:
            curr = curr.next
        curr.next = newNode
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head
        while curr:
            if curr.data == key:
                return curr
            curr = curr.next
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if not self.head:
            return
        if self.head.data == key:
            self.head = self.head.next
            return
        curr = self.head
        while curr.next:
            if curr.next.data == key:
                curr.next = curr.next.next
                return
            curr = curr.next

if __name__ == "__main__":
    linked_list = SinglyLinkedList()

    linked_list.append(1)
    linked_list.append(2)
    linked_list.append(3)

    print("Original Linked List:")
    curr = linked_list.head
    while curr:
        print(curr.data, end=" ")
        curr = curr.next
    print()

    #Find and print an element in the linked list
    key_to_find = 3
    found_node = linked_list.find(key_to_find)
    if found_node:
        print(f"Element {key_to_find} found in the linked list.")
    else:
        print(f"Element {key_to_find} not found in the linked list.")

    #Remove an element from the linked list
    key_to_remove = 2
    linked_list.remove(key_to_remove)

    #Print the updated linked list after removal
    print("Linked List after removal:")
    current = linked_list.head
    while current:
        print(current.data, end=" ")
        current = current.next
    print()


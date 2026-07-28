# Time Complexity:
# append: O(n)
# find: O(n)
# remove: O(n)

# Space Complexity:
# O(n) for storing n nodes
# O(1) extra space for each operation

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
        new_node = ListNode(data)
        if not self.head:
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
                if previous:
                    previous.next = current.next
                else:
                    self.head = current.next
                current.next = None
                return current
            previous = current
            current = current.next
        return None

if __name__ == "__main__":
    linked_list = SinglyLinkedList()

    print("Empty list tests:")
    print(linked_list.find(10))     
    print(linked_list.remove(10))   
    linked_list.append(10)
    linked_list.append(20)
    linked_list.append(30)
    linked_list.append(40)

    print("\nFind tests:")

    found = linked_list.find(20)
    print(found.data if found else None)  

    found = linked_list.find(40)
    print(found.data if found else None)   

    found = linked_list.find(99)
    print(found.data if found else None)  

    linked_list.remove(10)
    print("\nAfter removing head 10:")
    print(linked_list.head.data)            

    linked_list.remove(30)
    print("\nAfter removing middle value 30:")
    print(linked_list.find(30))            

    linked_list.remove(40)
    print("\nAfter removing tail 40:")
    print(linked_list.find(40))         

    print("\nRemaining head:")
    print(linked_list.head.data)      

    linked_list.remove(99)
    print("\nAfter trying to remove 99:")
    print(linked_list.head.data)           

    linked_list.remove(20)
    print("\nAfter removing final node:")
    print(linked_list.head)                 
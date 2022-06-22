class ListNode:
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next

class SinglyLinkedList:
    def __init__(self):
        """
        Create a Singly Linked List.
        Takes O(1) Time
        """
        self.head = None
        
    
    def append(self, data):
        """
        Insert a new element at the end
        of the list
        Takes O(n) time
        """
        new_Node = ListNode(data)
        if not self.head:
            self.head = new_Node
            return
        
        current = self.head
        while (current.next):
            current = current.next

        current.next = new_Node

    
    def find(self, key):
        """
        Search for the first element 'data' matching
        'key'. Return element or None if not found.
        Takes O(n)
        """
        current = self.head
        while current:
            if current.data == key:
                print('Given element is present in the linkedlist')
                return current
            current = current.next
        print('Given element is not present')
        return None


    def remove(self, key):
        """
        Remove first element of the key in the list.
        Takes O(n) time.
        """
        current = self.head
        while current:
            first = current
            second = current.next
            if first.data == key:
                self.head = current.next
                return
            if second.data == key:
                current.next = second.next
                return
            current = current.next
        return

    def print_list(self):
        print("Here is the list")
        current = self.head
        while current:
            print(current.data)
            current = current.next
        

list1 = SinglyLinkedList() 
list1.append(5) 
list1.append(4) 
list1.append(2) 
list1.append(3) 
list1.append(1) 
print('pushed')
list1.find(2)
list1.find(6)
list1.print_list()
list1.remove(3)
list1.print_list()
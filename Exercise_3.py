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
            print("Key Added!" + ' : ' + str(data))
        else:
            lastNode = self.head
            while lastNode.next:
                lastNode = lastNode.next
            lastNode.next = newNode
            print("Key Added!" + ' : ' + str(data))
            
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head is None:
            print("Empty list!")
            return None
        else:
            node = self.head
            while node is not None:
                if node.data == key:
                    print("Key found!" + ' : ' + str(key))
                    return key
                node = node.next
        return print("Key not found!" + ' : ' + str(key))
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is None:
            print("Key not found!" + ' : ' + str(key))
            return
        else:
            if self.head.data == key:
                self.head = self.head.next
                print("Key Removed!" + ' : ' + str(key))
            else:
                node = self.head.next
                head = self.head
                while node is not None:
                    if node.data == key:
                        head.next = node.next
                        print("Key Removed!" + ' : ' + str(key))   
                    head = node
                    node = node.next
            
    
    def print_linked_list(self):
        head = self.head
        printList = ""
        while head:
           printList = printList + str(head.data) + ' '
           head = head.next
        print(printList)

linked_list = SinglyLinkedList()
linked_list.append(1)
linked_list.append(2)
linked_list.append(3)
linked_list.append(4)
linked_list.print_linked_list()
linked_list.remove(2)
linked_list.print_linked_list()
linked_list.append(5)
linked_list.print_linked_list()
linked_list.find(6)
linked_list.find(4)
linked_list.print_linked_list()
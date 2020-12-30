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

    def print(self):
        list1 = self.head
        while list1 != None:
            print(list1.data, end=" ")
            list1 = list1.next
        print("")


    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        if self.head == None :
            self.head = ListNode(data)
        else:
            list1  = self.head
            while list1.next != None:
                list1 = list1.next
            list1.next = ListNode(data)

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        list1 = self.head
        while list1 != None:
            if list1.data == key:
                return list1
            list1 = list1.next
        print("key element not found")
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head == None:
            print("Linked List is empty")
            return None
        list1 = self.head
        if list1.data == key:
            print("Element Removed: " + str(key))
            self.print()
            self.head = self.head.next
            return list1
        
        while list1.next != None:
            if list1.next.data == key:
                temp = list1.next
                list1.next = temp.next
                temp.next = None
                print("Element Removed: " + str(key))
                self.print()
                return temp
            list1 = list1.next

        print("Element Not Found to remove")

        return None

linkedlist =  SinglyLinkedList()
linkedlist.append(10)
linkedlist.append(20)
linkedlist.append(30)
linkedlist.append(35)
linkedlist.append(55)
linkedlist.print()
print(linkedlist.find(30).data)
linkedlist.remove(30)
linkedlist.remove(20)
linkedlist.remove(70)
linkedlist.print()

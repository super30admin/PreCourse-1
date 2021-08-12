class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = None
    
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = ListNode()

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node = ListNode(data)
        current = self.head
        while current.next!=None:
            current = current.next
        current.next = new_node
        return 

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head

        while current != None:
            if current.data == key:
                return True

            current = current.next

        return False
    


    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp = self.head

        if (temp is not None):
            if(temp.data == key):
                self.head = temp.next
                temp = None
                return 

        while(temp is not None):
            if(temp.data == key):
                break
            prev = temp
            temp = temp.next

        if(temp == None):
            return 

        prev.next = temp.next 
        temp = None
    
    def printList(self):
        temp = self.head
        while (temp):
            print(temp.data)
            temp = temp.next

# Code execurtion starts 
if __name__ == '__main__':
    my_list = SinglyLinkedList()
    my_list.append(1)
    my_list.append(2)
    my_list.append(3)
    my_list.append(4)
    my_list.remove(2)
    my_list.find(1)
    my_list.printList()
    

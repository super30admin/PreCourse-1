"""
Insertion at end: if no node exists, insert at head, else traverse till end of node and insert.
find : if at return return key, else traverse and return.
remove : if node to be removed is at head , delete it, else traverse remove the node and assign the reference of the removed node to the previous
node. 

"""



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
        if self.head == None:
            self.head = ListNode(data)
            print("Inserted")
        else:
            currentnode = self.head
            while currentnode.next:
                currentnode = currentnode.next
            newnode = ListNode(data)
            currentnode.next = newnode
        
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        currentnode = self.head
        if currentnode.data == key:
            return key

        while currentnode.next:
            currentnode = currentnode.next
            if currentnode.data == key:
                return key
        return None

                

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        currentnode = self.head
        if currentnode.data == key:
            self.head = currentnode.next
            currentnode.next = None
            return 

        while currentnode.next:
            if currentnode.next.data == key:
                del_node = currentnode.next
                currentnode.next = currentnode.next.next
                del_node.next = None
                return 
            currentnode = currentnode.next




linked_list = SinglyLinkedList()
print("Inserting 1")
linked_list.append(1)
print("Inserting 5")
linked_list.append(5)
print("Inserting 6")
linked_list.append(6)
linked_list.remove(1)
print("Finding 5")
print('Found',linked_list.find(6))
print('Found',linked_list.find(1))

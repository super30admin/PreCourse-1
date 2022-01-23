#Time Complexity : O(n)
#Space Complexity : O(1)
#It runs perfectly as it supposed to be
#I had to think hard for how to remove the node if it's at the end of the list

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
        self.head = None

    def printLinkedList(self):
        temp = self.head
        while temp is not None:
            print(temp.data)
            temp = temp.next


    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        data = ListNode(data)
        temp = self.head
        if temp is None: #checking whether LinkedList has any elements in it or not, Is No, assigning data to it
            self.head = data
        else:
            while temp.next is not None: #traversing to the end of linkedlist
                temp = temp.next
            temp.next = data #linking the data to the lst node

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        n = 1
        temp = self.head
        while temp.next is not None:
            if temp.data == key:
                return temp
            temp = temp.next
            n = n+1

        return None

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        node = self.head
        prev = self.head
        if node.data == key: #if head is the one we want to remove
            self.head = node.next #assigning the 2nd node as head of the list
            node.next = None
            return "Done"
        else:
            while node.next is not None: #travesring the list till the end
                if node.data == key:
                     break
                prev = node
                node = node.next

            if node == None:
                return
            prev.next = node.next #Removing the link of node from it's previous node and next node
            node = None

ll = SinglyLinkedList()
for i in range(5):
    ll.append(i)
ll.printLinkedList()
temp = ll.find(6)
if temp is None:
    print("There is no such element in the linkedlist")
else:
    print("The first occurence of element " , temp.data , " is at " , temp)

result = ll.remove(0)
if result == "Done":
    print("Element was removed from the linkedlist")
ll.printLinkedList()

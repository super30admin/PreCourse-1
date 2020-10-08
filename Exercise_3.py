# Any problem you faced while coding this : No
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

    # Appending data to linked list can be done by creating a new object of type ListNode and iterating over till the end of list and then assigning the the new node as next node to last node as .
    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        newNode  = ListNode(data)
        if self.head is None:
            self.head = newNode
            print("Successfully added head to linked list")
        else:
            temp = self.head
            while temp.next is not None:
                temp = temp.next
            temp.next = newNode
            print("Successfully appended data to linked list")
    
    #To search the first instance of data matching in the non-empty Linked List, first assigned a temp pointer to head and start iterating until the values of data in temp and key match.
    #Once the match is found, breeak from the loop else keep iterating.
    #If the value dont match till th end, return None
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head is None:
            print("Element not found, list is empty")
            return None
        else:
            temp = self.head
            while (temp is not None):
                if (key == temp.data):
                    print("Element found in the linked  list")
                    return temp.data
                temp = temp.next
            print("Element not found in the list")
            return None
    
    #For remove operation, there can bee 3 cases here: Remove if key matches: 1st element, mid element, last element.
    #To remove the first node if key matches, I simply make the next element as head.
    #To rmove the mid node (element after head) I simply point it to the node next to current next node.
    #To remove the ladt node, I simply point the previous node's next to None.
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp = self.head
        if self.head is None:
            return None
        if self.head.data == key:
            self.head = temp.next
        else:
            while temp.next is not None:
                if temp.next is not None and key==temp.next.data:
                    temp.next = temp.next.next
                    break
                if temp.next.next is None and key==temp.next.data:
                    temp.next = None
                    break
                temp = temp.next

    def printList(self):
        if self.head is None:
            print("Empty")
        else:
            temp = self.head
            while temp is not None:
                print(temp.data)
                temp = temp.next

sll = SinglyLinkedList()
n1 = ListNode(1)
n2 = ListNode(2)
n3 = ListNode(3)
n4 = ListNode(4)
sll.head = n1
n1.next = n2
n2.next = n3
n3.next = n4
sll.append(5)
sll.printList()
sll.find(4)
sll.remove(5)
sll.printList()



